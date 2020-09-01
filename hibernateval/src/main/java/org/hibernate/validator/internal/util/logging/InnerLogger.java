
package org.hibernate.validator.internal.util.logging;

import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Set;
import java.util.regex.PatternSyntaxException;
import javax.annotation.Generated;
import javax.validation.ConstraintTarget;
import javax.validation.ElementKind;
import javax.validation.Path;
import javax.xml.stream.XMLStreamException;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.Logger;


/**
 * Warning this class consists of generated code.
 *
 */
@Generated(value = "org.jboss.logging.processor.model.MessageLoggerImplementor", date = "2014-10-22T14:44:58+0200")
public class InnerLogger
        extends DelegatingBasicLogger
        implements Serializable, Log, BasicLogger
{

    private final static long serialVersionUID = 1L;
    private final static String projectCode = "HV";
    private final static String FQCN = InnerLogger.class.getName();
    private final static String getOverridingConstraintDefinitionsInMultipleMappingFilesException = "A given constraint definition can only be overridden in one mapping file. %1$s is overridden in multiple files";
    private final static String getWrongParameterTypeException = "Wrong parameter type. Expected: %1$s Actual: %2$s.";
    private final static String getErrorDuringScriptExecutionException = "Error during execution of script \"%s\" occurred.";
    private final static String getUnableToDetermineSchemaVersionException = "Unable to parse %s.";
    private final static String getInvalidReturnTypeException = "Invalid return type: %s. Should be a enumeration type.";
    private final static String getAttemptToSpecifyAnArrayWhereSingleValueIsExpectedException = "Attempt to specify an array where single value is expected.";
    private final static String getCrossParameterConstraintHasNoValidatorException = "Cross parameter constraint %1$s has no cross-parameter validator.";
    private final static String getImplicitConstraintTargetInAmbiguousConfigurationException = "The constraint %1$s used ConstraintTarget#IMPLICIT where the target cannot be inferred.";
    private final static String getMixingImplicitWithOtherExecutableTypesException = "Mixing IMPLICIT and other executable types is not allowed.";
    private final static String unableToCloseInputStream = "Unable to close input stream.";
    private final static String getMultipleCrossParameterValidatorClassesException = "The constraint '%1$s' defines multiple cross parameter validators. Only one is allowed.";
    private final static String getMissingELDependenciesException = "Unable to load 'javax.el.ExpressionFactory'. Check that you have the EL dependencies on the classpath";
    private final static String getWrongDefaultValueForGroupsParameterException = "%s contains Constraint annotation, but the groups parameter default value is not the empty array.";
    private final static String getWeightCannotBeNegativeException = "Weight cannot be negative: %d.";
    private final static String getMultipleGroupConversionsForSameSourceException = "Found multiple group conversions for source group %s: %s.";
    private final static String getNoValueProvidedForAnnotationParameterException = "No value provided for parameter '%1$s' of annotation @%2$s.";
    private final static String getPropertyNameCannotBeNullOrEmptyException = "Property name cannot be null or empty.";
    private final static String getMissingActualTypeArgumentForTypeParameterException = "Missing actual type argument for type parameter: %s.";
    private final static String getCrossParameterElementHasAlreadyBeConfiguredViaProgrammaticApiException = "Cross-parameter constraints for the method or constructor %2$s of type %1$s are declared more than once via the programmatic constraint declaration API.";
    private final static String getUnableToFindMethodException = "Type %1$s doesn't have a method %2$s.";
    private final static String getErrorDuringCallOfTraversableResolverIsCascadableException = "Call to TraversableResolver.isCascadable() threw an exception.";
    private final static String getAnnotationDoesNotContainAParameterException = "Annotation of type %1$s does not contain a parameter %2$s.";
    private final static String getScriptMustReturnTrueOrFalseException1 = "Script \"%s\" returned null, but must return either true or false.";
    private final static String getValidationAppliesToParameterMustHaveReturnTypeConstraintTargetException = "Return type of the attribute validationAppliesTo() of the constraint %s must be javax.validation.ConstraintTarget.";
    private final static String getInvalidParameterCountForExecutableException = "Wrong number of parameters. Method or constructor %1$s expects %2$d parameters, but got %3$d.";
    private final static String unableToCreateSchema = "Unable to create schema for %1$s: %2$s";
    private final static String usingTraversableResolver = "Using %s as traversable resolver.";
    private final static String usingMessageInterpolator = "Using %s as message interpolator.";
    private final static String getMinCannotBeNegativeException = "The min parameter cannot be negative.";
    private final static String getPropertyHasAlreadyBeConfiguredViaProgrammaticApiException = "Property \"%2$s\" of type %1$s is configured more than once via the programmatic constraint declaration API.";
    private final static String getMissingFormatStringInTemplateException = "Missing format string in template: %s.";
    private final static String usingValidationProvider = "Using %s as validation provider.";
    private final static String getPropertyPathMustProvideIndexOrMapKeyException = "Property path must provide index or map key.";
    private final static String getUnableToInstantiateException2 = "Unable to instantiate %1$s: %2$s.";
    private final static String getIsNotAConstraintValidatorClassException = "%s is not a constraint validator class.";
    private final static String getMethodHasAlreadyBeConfiguredViaProgrammaticApiException = "Method %2$s of type %1$s is configured more than once via the programmatic constraint declaration API.";
    private final static String getValidatorForCrossParameterConstraintMustEitherValidateObjectOrObjectArrayException = "Validator for cross-parameter constraint %s does not validate Object nor Object[].";
    private final static String getUnableToExpandGroupSequenceException = "Unable to expand group sequence.";
    private final static String getUnableToFindAnnotationParameterException = "The specified annotation defines no parameter '%s'.";
    private final static String evaluatingExpressionLanguageExpressionCausedException = "An exception occurred during evaluation of EL expression '%s'";
    private final static String getInvalidDefaultGroupSequenceDefinitionException = "Default group sequence and default group sequence provider cannot be defined at the same time.";
    private final static String getIsNotAnAnnotationException = "%s is not an annotation.";
    private final static String getBeanClassHasAlreadyBeConfiguredInXmlException = "%s is configured at least twice in xml.";
    private final static String getInvalidPropertyPathException2 = "Invalid property path. There is no property %1$s in entity %2$s.";
    private final static String getMaxCannotBeNegativeException = "The max parameter cannot be negative.";
    private final static String getValidateOnExecutionOnOverriddenOrInterfaceMethodException = "@ValidateOnExecution is not allowed on methods overriding a superclass method or implementing an interface. Check configuration for %1$s";
    private final static String getBeanDoesNotContainConstructorException = "%1$s does not contain a constructor with the parameter types %2$s.";
    private final static String getIllegalArgumentException = "%s";
    private final static String getElementTypeHasToBeFieldOrMethodException = "Element type has to be FIELD or METHOD.";
    private final static String getUnableToInstantiateTraversableResolverClassException = "Unable to instantiate traversable resolver class %s.";
    private final static String getUnableToExpandDefaultGroupListException = "Unable to expand default group list %1$s into sequence %2$s.";
    private final static String ignoringXmlConfiguration = "Ignoring XML configuration.";
    private final static String usingParameterNameProvider = "Using %s as parameter name provider.";
    private final static String getNoDefaultGroupInGroupSequenceException = "'Default.class' cannot appear in default group sequence list.";
    private final static String getParameterConfigurationAlteredInSubTypeException = "A method overriding another method must not alter the parameter constraint configuration, but method %2$s changes the configuration of %1$s.";
    private final static String getUnsupportedSchemaVersionException = "Unsupported schema version for %s: %s.";
    private final static String getInvalidLengthForFractionPartException = "The length of the fraction part cannot be negative.";
    private final static String unknownPropertyInExpressionLanguage = "EL expression '%s' references an unknown property";
    private final static String getWrongDefaultGroupSequenceProviderTypeException = "The default group sequence provider defined for %s has the wrong type";
    private final static String getConstraintWithoutMandatoryParameterException = "%2$s contains Constraint annotation, but does not contain a %1$s parameter.";
    private final static String getUnableToLoadClassException = "Unable to load class: %s.";
    private final static String getConstructorHasAlreadyBeConfiguredViaProgrammaticApiException = "Constructor %2$s of type %1$s is configured more than once via the programmatic constraint declaration API.";
    private final static String getBeanDoesNotContainTheFieldException = "%1$s does not contain the fieldType %2$s.";
    private final static String getUnableToFindAnnotationConstraintsException = "Unable to find constraints for  %s.";
    private final static String getWrongDefaultValueForPayloadParameterException = "%s contains Constraint annotation, but the payload parameter default value is not the empty array.";
    private final static String getStartIndexCannotBeNegativeException = "Start index cannot be negative: %d.";
    private final static String getParameterTypesDoNotMatchException = "The actual parameter type '%1$s' is not assignable to the expected one '%2$s' for parameter %3$d of '%4$s'";
    private final static String getUnableToCreateAnnotationForConfiguredConstraintException = "Unable to create annotation for configured constraint";
    private final static String getMethodsFromParallelTypesMustNotDefineGroupConversionsForCascadedReturnValueException = "Two methods defined in parallel types must not define group conversions for a cascaded method return value, if they are overridden by the same method, but methods %s and %s both define parameter constraints.";
    private final static String getNestedParameterException = "The message descriptor '%1$s' has nested parameters.";
    private final static String getCrossParameterConstraintOnClassException = "Cross parameter constraint %1$s is illegally placed on class level.";
    private final static String getInvalidFormatException = "Invalid format: %s.";
    private final static String getConstructorIsDefinedTwiceInMappingXmlForBeanException = "The constructor '%1$s' is defined twice in the mapping xml for bean %2$s.";
    private final static String getConstraintFactoryMustNotReturnNullException = "Constraint factory returned null when trying to create instance of %s.";
    private final static String getNoUnwrapperFoundForTypeException = "No validation value unwrapper is registered for type %1$s.";
    private final static String getMethodReturnValueMustNotBeMarkedMoreThanOnceForCascadedValidationException = "A method return value must not be marked for cascaded validation more than once in a class hierarchy, but the following two methods are marked as such: %s, %s.";
    private final static String getMethodIsDefinedTwiceInMappingXmlForBeanException = "The method '%1$s' is defined twice in the mapping xml for bean %2$s.";
    private final static String getBeanClassHasAlreadyBeConfiguredViaProgrammaticApiException = "%s is configured more than once via the programmatic constraint declaration API.";
    private final static String getCreationOfScriptExecutorFailedException = "No JSR-223 scripting engine could be bootstrapped for language \"%s\".";
    private final static String getNoValidatorFoundForTypeException = "No validator could be found for type: %s.";
    private final static String getMultipleValidatorsForSameTypeException = "The constraint '%s' defines multiple validators for the type '%s'. Only one is allowed.";
    private final static String getValidationAppliesToParameterMustHaveDefaultValueImplicitException = "Default value of the attribute validationAppliesTo() of the constraint %s must be ConstraintTarget#IMPLICIT.";
    private final static String getValidationAppliesToParameterMustNotBeDefinedForNonGenericAndCrossParameterConstraintException = "Only constraints with generic as well as cross-parameter validators must define an attribute validationAppliesTo(), but constraint %s does.";
    private final static String getWrongAttributeTypeForOverriddenConstraintException = "The overriding type of a composite constraint must be identical to the overridden one. Expected %1$s found %2$s.";
    private final static String getReturnValueHasAlreadyBeConfiguredViaProgrammaticApiException = "The return value of method or constructor %2$s of type %1$s is configured more than once via the programmatic constraint declaration API.";
    private final static String getMethodOrConstructorNotDefinedByValidatedTypeException = "The validated type %1$s does not specify the constructor/method: %2$s";
    private final static String getUnableToInstantiateException1 = "Unable to instantiate %s.";
    private final static String getExceptionOccurredDuringMessageInterpolationException = "An exception occurred during message interpolation";
    private final static String getCrossParameterConstraintOnFieldException = "Cross parameter constraint %1$s is illegally placed on field '%2$s'.";
    private final static String getIsDefinedTwiceInMappingXmlForBeanException = "%1$s is defined twice in mapping xml for bean %2$s.";
    private final static String getInvalidBigDecimalFormatException = "%s does not represent a valid BigDecimal format.";
    private final static String getInvalidCharValueException = "Invalid char value: %s.";
    private final static String getParameterConstraintsDefinedInMethodsFromParallelTypesException = "Two methods defined in parallel types must not declare parameter constraints, if they are overridden by the same method, but methods %s and %s both define parameter constraints.";
    private final static String getCharacterIsNotADigitException = "'%c' is not a digit.";
    private final static String usingConstraintFactory = "Using %s as constraint factory.";
    private final static String getUnableToAccessMemberException = "Unable to access %s.";
    private final static String getBeanDoesNotContainMethodException = "%1$s does not contain a method with the name '%2$s' and parameter types %3$s.";
    private final static String getExceptionDuringIsValidCallException = "Unexpected exception during isValid call.";
    private final static String getUnableToInstantiateValidationProviderClassException = "Unable to instantiate validation provider class %s.";
    private final static String getInvalidExecutableParameterIndexException = "Method or constructor %1$s doesn't have a parameter with index %2$d.";
    private final static String getConstraintParametersCannotStartWithValidException = "Parameters starting with 'valid' are not allowed in a constraint.";
    private final static String getInvalidRegularExpressionException = "Invalid regular expression.";
    private final static String getHasToBeABoxedTypeException = "%s has to be a auto-boxed type.";
    private final static String getInvalidRangeException = "Invalid Range: %1$d > %2$d.";
    private final static String getUnableToInstantiateParameterNameProviderClassException = "Unable to instantiate parameter name provider class %s.";
    private final static String getUnexpectedParameterValueException = "Unexpected parameter value.";
    private final static String getWrongTypeForPayloadParameterException = "%s contains Constraint annotation, but the payload parameter is of wrong type.";
    private final static String getGroupConversionOnNonCascadingElementException = "Found group conversions for non-cascading element: %s.";
    private final static String version = "Hibernate Validator %s";
    private final static String getErrorDuringCallOfTraversableResolverIsReachableException = "Call to TraversableResolver.isReachable() threw an exception.";
    private final static String getMultiplierCannotBeNegativeException = "Multiplier cannot be negative: %d.";
    private final static String getWrongPayloadClassException = "Specified payload class %s does not implement javax.validation.Payload";
    private final static String getAtLeastOneCustomMessageMustBeCreatedException = "At least one custom message must be created if the default error message gets disabled.";
    private final static String getUnableToResetXmlInputStreamException = "Unable to parse %s.";
    private final static String getSequenceDefinitionsNotAllowedException = "Sequence definitions are not allowed as composing parts of a sequence.";
    private final static String getInvalidNumberFormatException = "Invalid %s format.";
    private final static String getMoreThanOneValidatorFoundForTypeException = "There are multiple validator classes which could validate the type %1$s. The validator classes are: %2$s.";
    private final static String getUnableToOpenInputStreamForMappingFileException = "Unable to open input stream for mapping file %s.";
    private final static String getNonTerminatedParameterException = "The message descriptor '%1$s' contains an unbalanced meta character '%2$c' parameter.";
    private final static String getErrorParsingMappingFileException = "Error parsing mapping file.";
    private final static String errorInExpressionLanguage = "Error in EL expression '%s'";
    private final static String getUnableToParseValidationXmlFileException = "Unable to parse %s.";
    private final static String getConstrainedElementConfiguredMultipleTimesException = "%1$s is configured multiple times (note, <getter> and <method> nodes for the same method are not allowed)";
    private final static String getHasToBeAPrimitiveTypeException = "%s has to be a primitive type.";
    private final static String getBeanClassMustBePartOfRedefinedDefaultGroupSequenceException = "%s must be part of the redefined default group sequence.";
    private final static String getParametersOrReturnValueConstraintTargetGivenAtNonExecutableException = "The constraint %1$s used ConstraintTarget#%2$s but is not specified on a method or constructor.";
    private final static String getNullIsAnInvalidTypeForAConstraintValidatorException = "null is an invalid type for a constraint validator.";
    private final static String getInvalidIndexException = "The given index must be between %1$s and %2$s.";
    private final static String getUnableToLoadConstraintAnnotationClassException = "The specified constraint annotation class %1$s cannot be loaded.";
    private final static String getUnableToParsePropertyPathException = "Unable to parse property path %s.";
    private final static String getBeanDoesNotContainThePropertyException = "%1$s does not contain the property %2$s.";
    private final static String getUnableToRetrieveAnnotationParameterValueException = "Unable to retrieve annotation parameter value.";
    private final static String getTryingToInstantiateAnnotationWithUnknownParametersException = "Trying to instantiate %1$s with unknown parameter(s): %2$s.";
    private final static String getWrongTypeForMessageParameterException = "%s contains Constraint annotation, but the message parameter is not of type java.lang.String.";
    private final static String unableToCloseXMLFileInputStream = "Unable to close input stream for %s.";
    private final static String getUnableToGetAnnotationParameterException = "Unable to get '%1$s' from %2$s.";
    private final static String getScriptMustReturnTrueOrFalseException3 = "Script \"%1$s\" returned %2$s (of type %3$s), but must return either true or false.";
    private final static String getLengthCannotBeNegativeException = "The length cannot be negative.";
    private final static String getEndIndexCannotBeNegativeException = "End index cannot be negative: %d.";
    private final static String getParameterHasAlreadyBeConfiguredViaProgrammaticApiException = "Parameter %3$s of method or constructor %2$s of type %1$s is configured more than once via the programmatic constraint declaration API.";
    private final static String getTypeNotSupportedForUnwrappingException = "Type %s not supported for unwrapping.";
    private final static String getInvalidCheckDigitException = "A explicitly specified check digit must lie outside the interval: [%1$d, %2$d].";
    private final static String getUnableToNarrowNodeTypeException = "Unable to cast %s (with element kind %s) to %s";
    private final static String getAtLeastOneGroupHasToBeSpecifiedException = "At least one group has to be specified.";
    private final static String getUnableToFindProviderException = "Unable to find provider: %s.";
    private final static String getInvalidParameterTypeException = "Unable to load parameter of type '%1$s' in %2$s.";
    private final static String getInconsistentFailFastConfigurationException = "Inconsistent fail fast configuration. Fail fast enabled via programmatic API, but explicitly disabled via properties.";
    private final static String getInconsistentConfigurationException = "Assertion error: inconsistent ConfigurationImpl construction.";
    private final static String getInvalidJavaIdentifierException = "%s is not a valid Java Identifier.";
    private final static String getUnableToInstantiateMessageInterpolatorClassException = "Unable to instantiate message interpolator class %s.";
    private final static String getParameterNodeAddedForNonCrossParameterConstraintException = "No parameter nodes may be added since path %s doesn't refer to a cross-parameter constraint.";
    private final static String getOverriddenConstraintAttributeNotFoundException = "Overridden constraint does not define an attribute with name %s.";
    private final static String getGroupConversionForSequenceException = "Found group conversion using a group sequence as source: %s.";
    private final static String getUnableToInitializeConstraintValidatorException = "Unable to initialize %s.";
    private final static String getInvalidPropertyPathException0 = "Invalid property path.";
    private final static String getInvalidLengthOfParameterMetaDataListException = "Method or constructor %1$s has %2$s parameters, but the passed list of parameter meta data has a size of %3$s.";
    private final static String getTreatCheckAsIsNotADigitNorALetterException = "'%c' is not a digit nor a letter.";
    private final static String getMemberIsNeitherAFieldNorAMethodException = "Member %s is neither a field nor a method.";
    private final static String getUnableToInstantiateConstraintFactoryClassException = "Unable to instantiate constraint factory class %s.";
    private final static String getCyclicDependencyInGroupsDefinitionException = "Cyclic dependency in groups definition";
    private final static String getCrossParameterConstraintOnMethodWithoutParametersException = "Cross parameter constraint %1$s is illegally placed on a parameterless method or constructor '%2$s'.";
    private final static String parsingXMLFile = "%s found. Parsing XML based configuration.";
    private final static String getComposedAndComposingConstraintsHaveDifferentTypesException = "Composed and composing constraints must have the same constraint type, but composed constraint %1$s has type %3$s, while composing constraint %2$s has type %4$s.";
    private final static String getInvalidLengthForIntegerPartException = "The length of the integer part cannot be negative.";
    private final static String getWrongTypeForGroupsParameterException = "%s contains Constraint annotation, but the groups parameter is of wrong type.";
    private final static String getGenericAndCrossParameterConstraintDoesNotDefineValidationAppliesToParameterException = "Constraints with generic as well as cross-parameter validators must define an attribute validationAppliesTo(), but constraint %s doesn't.";
    private final static String getGroupHasToBeAnInterfaceException = "A group has to be an interface. %s is not.";
    private final static String getVoidMethodsMustNotBeConstrainedException = "Void methods must not be constrained or marked for cascaded validation, but method %s is.";
    private final static String getReservedParameterNamesException = "%s, %s, %s are reserved parameter names.";
    private final static String getUnableToFindPropertyWithAccessException = "The class %1$s does not have a property '%2$s' with access %3$s.";

    public InnerLogger(final Logger log) {
        super(log);
    }

    public final javax.validation.ValidationException getOverridingConstraintDefinitionsInMultipleMappingFilesException(final String constraintClass) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000167: ")+ getOverridingConstraintDefinitionsInMultipleMappingFilesException$str()), constraintClass));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getOverridingConstraintDefinitionsInMultipleMappingFilesException$str() {
        return getOverridingConstraintDefinitionsInMultipleMappingFilesException;
    }

    public final javax.validation.ValidationException getWrongParameterTypeException(final String expectedType, final String currentType) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000082: ")+ getWrongParameterTypeException$str()), expectedType, currentType));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getWrongParameterTypeException$str() {
        return getWrongParameterTypeException;
    }

    public final javax.validation.ConstraintDeclarationException getErrorDuringScriptExecutionException(final String script, final Exception e) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000023: ")+ getErrorDuringScriptExecutionException$str()), script), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getErrorDuringScriptExecutionException$str() {
        return getErrorDuringScriptExecutionException;
    }

    public final javax.validation.ValidationException getUnableToDetermineSchemaVersionException(final String file, final XMLStreamException e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000121: ")+ getUnableToDetermineSchemaVersionException$str()), file), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToDetermineSchemaVersionException$str() {
        return getUnableToDetermineSchemaVersionException;
    }

    public final javax.validation.ValidationException getInvalidReturnTypeException(final Class returnType, final ClassCastException e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000112: ")+ getInvalidReturnTypeException$str()), returnType), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidReturnTypeException$str() {
        return getInvalidReturnTypeException;
    }

    public final javax.validation.ValidationException getAttemptToSpecifyAnArrayWhereSingleValueIsExpectedException() {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000108: ")+ getAttemptToSpecifyAnArrayWhereSingleValueIsExpectedException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getAttemptToSpecifyAnArrayWhereSingleValueIsExpectedException$str() {
        return getAttemptToSpecifyAnArrayWhereSingleValueIsExpectedException;
    }

    public final javax.validation.ConstraintDefinitionException getCrossParameterConstraintHasNoValidatorException(final String constraint) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000154: ")+ getCrossParameterConstraintHasNoValidatorException$str()), constraint));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getCrossParameterConstraintHasNoValidatorException$str() {
        return getCrossParameterConstraintHasNoValidatorException;
    }

    public final javax.validation.ConstraintDeclarationException getImplicitConstraintTargetInAmbiguousConfigurationException(final String constraint) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000141: ")+ getImplicitConstraintTargetInAmbiguousConfigurationException$str()), constraint));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getImplicitConstraintTargetInAmbiguousConfigurationException$str() {
        return getImplicitConstraintTargetInAmbiguousConfigurationException;
    }

    public final IllegalArgumentException getMixingImplicitWithOtherExecutableTypesException() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000165: ")+ getMixingImplicitWithOtherExecutableTypesException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMixingImplicitWithOtherExecutableTypesException$str() {
        return getMixingImplicitWithOtherExecutableTypesException;
    }

    public final void unableToCloseInputStream() {
        super.log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000008: ")+ unableToCloseInputStream$str()));
    }

    protected String unableToCloseInputStream$str() {
        return unableToCloseInputStream;
    }

    public final javax.validation.ConstraintDefinitionException getMultipleCrossParameterValidatorClassesException(final String constraint) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000139: ")+ getMultipleCrossParameterValidatorClassesException$str()), constraint));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMultipleCrossParameterValidatorClassesException$str() {
        return getMultipleCrossParameterValidatorClassesException;
    }

    public final javax.validation.ValidationException getMissingELDependenciesException() {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000183: ")+ getMissingELDependenciesException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMissingELDependenciesException$str() {
        return getMissingELDependenciesException;
    }

    public final javax.validation.ConstraintDefinitionException getWrongDefaultValueForGroupsParameterException(final String constraintName) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000077: ")+ getWrongDefaultValueForGroupsParameterException$str()), constraintName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getWrongDefaultValueForGroupsParameterException$str() {
        return getWrongDefaultValueForGroupsParameterException;
    }

    public final IllegalArgumentException getWeightCannotBeNegativeException(final int weight) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000179: ")+ getWeightCannotBeNegativeException$str()), weight));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getWeightCannotBeNegativeException$str() {
        return getWeightCannotBeNegativeException;
    }

    public final javax.validation.ConstraintDeclarationException getMultipleGroupConversionsForSameSourceException(final Class from, final Set tos) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000124: ")+ getMultipleGroupConversionsForSameSourceException$str()), from, tos));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMultipleGroupConversionsForSameSourceException$str() {
        return getMultipleGroupConversionsForSameSourceException;
    }

    public final IllegalArgumentException getNoValueProvidedForAnnotationParameterException(final String parameterName, final String annotation) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000085: ")+ getNoValueProvidedForAnnotationParameterException$str()), parameterName, annotation));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getNoValueProvidedForAnnotationParameterException$str() {
        return getNoValueProvidedForAnnotationParameterException;
    }

    public final IllegalArgumentException getPropertyNameCannotBeNullOrEmptyException() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000087: ")+ getPropertyNameCannotBeNullOrEmptyException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getPropertyNameCannotBeNullOrEmptyException$str() {
        return getPropertyNameCannotBeNullOrEmptyException;
    }

    public final IllegalArgumentException getMissingActualTypeArgumentForTypeParameterException(final TypeVariable typeParameter) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000094: ")+ getMissingActualTypeArgumentForTypeParameterException$str()), typeParameter));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMissingActualTypeArgumentForTypeParameterException$str() {
        return getMissingActualTypeArgumentForTypeParameterException;
    }

    public final javax.validation.ValidationException getCrossParameterElementHasAlreadyBeConfiguredViaProgrammaticApiException(final String beanClassName, final String executable) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000177: ")+ getCrossParameterElementHasAlreadyBeConfiguredViaProgrammaticApiException$str()), beanClassName, executable));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getCrossParameterElementHasAlreadyBeConfiguredViaProgrammaticApiException$str() {
        return getCrossParameterElementHasAlreadyBeConfiguredViaProgrammaticApiException;
    }

    public final IllegalArgumentException getUnableToFindMethodException(final Class beanClass, final String method) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000014: ")+ getUnableToFindMethodException$str()), beanClass, method));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToFindMethodException$str() {
        return getUnableToFindMethodException;
    }

    public final javax.validation.ValidationException getErrorDuringCallOfTraversableResolverIsCascadableException(final RuntimeException e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000042: ")+ getErrorDuringCallOfTraversableResolverIsCascadableException$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getErrorDuringCallOfTraversableResolverIsCascadableException$str() {
        return getErrorDuringCallOfTraversableResolverIsCascadableException;
    }

    public final javax.validation.ValidationException getAnnotationDoesNotContainAParameterException(final String annotationClassName, final String parameterName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000107: ")+ getAnnotationDoesNotContainAParameterException$str()), annotationClassName, parameterName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getAnnotationDoesNotContainAParameterException$str() {
        return getAnnotationDoesNotContainAParameterException;
    }

    public final javax.validation.ConstraintDeclarationException getScriptMustReturnTrueOrFalseException(final String script) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000024: ")+ getScriptMustReturnTrueOrFalseException1$str()), script));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getScriptMustReturnTrueOrFalseException1$str() {
        return getScriptMustReturnTrueOrFalseException1;
    }

    public final javax.validation.ConstraintDefinitionException getValidationAppliesToParameterMustHaveReturnTypeConstraintTargetException(final String constraint) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000157: ")+ getValidationAppliesToParameterMustHaveReturnTypeConstraintTargetException$str()), constraint));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getValidationAppliesToParameterMustHaveReturnTypeConstraintTargetException$str() {
        return getValidationAppliesToParameterMustHaveReturnTypeConstraintTargetException;
    }

    public final IllegalArgumentException getInvalidParameterCountForExecutableException(final String executable, final int expectedParameterCount, final int actualParameterCount) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000181: ")+ getInvalidParameterCountForExecutableException$str()), executable, expectedParameterCount, actualParameterCount));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidParameterCountForExecutableException$str() {
        return getInvalidParameterCountForExecutableException;
    }

    public final void unableToCreateSchema(final String fileName, final String message) {
        super.log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000011: ")+ unableToCreateSchema$str()), fileName, message);
    }

    protected String unableToCreateSchema$str() {
        return unableToCreateSchema;
    }

    public final void usingTraversableResolver(final String traversableResolverClassName) {
        super.log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000005: ")+ usingTraversableResolver$str()), traversableResolverClassName);
    }

    protected String usingTraversableResolver$str() {
        return usingTraversableResolver;
    }

    public final void usingMessageInterpolator(final String messageInterpolatorClassName) {
        super.log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000004: ")+ usingMessageInterpolator$str()), messageInterpolatorClassName);
    }

    protected String usingMessageInterpolator$str() {
        return usingMessageInterpolator;
    }

    public final IllegalArgumentException getMinCannotBeNegativeException() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000019: ")+ getMinCannotBeNegativeException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMinCannotBeNegativeException$str() {
        return getMinCannotBeNegativeException;
    }

    public final javax.validation.ValidationException getPropertyHasAlreadyBeConfiguredViaProgrammaticApiException(final String beanClassName, final String propertyName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000172: ")+ getPropertyHasAlreadyBeConfiguredViaProgrammaticApiException$str()), beanClassName, propertyName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getPropertyHasAlreadyBeConfiguredViaProgrammaticApiException$str() {
        return getPropertyHasAlreadyBeConfiguredViaProgrammaticApiException;
    }

    public final javax.validation.ValidationException getMissingFormatStringInTemplateException(final String expression) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000050: ")+ getMissingFormatStringInTemplateException$str()), expression));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMissingFormatStringInTemplateException$str() {
        return getMissingFormatStringInTemplateException;
    }

    public final void usingValidationProvider(final String validationProviderClassName) {
        super.log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000006: ")+ usingValidationProvider$str()), validationProviderClassName);
    }

    protected String usingValidationProvider$str() {
        return usingValidationProvider;
    }

    public final IllegalArgumentException getPropertyPathMustProvideIndexOrMapKeyException() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000040: ")+ getPropertyPathMustProvideIndexOrMapKeyException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getPropertyPathMustProvideIndexOrMapKeyException$str() {
        return getPropertyPathMustProvideIndexOrMapKeyException;
    }

    public final javax.validation.ValidationException getUnableToInstantiateException(final String message, final Class clazz, final Exception e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000064: ")+ getUnableToInstantiateException2$str()), message, clazz), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToInstantiateException2$str() {
        return getUnableToInstantiateException2;
    }

    public final javax.validation.ValidationException getIsNotAConstraintValidatorClassException(final Class validatorClass) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000102: ")+ getIsNotAConstraintValidatorClassException$str()), validatorClass));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getIsNotAConstraintValidatorClassException$str() {
        return getIsNotAConstraintValidatorClassException;
    }

    public final javax.validation.ValidationException getMethodHasAlreadyBeConfiguredViaProgrammaticApiException(final String beanClassName, final String method) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000173: ")+ getMethodHasAlreadyBeConfiguredViaProgrammaticApiException$str()), beanClassName, method));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMethodHasAlreadyBeConfiguredViaProgrammaticApiException$str() {
        return getMethodHasAlreadyBeConfiguredViaProgrammaticApiException;
    }

    public final javax.validation.ConstraintDefinitionException getValidatorForCrossParameterConstraintMustEitherValidateObjectOrObjectArrayException(final String constraint) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000160: ")+ getValidatorForCrossParameterConstraintMustEitherValidateObjectOrObjectArrayException$str()), constraint));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getValidatorForCrossParameterConstraintMustEitherValidateObjectOrObjectArrayException$str() {
        return getValidatorForCrossParameterConstraintMustEitherValidateObjectOrObjectArrayException;
    }

    public final javax.validation.GroupDefinitionException getUnableToExpandGroupSequenceException() {
        javax.validation.GroupDefinitionException result = new javax.validation.GroupDefinitionException(String.format(((projectCode +"000048: ")+ getUnableToExpandGroupSequenceException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToExpandGroupSequenceException$str() {
        return getUnableToExpandGroupSequenceException;
    }

    public final javax.validation.ValidationException getUnableToFindAnnotationParameterException(final String parameterName, final NoSuchMethodException e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000083: ")+ getUnableToFindAnnotationParameterException$str()), parameterName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToFindAnnotationParameterException$str() {
        return getUnableToFindAnnotationParameterException;
    }

    public final void evaluatingExpressionLanguageExpressionCausedException(final String expression, final Exception e) {
        super.log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000148: ")+ evaluatingExpressionLanguageExpressionCausedException$str()), expression);
    }

    protected String evaluatingExpressionLanguageExpressionCausedException$str() {
        return evaluatingExpressionLanguageExpressionCausedException;
    }

    public final javax.validation.GroupDefinitionException getInvalidDefaultGroupSequenceDefinitionException() {
        javax.validation.GroupDefinitionException result = new javax.validation.GroupDefinitionException(String.format(((projectCode +"000052: ")+ getInvalidDefaultGroupSequenceDefinitionException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidDefaultGroupSequenceDefinitionException$str() {
        return getInvalidDefaultGroupSequenceDefinitionException;
    }

    public final javax.validation.ValidationException getIsNotAnAnnotationException(final String annotationClassName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000101: ")+ getIsNotAnAnnotationException$str()), annotationClassName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getIsNotAnAnnotationException$str() {
        return getIsNotAnAnnotationException;
    }

    public final javax.validation.ValidationException getBeanClassHasAlreadyBeConfiguredInXmlException(final String beanClassName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000103: ")+ getBeanClassHasAlreadyBeConfiguredInXmlException$str()), beanClassName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getBeanClassHasAlreadyBeConfiguredInXmlException$str() {
        return getBeanClassHasAlreadyBeConfiguredInXmlException;
    }

    public final IllegalArgumentException getInvalidPropertyPathException(final String propertyName, final String beanClassName) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000039: ")+ getInvalidPropertyPathException2$str()), propertyName, beanClassName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidPropertyPathException2$str() {
        return getInvalidPropertyPathException2;
    }

    public final IllegalArgumentException getMaxCannotBeNegativeException() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000020: ")+ getMaxCannotBeNegativeException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMaxCannotBeNegativeException$str() {
        return getMaxCannotBeNegativeException;
    }

    public final javax.validation.ValidationException getValidateOnExecutionOnOverriddenOrInterfaceMethodException(final Method m) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000166: ")+ getValidateOnExecutionOnOverriddenOrInterfaceMethodException$str()), m));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getValidateOnExecutionOnOverriddenOrInterfaceMethodException$str() {
        return getValidateOnExecutionOnOverriddenOrInterfaceMethodException;
    }

    public final javax.validation.ValidationException getBeanDoesNotContainConstructorException(final String beanClassName, final String parameterTypes) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000133: ")+ getBeanDoesNotContainConstructorException$str()), beanClassName, parameterTypes));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getBeanDoesNotContainConstructorException$str() {
        return getBeanDoesNotContainConstructorException;
    }

    public final IllegalArgumentException getIllegalArgumentException(final String message) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000116: ")+ getIllegalArgumentException$str()), message));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getIllegalArgumentException$str() {
        return getIllegalArgumentException;
    }

    public final IllegalArgumentException getElementTypeHasToBeFieldOrMethodException() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000088: ")+ getElementTypeHasToBeFieldOrMethodException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getElementTypeHasToBeFieldOrMethodException$str() {
        return getElementTypeHasToBeFieldOrMethodException;
    }

    public final javax.validation.ValidationException getUnableToInstantiateTraversableResolverClassException(final String traversableResolverClassName, final Exception e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000098: ")+ getUnableToInstantiateTraversableResolverClassException$str()), traversableResolverClassName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToInstantiateTraversableResolverClassException$str() {
        return getUnableToInstantiateTraversableResolverClassException;
    }

    public final javax.validation.GroupDefinitionException getUnableToExpandDefaultGroupListException(final List defaultGroupList, final List groupList) {
        javax.validation.GroupDefinitionException result = new javax.validation.GroupDefinitionException(String.format(((projectCode +"000043: ")+ getUnableToExpandDefaultGroupListException$str()), defaultGroupList, groupList));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToExpandDefaultGroupListException$str() {
        return getUnableToExpandDefaultGroupListException;
    }

    public final void ignoringXmlConfiguration() {
        super.log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000002: ")+ ignoringXmlConfiguration$str()));
    }

    protected String ignoringXmlConfiguration$str() {
        return ignoringXmlConfiguration;
    }

    public final void usingParameterNameProvider(final String parameterNameProviderClassName) {
        super.log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000119: ")+ usingParameterNameProvider$str()), parameterNameProviderClassName);
    }

    protected String usingParameterNameProvider$str() {
        return usingParameterNameProvider;
    }

    public final javax.validation.GroupDefinitionException getNoDefaultGroupInGroupSequenceException() {
        javax.validation.GroupDefinitionException result = new javax.validation.GroupDefinitionException(String.format(((projectCode +"000053: ")+ getNoDefaultGroupInGroupSequenceException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getNoDefaultGroupInGroupSequenceException$str() {
        return getNoDefaultGroupInGroupSequenceException;
    }

    public final javax.validation.ConstraintDeclarationException getParameterConfigurationAlteredInSubTypeException(final Member superMethod, final Member subMethod) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000151: ")+ getParameterConfigurationAlteredInSubTypeException$str()), superMethod, subMethod));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getParameterConfigurationAlteredInSubTypeException$str() {
        return getParameterConfigurationAlteredInSubTypeException;
    }

    public final javax.validation.ValidationException getUnsupportedSchemaVersionException(final String file, final String version) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000122: ")+ getUnsupportedSchemaVersionException$str()), file, version));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnsupportedSchemaVersionException$str() {
        return getUnsupportedSchemaVersionException;
    }

    public final IllegalArgumentException getInvalidLengthForFractionPartException() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000018: ")+ getInvalidLengthForFractionPartException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidLengthForFractionPartException$str() {
        return getInvalidLengthForFractionPartException;
    }

    public final void unknownPropertyInExpressionLanguage(final String expression, final Exception e) {
        super.log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000129: ")+ unknownPropertyInExpressionLanguage$str()), expression);
    }

    protected String unknownPropertyInExpressionLanguage$str() {
        return unknownPropertyInExpressionLanguage;
    }

    public final javax.validation.GroupDefinitionException getWrongDefaultGroupSequenceProviderTypeException(final String beanClassName) {
        javax.validation.GroupDefinitionException result = new javax.validation.GroupDefinitionException(String.format(((projectCode +"000055: ")+ getWrongDefaultGroupSequenceProviderTypeException$str()), beanClassName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getWrongDefaultGroupSequenceProviderTypeException$str() {
        return getWrongDefaultGroupSequenceProviderTypeException;
    }

    public final javax.validation.ConstraintDefinitionException getConstraintWithoutMandatoryParameterException(final String parameterName, final String constraintName) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000074: ")+ getConstraintWithoutMandatoryParameterException$str()), parameterName, constraintName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getConstraintWithoutMandatoryParameterException$str() {
        return getConstraintWithoutMandatoryParameterException;
    }

    public final javax.validation.ValidationException getUnableToLoadClassException(final String className, final Exception e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000065: ")+ getUnableToLoadClassException$str()), className), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToLoadClassException$str() {
        return getUnableToLoadClassException;
    }

    public final javax.validation.ValidationException getConstructorHasAlreadyBeConfiguredViaProgrammaticApiException(final String beanClassName, final String constructor) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000176: ")+ getConstructorHasAlreadyBeConfiguredViaProgrammaticApiException$str()), beanClassName, constructor));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getConstructorHasAlreadyBeConfiguredViaProgrammaticApiException$str() {
        return getConstructorHasAlreadyBeConfiguredViaProgrammaticApiException;
    }

    public final javax.validation.ValidationException getBeanDoesNotContainTheFieldException(final String beanClassName, final String fieldName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000105: ")+ getBeanDoesNotContainTheFieldException$str()), beanClassName, fieldName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getBeanDoesNotContainTheFieldException$str() {
        return getBeanDoesNotContainTheFieldException;
    }

    public final javax.validation.ValidationException getUnableToFindAnnotationConstraintsException(final Class annotationClass) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000057: ")+ getUnableToFindAnnotationConstraintsException$str()), annotationClass));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToFindAnnotationConstraintsException$str() {
        return getUnableToFindAnnotationConstraintsException;
    }

    public final javax.validation.ConstraintDefinitionException getWrongDefaultValueForPayloadParameterException(final String constraintName) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000075: ")+ getWrongDefaultValueForPayloadParameterException$str()), constraintName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getWrongDefaultValueForPayloadParameterException$str() {
        return getWrongDefaultValueForPayloadParameterException;
    }

    public final IllegalArgumentException getStartIndexCannotBeNegativeException(final int startIndex) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000068: ")+ getStartIndexCannotBeNegativeException$str()), startIndex));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getStartIndexCannotBeNegativeException$str() {
        return getStartIndexCannotBeNegativeException;
    }

    public final IllegalArgumentException getParameterTypesDoNotMatchException(final String actualType, final String expectedType, final int index, final Member member) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000163: ")+ getParameterTypesDoNotMatchException$str()), actualType, expectedType, index, member));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getParameterTypesDoNotMatchException$str() {
        return getParameterTypesDoNotMatchException;
    }

    public final javax.validation.ValidationException getUnableToCreateAnnotationForConfiguredConstraintException(final RuntimeException e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000012: ")+ getUnableToCreateAnnotationForConfiguredConstraintException$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToCreateAnnotationForConfiguredConstraintException$str() {
        return getUnableToCreateAnnotationForConfiguredConstraintException;
    }

    public final javax.validation.ConstraintDeclarationException getMethodsFromParallelTypesMustNotDefineGroupConversionsForCascadedReturnValueException(final Member method1, final Member method2) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000161: ")+ getMethodsFromParallelTypesMustNotDefineGroupConversionsForCascadedReturnValueException$str()), method1, method2));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMethodsFromParallelTypesMustNotDefineGroupConversionsForCascadedReturnValueException$str() {
        return getMethodsFromParallelTypesMustNotDefineGroupConversionsForCascadedReturnValueException;
    }

    public final org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException getNestedParameterException(final String messageDescriptor) {
        org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException result = new org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException(String.format(((projectCode +"000169: ")+ getNestedParameterException$str()), messageDescriptor));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getNestedParameterException$str() {
        return getNestedParameterException;
    }

    public final javax.validation.ConstraintDeclarationException getCrossParameterConstraintOnClassException(final String constraint) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000143: ")+ getCrossParameterConstraintOnClassException$str()), constraint));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getCrossParameterConstraintOnClassException$str() {
        return getCrossParameterConstraintOnClassException;
    }

    public final javax.validation.ValidationException getInvalidFormatException(final String message, final IllegalFormatException e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000051: ")+ getInvalidFormatException$str()), message), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidFormatException$str() {
        return getInvalidFormatException;
    }

    public final javax.validation.ValidationException getConstructorIsDefinedTwiceInMappingXmlForBeanException(final String name, final String beanClassName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000138: ")+ getConstructorIsDefinedTwiceInMappingXmlForBeanException$str()), name, beanClassName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getConstructorIsDefinedTwiceInMappingXmlForBeanException$str() {
        return getConstructorIsDefinedTwiceInMappingXmlForBeanException;
    }

    public final javax.validation.ValidationException getUnableToLoadClassException(final String className) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000065: ")+ getUnableToLoadClassException$str()), className));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    public final javax.validation.ValidationException getConstraintFactoryMustNotReturnNullException(final String validatorClassName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000029: ")+ getConstraintFactoryMustNotReturnNullException$str()), validatorClassName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getConstraintFactoryMustNotReturnNullException$str() {
        return getConstraintFactoryMustNotReturnNullException;
    }

    public final javax.validation.ValidationException getNoUnwrapperFoundForTypeException(final String typeName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000182: ")+ getNoUnwrapperFoundForTypeException$str()), typeName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getNoUnwrapperFoundForTypeException$str() {
        return getNoUnwrapperFoundForTypeException;
    }

    public final javax.validation.ConstraintDeclarationException getMethodReturnValueMustNotBeMarkedMoreThanOnceForCascadedValidationException(final Member member1, final Member member2) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000131: ")+ getMethodReturnValueMustNotBeMarkedMoreThanOnceForCascadedValidationException$str()), member1, member2));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMethodReturnValueMustNotBeMarkedMoreThanOnceForCascadedValidationException$str() {
        return getMethodReturnValueMustNotBeMarkedMoreThanOnceForCascadedValidationException;
    }

    public final javax.validation.ValidationException getMethodIsDefinedTwiceInMappingXmlForBeanException(final String name, final String beanClassName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000137: ")+ getMethodIsDefinedTwiceInMappingXmlForBeanException$str()), name, beanClassName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMethodIsDefinedTwiceInMappingXmlForBeanException$str() {
        return getMethodIsDefinedTwiceInMappingXmlForBeanException;
    }

    public final javax.validation.ValidationException getBeanClassHasAlreadyBeConfiguredViaProgrammaticApiException(final String beanClassName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000171: ")+ getBeanClassHasAlreadyBeConfiguredViaProgrammaticApiException$str()), beanClassName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getBeanClassHasAlreadyBeConfiguredViaProgrammaticApiException$str() {
        return getBeanClassHasAlreadyBeConfiguredViaProgrammaticApiException;
    }

    public final javax.validation.ConstraintDeclarationException getCreationOfScriptExecutorFailedException(final String languageName, final Exception e) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000170: ")+ getCreationOfScriptExecutorFailedException$str()), languageName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getCreationOfScriptExecutorFailedException$str() {
        return getCreationOfScriptExecutorFailedException;
    }

    public final javax.validation.UnexpectedTypeException getNoValidatorFoundForTypeException(final String className) {
        javax.validation.UnexpectedTypeException result = new javax.validation.UnexpectedTypeException(String.format(((projectCode +"000030: ")+ getNoValidatorFoundForTypeException$str()), className));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getNoValidatorFoundForTypeException$str() {
        return getNoValidatorFoundForTypeException;
    }

    public final javax.validation.UnexpectedTypeException getMultipleValidatorsForSameTypeException(final String constraint, final String type) {
        javax.validation.UnexpectedTypeException result = new javax.validation.UnexpectedTypeException(String.format(((projectCode +"000150: ")+ getMultipleValidatorsForSameTypeException$str()), constraint, type));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMultipleValidatorsForSameTypeException$str() {
        return getMultipleValidatorsForSameTypeException;
    }

    public final javax.validation.ConstraintDefinitionException getValidationAppliesToParameterMustHaveDefaultValueImplicitException(final String constraint) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000158: ")+ getValidationAppliesToParameterMustHaveDefaultValueImplicitException$str()), constraint));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getValidationAppliesToParameterMustHaveDefaultValueImplicitException$str() {
        return getValidationAppliesToParameterMustHaveDefaultValueImplicitException;
    }

    public final javax.validation.ConstraintDefinitionException getValidationAppliesToParameterMustNotBeDefinedForNonGenericAndCrossParameterConstraintException(final String constraint) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000159: ")+ getValidationAppliesToParameterMustNotBeDefinedForNonGenericAndCrossParameterConstraintException$str()), constraint));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getValidationAppliesToParameterMustNotBeDefinedForNonGenericAndCrossParameterConstraintException$str() {
        return getValidationAppliesToParameterMustNotBeDefinedForNonGenericAndCrossParameterConstraintException;
    }

    public final javax.validation.ConstraintDefinitionException getWrongAttributeTypeForOverriddenConstraintException(final String expectedReturnType, final Class currentReturnType) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000081: ")+ getWrongAttributeTypeForOverriddenConstraintException$str()), expectedReturnType, currentReturnType));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getWrongAttributeTypeForOverriddenConstraintException$str() {
        return getWrongAttributeTypeForOverriddenConstraintException;
    }

    public final javax.validation.ValidationException getReturnValueHasAlreadyBeConfiguredViaProgrammaticApiException(final String beanClassName, final String executable) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000175: ")+ getReturnValueHasAlreadyBeConfiguredViaProgrammaticApiException$str()), beanClassName, executable));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getReturnValueHasAlreadyBeConfiguredViaProgrammaticApiException$str() {
        return getReturnValueHasAlreadyBeConfiguredViaProgrammaticApiException;
    }

    public final IllegalArgumentException getMethodOrConstructorNotDefinedByValidatedTypeException(final String validatedTypeName, final Member member) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000162: ")+ getMethodOrConstructorNotDefinedByValidatedTypeException$str()), validatedTypeName, member));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMethodOrConstructorNotDefinedByValidatedTypeException$str() {
        return getMethodOrConstructorNotDefinedByValidatedTypeException;
    }

    public final javax.validation.ValidationException getUnableToInstantiateException(final Class clazz, final Exception e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000063: ")+ getUnableToInstantiateException1$str()), clazz), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToInstantiateException1$str() {
        return getUnableToInstantiateException1;
    }

    public final javax.validation.ValidationException getExceptionOccurredDuringMessageInterpolationException(final Exception e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000149: ")+ getExceptionOccurredDuringMessageInterpolationException$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getExceptionOccurredDuringMessageInterpolationException$str() {
        return getExceptionOccurredDuringMessageInterpolationException;
    }

    public final javax.validation.ConstraintDeclarationException getCrossParameterConstraintOnFieldException(final String constraint, final String field) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000144: ")+ getCrossParameterConstraintOnFieldException$str()), constraint, field));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getCrossParameterConstraintOnFieldException$str() {
        return getCrossParameterConstraintOnFieldException;
    }

    public final javax.validation.ValidationException getIsDefinedTwiceInMappingXmlForBeanException(final String name, final String beanClassName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000104: ")+ getIsDefinedTwiceInMappingXmlForBeanException$str()), name, beanClassName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getIsDefinedTwiceInMappingXmlForBeanException$str() {
        return getIsDefinedTwiceInMappingXmlForBeanException;
    }

    public final IllegalArgumentException getInvalidBigDecimalFormatException(final String value, final NumberFormatException e) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000016: ")+ getInvalidBigDecimalFormatException$str()), value), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidBigDecimalFormatException$str() {
        return getInvalidBigDecimalFormatException;
    }

    public final javax.validation.ValidationException getInvalidCharValueException(final String value) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000111: ")+ getInvalidCharValueException$str()), value));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidCharValueException$str() {
        return getInvalidCharValueException;
    }

    public final javax.validation.ConstraintDeclarationException getParameterConstraintsDefinedInMethodsFromParallelTypesException(final Member method1, final Member method2) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000152: ")+ getParameterConstraintsDefinedInMethodsFromParallelTypesException$str()), method1, method2));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getParameterConstraintsDefinedInMethodsFromParallelTypesException$str() {
        return getParameterConstraintsDefinedInMethodsFromParallelTypesException;
    }

    public final NumberFormatException getCharacterIsNotADigitException(final char c) {
        NumberFormatException result = new NumberFormatException(String.format(((projectCode +"000072: ")+ getCharacterIsNotADigitException$str()), c));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getCharacterIsNotADigitException$str() {
        return getCharacterIsNotADigitException;
    }

    public final void usingConstraintFactory(final String constraintFactoryClassName) {
        super.log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000003: ")+ usingConstraintFactory$str()), constraintFactoryClassName);
    }

    protected String usingConstraintFactory$str() {
        return usingConstraintFactory;
    }

    public final javax.validation.ValidationException getUnableToAccessMemberException(final String memberName, final Exception e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000090: ")+ getUnableToAccessMemberException$str()), memberName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToAccessMemberException$str() {
        return getUnableToAccessMemberException;
    }

    public final javax.validation.ValidationException getBeanDoesNotContainMethodException(final String beanClassName, final String methodName, final List parameterTypes) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000135: ")+ getBeanDoesNotContainMethodException$str()), beanClassName, methodName, parameterTypes));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getBeanDoesNotContainMethodException$str() {
        return getBeanDoesNotContainMethodException;
    }

    public final javax.validation.ValidationException getExceptionDuringIsValidCallException(final RuntimeException e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000028: ")+ getExceptionDuringIsValidCallException$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getExceptionDuringIsValidCallException$str() {
        return getExceptionDuringIsValidCallException;
    }

    public final javax.validation.ValidationException getUnableToInstantiateValidationProviderClassException(final String providerClassName, final Exception e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000099: ")+ getUnableToInstantiateValidationProviderClassException$str()), providerClassName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToInstantiateValidationProviderClassException$str() {
        return getUnableToInstantiateValidationProviderClassException;
    }

    public final IllegalArgumentException getInvalidExecutableParameterIndexException(final String executable, final int index) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000056: ")+ getInvalidExecutableParameterIndexException$str()), executable, index));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidExecutableParameterIndexException$str() {
        return getInvalidExecutableParameterIndexException;
    }

    public final javax.validation.ConstraintDefinitionException getConstraintParametersCannotStartWithValidException() {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000073: ")+ getConstraintParametersCannotStartWithValidException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getConstraintParametersCannotStartWithValidException$str() {
        return getConstraintParametersCannotStartWithValidException;
    }

    public final IllegalArgumentException getInvalidRegularExpressionException(final PatternSyntaxException e) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000022: ")+ getInvalidRegularExpressionException$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidRegularExpressionException$str() {
        return getInvalidRegularExpressionException;
    }

    public final IllegalArgumentException getHasToBeABoxedTypeException(final Class clazz) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000164: ")+ getHasToBeABoxedTypeException$str()), clazz));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getHasToBeABoxedTypeException$str() {
        return getHasToBeABoxedTypeException;
    }

    public final IllegalArgumentException getInvalidRangeException(final int startIndex, final int endIndex) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000070: ")+ getInvalidRangeException$str()), startIndex, endIndex));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidRangeException$str() {
        return getInvalidRangeException;
    }

    public final javax.validation.ValidationException getUnableToInstantiateParameterNameProviderClassException(final String parameterNameProviderClassName, final javax.validation.ValidationException e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000120: ")+ getUnableToInstantiateParameterNameProviderClassException$str()), parameterNameProviderClassName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToInstantiateParameterNameProviderClassException$str() {
        return getUnableToInstantiateParameterNameProviderClassException;
    }

    public final javax.validation.ValidationException getUnexpectedParameterValueException(final ClassCastException e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000109: ")+ getUnexpectedParameterValueException$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnexpectedParameterValueException$str() {
        return getUnexpectedParameterValueException;
    }

    public final javax.validation.ConstraintDefinitionException getWrongTypeForPayloadParameterException(final String constraintName, final ClassCastException e) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000076: ")+ getWrongTypeForPayloadParameterException$str()), constraintName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getWrongTypeForPayloadParameterException$str() {
        return getWrongTypeForPayloadParameterException;
    }

    public final javax.validation.ConstraintDeclarationException getGroupConversionOnNonCascadingElementException(final String location) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000125: ")+ getGroupConversionOnNonCascadingElementException$str()), location));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getGroupConversionOnNonCascadingElementException$str() {
        return getGroupConversionOnNonCascadingElementException;
    }

    public final void version(final String version) {
        super.log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000001: ")+ version$str()), version);
    }

    protected String version$str() {
        return version;
    }

    public final javax.validation.ValidationException getErrorDuringCallOfTraversableResolverIsReachableException(final RuntimeException e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000041: ")+ getErrorDuringCallOfTraversableResolverIsReachableException$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getErrorDuringCallOfTraversableResolverIsReachableException$str() {
        return getErrorDuringCallOfTraversableResolverIsReachableException;
    }

    public final IllegalArgumentException getMultiplierCannotBeNegativeException(final int multiplier) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000178: ")+ getMultiplierCannotBeNegativeException$str()), multiplier));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMultiplierCannotBeNegativeException$str() {
        return getMultiplierCannotBeNegativeException;
    }

    public final javax.validation.ValidationException getWrongPayloadClassException(final String payloadClassName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000114: ")+ getWrongPayloadClassException$str()), payloadClassName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getWrongPayloadClassException$str() {
        return getWrongPayloadClassException;
    }

    public final javax.validation.ValidationException getAtLeastOneCustomMessageMustBeCreatedException() {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000033: ")+ getAtLeastOneCustomMessageMustBeCreatedException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getAtLeastOneCustomMessageMustBeCreatedException$str() {
        return getAtLeastOneCustomMessageMustBeCreatedException;
    }

    public final javax.validation.ValidationException getUnableToResetXmlInputStreamException(final String file, final IOException e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000123: ")+ getUnableToResetXmlInputStreamException$str()), file), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToResetXmlInputStreamException$str() {
        return getUnableToResetXmlInputStreamException;
    }

    public final javax.validation.GroupDefinitionException getSequenceDefinitionsNotAllowedException() {
        javax.validation.GroupDefinitionException result = new javax.validation.GroupDefinitionException(String.format(((projectCode +"000046: ")+ getSequenceDefinitionsNotAllowedException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getSequenceDefinitionsNotAllowedException$str() {
        return getSequenceDefinitionsNotAllowedException;
    }

    public final javax.validation.ValidationException getInvalidNumberFormatException(final String formatName, final NumberFormatException e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000110: ")+ getInvalidNumberFormatException$str()), formatName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidNumberFormatException$str() {
        return getInvalidNumberFormatException;
    }

    public final javax.validation.UnexpectedTypeException getMoreThanOneValidatorFoundForTypeException(final Type type, final String validatorClasses) {
        javax.validation.UnexpectedTypeException result = new javax.validation.UnexpectedTypeException(String.format(((projectCode +"000031: ")+ getMoreThanOneValidatorFoundForTypeException$str()), type, validatorClasses));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMoreThanOneValidatorFoundForTypeException$str() {
        return getMoreThanOneValidatorFoundForTypeException;
    }

    public final javax.validation.ValidationException getUnableToOpenInputStreamForMappingFileException(final String mappingFileName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000096: ")+ getUnableToOpenInputStreamForMappingFileException$str()), mappingFileName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToOpenInputStreamForMappingFileException$str() {
        return getUnableToOpenInputStreamForMappingFileException;
    }

    public final org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException getNonTerminatedParameterException(final String messageDescriptor, final char character) {
        org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException result = new org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException(String.format(((projectCode +"000168: ")+ getNonTerminatedParameterException$str()), messageDescriptor, character));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getNonTerminatedParameterException$str() {
        return getNonTerminatedParameterException;
    }

    public final javax.validation.ValidationException getErrorParsingMappingFileException(final Exception e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000115: ")+ getErrorParsingMappingFileException$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getErrorParsingMappingFileException$str() {
        return getErrorParsingMappingFileException;
    }

    public final void errorInExpressionLanguage(final String expression, final Exception e) {
        super.log.logf(FQCN, (Logger.Level.WARN), (e), ((projectCode +"000130: ")+ errorInExpressionLanguage$str()), expression);
    }

    protected String errorInExpressionLanguage$str() {
        return errorInExpressionLanguage;
    }

    public final javax.validation.ValidationException getUnableToParseValidationXmlFileException(final String file, final Exception e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000100: ")+ getUnableToParseValidationXmlFileException$str()), file), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToParseValidationXmlFileException$str() {
        return getUnableToParseValidationXmlFileException;
    }

    public final javax.validation.ValidationException getConstrainedElementConfiguredMultipleTimesException(final String location) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000147: ")+ getConstrainedElementConfiguredMultipleTimesException$str()), location));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getConstrainedElementConfiguredMultipleTimesException$str() {
        return getConstrainedElementConfiguredMultipleTimesException;
    }

    public final javax.validation.ValidationException getUnexpectedParameterValueException() {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000109: ")+ getUnexpectedParameterValueException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    public final IllegalArgumentException getHasToBeAPrimitiveTypeException(final Class clazz) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000091: ")+ getHasToBeAPrimitiveTypeException$str()), clazz));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getHasToBeAPrimitiveTypeException$str() {
        return getHasToBeAPrimitiveTypeException;
    }

    public final javax.validation.GroupDefinitionException getBeanClassMustBePartOfRedefinedDefaultGroupSequenceException(final String beanClassName) {
        javax.validation.GroupDefinitionException result = new javax.validation.GroupDefinitionException(String.format(((projectCode +"000054: ")+ getBeanClassMustBePartOfRedefinedDefaultGroupSequenceException$str()), beanClassName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getBeanClassMustBePartOfRedefinedDefaultGroupSequenceException$str() {
        return getBeanClassMustBePartOfRedefinedDefaultGroupSequenceException;
    }

    public final javax.validation.ConstraintDeclarationException getParametersOrReturnValueConstraintTargetGivenAtNonExecutableException(final String constraint, final ConstraintTarget target) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000153: ")+ getParametersOrReturnValueConstraintTargetGivenAtNonExecutableException$str()), constraint, target));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getParametersOrReturnValueConstraintTargetGivenAtNonExecutableException$str() {
        return getParametersOrReturnValueConstraintTargetGivenAtNonExecutableException;
    }

    public final javax.validation.ValidationException getNullIsAnInvalidTypeForAConstraintValidatorException() {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000093: ")+ getNullIsAnInvalidTypeForAConstraintValidatorException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getNullIsAnInvalidTypeForAConstraintValidatorException$str() {
        return getNullIsAnInvalidTypeForAConstraintValidatorException;
    }

    public final IndexOutOfBoundsException getInvalidIndexException(final String lowerBound, final String upperBound) {
        IndexOutOfBoundsException result = new IndexOutOfBoundsException(String.format(((projectCode +"000049: ")+ getInvalidIndexException$str()), lowerBound, upperBound));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidIndexException$str() {
        return getInvalidIndexException;
    }

    public final javax.validation.ValidationException getUnableToLoadConstraintAnnotationClassException(final String constraintAnnotationClass, final Exception e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000136: ")+ getUnableToLoadConstraintAnnotationClassException$str()), constraintAnnotationClass), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToLoadConstraintAnnotationClassException$str() {
        return getUnableToLoadConstraintAnnotationClassException;
    }

    public final IllegalArgumentException getUnableToParsePropertyPathException(final String propertyPath) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000035: ")+ getUnableToParsePropertyPathException$str()), propertyPath));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToParsePropertyPathException$str() {
        return getUnableToParsePropertyPathException;
    }

    public final javax.validation.ValidationException getBeanDoesNotContainThePropertyException(final String beanClassName, final String getterName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000106: ")+ getBeanDoesNotContainThePropertyException$str()), beanClassName, getterName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getBeanDoesNotContainThePropertyException$str() {
        return getBeanDoesNotContainThePropertyException;
    }

    public final javax.validation.ValidationException getUnableToRetrieveAnnotationParameterValueException(final Exception e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000059: ")+ getUnableToRetrieveAnnotationParameterValueException$str())), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToRetrieveAnnotationParameterValueException$str() {
        return getUnableToRetrieveAnnotationParameterValueException;
    }

    public final RuntimeException getTryingToInstantiateAnnotationWithUnknownParametersException(final Class annotationType, final Set unknownParameters) {
        RuntimeException result = new RuntimeException(String.format(((projectCode +"000086: ")+ getTryingToInstantiateAnnotationWithUnknownParametersException$str()), annotationType, unknownParameters));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getTryingToInstantiateAnnotationWithUnknownParametersException$str() {
        return getTryingToInstantiateAnnotationWithUnknownParametersException;
    }

    public final javax.validation.ConstraintDefinitionException getWrongTypeForMessageParameterException(final String constraintName) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000079: ")+ getWrongTypeForMessageParameterException$str()), constraintName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getWrongTypeForMessageParameterException$str() {
        return getWrongTypeForMessageParameterException;
    }

    public final void unableToCloseXMLFileInputStream(final String fileName) {
        super.log.logf(FQCN, (Logger.Level.WARN), null, ((projectCode +"000010: ")+ unableToCloseXMLFileInputStream$str()), fileName);
    }

    protected String unableToCloseXMLFileInputStream$str() {
        return unableToCloseXMLFileInputStream;
    }

    public final javax.validation.ValidationException getUnableToGetAnnotationParameterException(final String parameterName, final String annotationName, final Exception e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000084: ")+ getUnableToGetAnnotationParameterException$str()), parameterName, annotationName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToGetAnnotationParameterException$str() {
        return getUnableToGetAnnotationParameterException;
    }

    public final javax.validation.ConstraintDeclarationException getScriptMustReturnTrueOrFalseException(final String script, final Object executionResult, final String type) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000025: ")+ getScriptMustReturnTrueOrFalseException3$str()), script, executionResult, type));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getScriptMustReturnTrueOrFalseException3$str() {
        return getScriptMustReturnTrueOrFalseException3;
    }

    public final IllegalArgumentException getLengthCannotBeNegativeException() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000021: ")+ getLengthCannotBeNegativeException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getLengthCannotBeNegativeException$str() {
        return getLengthCannotBeNegativeException;
    }

    public final IllegalArgumentException getEndIndexCannotBeNegativeException(final int endIndex) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000069: ")+ getEndIndexCannotBeNegativeException$str()), endIndex));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getEndIndexCannotBeNegativeException$str() {
        return getEndIndexCannotBeNegativeException;
    }

    public final javax.validation.ValidationException getParameterHasAlreadyBeConfiguredViaProgrammaticApiException(final String beanClassName, final String executable, final int parameterIndex) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000174: ")+ getParameterHasAlreadyBeConfiguredViaProgrammaticApiException$str()), beanClassName, executable, parameterIndex));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getParameterHasAlreadyBeConfiguredViaProgrammaticApiException$str() {
        return getParameterHasAlreadyBeConfiguredViaProgrammaticApiException;
    }

    public final javax.validation.ValidationException getTypeNotSupportedForUnwrappingException(final Class type) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000036: ")+ getTypeNotSupportedForUnwrappingException$str()), type));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getTypeNotSupportedForUnwrappingException$str() {
        return getTypeNotSupportedForUnwrappingException;
    }

    public final IllegalArgumentException getInvalidCheckDigitException(final int startIndex, final int endIndex) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000071: ")+ getInvalidCheckDigitException$str()), startIndex, endIndex));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidCheckDigitException$str() {
        return getInvalidCheckDigitException;
    }

    public final ClassCastException getUnableToNarrowNodeTypeException(final String actualDescriptorType, final ElementKind kind, final String expectedDescriptorType) {
        ClassCastException result = new ClassCastException(String.format(((projectCode +"000118: ")+ getUnableToNarrowNodeTypeException$str()), actualDescriptorType, kind, expectedDescriptorType));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToNarrowNodeTypeException$str() {
        return getUnableToNarrowNodeTypeException;
    }

    public final IllegalArgumentException getAtLeastOneGroupHasToBeSpecifiedException() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000044: ")+ getAtLeastOneGroupHasToBeSpecifiedException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getAtLeastOneGroupHasToBeSpecifiedException$str() {
        return getAtLeastOneGroupHasToBeSpecifiedException;
    }

    public final javax.validation.ValidationException getUnableToFindProviderException(final Class providerClass) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000027: ")+ getUnableToFindProviderException$str()), providerClass));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToFindProviderException$str() {
        return getUnableToFindProviderException;
    }

    public final javax.validation.ValidationException getInvalidParameterTypeException(final String type, final String beanClassName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000134: ")+ getInvalidParameterTypeException$str()), type, beanClassName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidParameterTypeException$str() {
        return getInvalidParameterTypeException;
    }

    public final javax.validation.ValidationException getInconsistentFailFastConfigurationException() {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000037: ")+ getInconsistentFailFastConfigurationException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInconsistentFailFastConfigurationException$str() {
        return getInconsistentFailFastConfigurationException;
    }

    public final javax.validation.ValidationException getInconsistentConfigurationException() {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000026: ")+ getInconsistentConfigurationException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInconsistentConfigurationException$str() {
        return getInconsistentConfigurationException;
    }

    public final IllegalArgumentException getInvalidJavaIdentifierException(final String identifier) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000034: ")+ getInvalidJavaIdentifierException$str()), identifier));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidJavaIdentifierException$str() {
        return getInvalidJavaIdentifierException;
    }

    public final javax.validation.ValidationException getUnableToInstantiateMessageInterpolatorClassException(final String messageInterpolatorClassName, final Exception e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000097: ")+ getUnableToInstantiateMessageInterpolatorClassException$str()), messageInterpolatorClassName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToInstantiateMessageInterpolatorClassException$str() {
        return getUnableToInstantiateMessageInterpolatorClassException;
    }

    public final IllegalStateException getParameterNodeAddedForNonCrossParameterConstraintException(final Path path) {
        IllegalStateException result = new IllegalStateException(String.format(((projectCode +"000146: ")+ getParameterNodeAddedForNonCrossParameterConstraintException$str()), path));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getParameterNodeAddedForNonCrossParameterConstraintException$str() {
        return getParameterNodeAddedForNonCrossParameterConstraintException;
    }

    public final javax.validation.ConstraintDefinitionException getOverriddenConstraintAttributeNotFoundException(final String attributeName) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000080: ")+ getOverriddenConstraintAttributeNotFoundException$str()), attributeName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getOverriddenConstraintAttributeNotFoundException$str() {
        return getOverriddenConstraintAttributeNotFoundException;
    }

    public final javax.validation.ConstraintDeclarationException getGroupConversionForSequenceException(final Class from) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000127: ")+ getGroupConversionForSequenceException$str()), from));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getGroupConversionForSequenceException$str() {
        return getGroupConversionForSequenceException;
    }

    public final javax.validation.ValidationException getUnableToInitializeConstraintValidatorException(final String validatorClassName, final RuntimeException e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000032: ")+ getUnableToInitializeConstraintValidatorException$str()), validatorClassName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToInitializeConstraintValidatorException$str() {
        return getUnableToInitializeConstraintValidatorException;
    }

    public final IllegalArgumentException getInvalidPropertyPathException() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000038: ")+ getInvalidPropertyPathException0$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidPropertyPathException0$str() {
        return getInvalidPropertyPathException0;
    }

    public final IllegalArgumentException getInvalidLengthOfParameterMetaDataListException(final String executableName, final int nbParameters, final int listSize) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000062: ")+ getInvalidLengthOfParameterMetaDataListException$str()), executableName, nbParameters, listSize));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidLengthOfParameterMetaDataListException$str() {
        return getInvalidLengthOfParameterMetaDataListException;
    }

    public final IllegalArgumentException getTreatCheckAsIsNotADigitNorALetterException(final int weight) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000180: ")+ getTreatCheckAsIsNotADigitNorALetterException$str()), weight));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getTreatCheckAsIsNotADigitNorALetterException$str() {
        return getTreatCheckAsIsNotADigitNorALetterException;
    }

    public final IllegalArgumentException getMemberIsNeitherAFieldNorAMethodException(final Member member) {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000089: ")+ getMemberIsNeitherAFieldNorAMethodException$str()), member));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getMemberIsNeitherAFieldNorAMethodException$str() {
        return getMemberIsNeitherAFieldNorAMethodException;
    }

    public final javax.validation.ValidationException getUnableToInstantiateConstraintFactoryClassException(final String constraintFactoryClassName, final javax.validation.ValidationException e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000095: ")+ getUnableToInstantiateConstraintFactoryClassException$str()), constraintFactoryClassName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToInstantiateConstraintFactoryClassException$str() {
        return getUnableToInstantiateConstraintFactoryClassException;
    }

    public final javax.validation.GroupDefinitionException getCyclicDependencyInGroupsDefinitionException() {
        javax.validation.GroupDefinitionException result = new javax.validation.GroupDefinitionException(String.format(((projectCode +"000047: ")+ getCyclicDependencyInGroupsDefinitionException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getCyclicDependencyInGroupsDefinitionException$str() {
        return getCyclicDependencyInGroupsDefinitionException;
    }

    public final javax.validation.ValidationException getUnableToInstantiateException(final String className, final Exception e) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000063: ")+ getUnableToInstantiateException1$str()), className), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    public final javax.validation.ConstraintDeclarationException getCrossParameterConstraintOnMethodWithoutParametersException(final String constraint, final String member) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000142: ")+ getCrossParameterConstraintOnMethodWithoutParametersException$str()), constraint, member));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getCrossParameterConstraintOnMethodWithoutParametersException$str() {
        return getCrossParameterConstraintOnMethodWithoutParametersException;
    }

    public final void parsingXMLFile(final String fileName) {
        super.log.logf(FQCN, (Logger.Level.INFO), null, ((projectCode +"000007: ")+ parsingXMLFile$str()), fileName);
    }

    protected String parsingXMLFile$str() {
        return parsingXMLFile;
    }

    public final javax.validation.ConstraintDefinitionException getComposedAndComposingConstraintsHaveDifferentTypesException(final String composedConstraintTypeName, final String composingConstraintTypeName, final org.hibernate.validator.internal.metadata.descriptor.ConstraintDescriptorImpl.ConstraintType composedConstraintType, final org.hibernate.validator.internal.metadata.descriptor.ConstraintDescriptorImpl.ConstraintType composingConstraintType) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000155: ")+ getComposedAndComposingConstraintsHaveDifferentTypesException$str()), composedConstraintTypeName, composingConstraintTypeName, composedConstraintType, composingConstraintType));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getComposedAndComposingConstraintsHaveDifferentTypesException$str() {
        return getComposedAndComposingConstraintsHaveDifferentTypesException;
    }

    public final IllegalArgumentException getInvalidLengthForIntegerPartException() {
        IllegalArgumentException result = new IllegalArgumentException(String.format(((projectCode +"000017: ")+ getInvalidLengthForIntegerPartException$str())));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getInvalidLengthForIntegerPartException$str() {
        return getInvalidLengthForIntegerPartException;
    }

    public final javax.validation.ConstraintDefinitionException getWrongTypeForGroupsParameterException(final String constraintName, final ClassCastException e) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000078: ")+ getWrongTypeForGroupsParameterException$str()), constraintName), e);
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getWrongTypeForGroupsParameterException$str() {
        return getWrongTypeForGroupsParameterException;
    }

    public final javax.validation.ConstraintDefinitionException getGenericAndCrossParameterConstraintDoesNotDefineValidationAppliesToParameterException(final String constraint) {
        javax.validation.ConstraintDefinitionException result = new javax.validation.ConstraintDefinitionException(String.format(((projectCode +"000156: ")+ getGenericAndCrossParameterConstraintDoesNotDefineValidationAppliesToParameterException$str()), constraint));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getGenericAndCrossParameterConstraintDoesNotDefineValidationAppliesToParameterException$str() {
        return getGenericAndCrossParameterConstraintDoesNotDefineValidationAppliesToParameterException;
    }

    public final javax.validation.ValidationException getGroupHasToBeAnInterfaceException(final String className) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000045: ")+ getGroupHasToBeAnInterfaceException$str()), className));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getGroupHasToBeAnInterfaceException$str() {
        return getGroupHasToBeAnInterfaceException;
    }

    public final javax.validation.ConstraintDeclarationException getVoidMethodsMustNotBeConstrainedException(final Member member) {
        javax.validation.ConstraintDeclarationException result = new javax.validation.ConstraintDeclarationException(String.format(((projectCode +"000132: ")+ getVoidMethodsMustNotBeConstrainedException$str()), member));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getVoidMethodsMustNotBeConstrainedException$str() {
        return getVoidMethodsMustNotBeConstrainedException;
    }

    public final javax.validation.ValidationException getReservedParameterNamesException(final String messageParameterName, final String groupsParameterName, final String payloadParameterName) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000113: ")+ getReservedParameterNamesException$str()), messageParameterName, groupsParameterName, payloadParameterName));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getReservedParameterNamesException$str() {
        return getReservedParameterNamesException;
    }

    public final javax.validation.ValidationException getUnableToFindPropertyWithAccessException(final Class beanClass, final String property, final ElementType elementType) {
        javax.validation.ValidationException result = new javax.validation.ValidationException(String.format(((projectCode +"000013: ")+ getUnableToFindPropertyWithAccessException$str()), beanClass, property, elementType));
        StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }

    protected String getUnableToFindPropertyWithAccessException$str() {
        return getUnableToFindPropertyWithAccessException;
    }

}

