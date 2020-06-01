package com.hss01248.beanvalidatordemo;

import java.util.HashMap;
import java.util.Map;

import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.Counter;
import io.prometheus.client.Gauge;
import io.prometheus.client.exporter.PushGateway;

/**
 * by hss
 * data:2020/6/1
 * desc:
 */
public class Reporter {


    /**
     * https://www.jianshu.com/p/5d3ea3be3122
     * Metrics类型概览
     * Metrics提供了五种基本的度量类型：
     *
     * Gauges：计量器
     * Counters：计数器
     * Histograms：直方图
     * Timers：计时器
     * Meters：TPS计数器
     */
    public static void report(){
        try{
            String url = "47.106.241.169:9091/";
            CollectorRegistry registry = new CollectorRegistry();


            Gauge guage = Gauge.build("my_custom_metric", "This is my custom metric.").create();
            guage.set(23.12);
            guage.register(registry);


            PushGateway pg = new PushGateway(url);


            Map<String, String> groupingKey = new HashMap<String, String>();
            groupingKey.put("instance", "my_instance");
            pg.pushAdd(registry, "my_job", groupingKey);


            Counter counter = Counter.build().name("counter").help("counter help").create();
            counter.inc();
            counter.register(registry);

            pg.pushAdd(registry,"counterjob");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
