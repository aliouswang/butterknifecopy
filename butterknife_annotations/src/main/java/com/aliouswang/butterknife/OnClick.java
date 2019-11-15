package com.aliouswang.butterknife;


import android.view.View;

import androidx.annotation.IdRes;

import com.aliouswang.butterknife.internal.ListenerClass;
import com.aliouswang.butterknife.internal.ListenerMethod;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(METHOD)
@ListenerClass(
        targetType = "android.view.View",
        setter = "setOnClickListener",
        type = "com.aliouswang.butterknife.runtime.internal.DebouncingOnClickListener",
        method = @ListenerMethod(
                name = "doClick",
                parameters = "android.view.View"
        )
)
public @interface OnClick {

    @IdRes int[] value() default {View.NO_ID};

}
