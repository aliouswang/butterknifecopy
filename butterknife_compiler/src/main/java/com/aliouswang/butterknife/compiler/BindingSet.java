package com.aliouswang.butterknife.compiler;

import com.squareup.javapoet.ClassName;

import javax.lang.model.element.TypeElement;

public class BindingSet {
    static final ClassName UTILS = ClassName.get("com.aliouswang.butterknife.runtime.internal", "Utils");
    static final ClassName VIEW = ClassName.get("android.view", "View");
    static final ClassName CONTEXT = ClassName.get("android.content", "Context");
//    static final ClassName

}

interface BindingInformationProvider {
    boolean constructorNeedsView();
    ClassName getBindingClassName();
}

final class ClasspathBindingSet implements BindingInformationProvider {
    private boolean constructorNeedsView;
    private ClassName className;

    ClasspathBindingSet(boolean constructorNeedsView, TypeElement classElement) {
        this.constructorNeedsView = constructorNeedsView;
    }

    @Override
    public ClassName getBindingClassName() {
        return className;
    }

    @Override
    public boolean constructorNeedsView() {
        return this.constructorNeedsView;
    }
}