package com.iot.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.CONSTRUCTOR;

@Target({CONSTRUCTOR,METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface MultValAnnotation {
String value1() default "abcd";
String value2() default "wxyz";
}
