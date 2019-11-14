package com.aliouswang.butterknife;

import androidx.annotation.IdRes;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.FIELD;

/**
 * Bind a field to the specified string resource ID.
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface BindString {

    // String resource ID which the field will be bound.
    @IdRes int value();

}
