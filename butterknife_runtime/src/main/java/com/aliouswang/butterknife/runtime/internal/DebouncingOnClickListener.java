package com.aliouswang.butterknife.runtime.internal;

import android.view.View;

public abstract class DebouncingOnClickListener implements View.OnClickListener{

    static boolean enabled = true;

    private static final Runnable ENABLE_AGAIN = () -> enabled = true;



    public abstract void doClick(View v);

}
