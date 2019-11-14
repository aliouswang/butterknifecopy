package com.aliouswang.butterknife;

import androidx.annotation.IdRes;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Bind the filed to the view for the specified ID. The view will be automatically be cast to the filed
 * type.
 * <pre>
 *     <code>
 *          {@literal @}BindView(R.id.title) TextView title;
 *     </code>
 * </pre>
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface BindView {
    // View ID which the filed will be bound.
    @IdRes int value();

}
