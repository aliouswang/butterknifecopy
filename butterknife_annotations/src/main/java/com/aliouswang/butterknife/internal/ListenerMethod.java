package com.aliouswang.butterknife.internal;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(FIELD)
public @interface ListenerMethod {

    String name();

    String[] parameters() default {};

    String returnType() default "void";

    String defaultReturn() default "null";

}
