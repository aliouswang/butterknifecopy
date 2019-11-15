package com.aliouswang.butterknife.compiler;

import com.aliouswang.butterknife.BindString;
import com.aliouswang.butterknife.BindView;
import com.aliouswang.butterknife.OnClick;
import com.google.auto.service.AutoService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.source.util.Trees;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.annotation.Nullable;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Types;

@AutoService(Processor.class)

public class ButterKnifeProcessor extends AbstractProcessor {

    private Types typeUtils;
    private Filer filer;
    private @Nullable Trees tress;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        typeUtils = processingEnv.getTypeUtils();
        filer = processingEnv.getFiler();
        try {
            tress = Trees.instance(processingEnv);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        Set<String> types = new LinkedHashSet<>();
        types.add(BindView.class.getCanonicalName());
        types.add(BindString.class.getCanonicalName());
        types.add(OnClick.class.getCanonicalName());
        return types;
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        return false;
    }


}
