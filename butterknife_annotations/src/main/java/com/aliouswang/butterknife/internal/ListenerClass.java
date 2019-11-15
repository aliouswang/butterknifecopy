package com.aliouswang.butterknife.internal;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(ANNOTATION_TYPE)
@Retention(RUNTIME)
public @interface ListenerClass {

    String targetType();

    String setter();

    String remover() default "";

    String type();

    Class<? extends Enum<?>> callbacks() default  NONE.class;

    ListenerMethod[] method() default {};

    /** Default value for {@link #callbacks()}. */
    enum NONE { }
}
