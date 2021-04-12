package com.iot.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.CONSTRUCTOR;


/**
 * 
 * @author gangineni
 *
 * 3 types of custom annotations: 
 * 
 * 1) Marker annotation: which does not have any body and will have only @target and @retention. Examples: @override, @suppresswarnings, @deprecated
 * 
 * 2) Single value annotation: which can have single value and can default value assigned to it.
 * 
 * 3) Multi-value annotation: which can have multiple values and each of the multiple values can have default values.
 * 
 */

@Target({FIELD, METHOD, CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)

public @interface SinglValAnnotation {	
	String value1() default "abcd";
}
