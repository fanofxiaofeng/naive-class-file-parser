package com.study.present;

import com.study.parser.ParseResult;
import com.study.type.ItemsContainer;
import com.study.type.info.MethodInfo;
import com.study.util.PrintStreamWrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MethodsPresenter extends AbstractPresenter {

    private final ItemsContainer<MethodInfo> methods;

    public MethodsPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper) {
        super(result, printStreamWrapper);
        this.methods = result.getMethods();
    }

    @Override
    public void doPresent() {
        int count = methods.getCount();
        if (count == 0) {
            return;
        }

        List<String> descriptions = new ArrayList<>(methods.getCount());

        IntStream.range(0, count).forEach(index -> {
            if (index > 0) {
                printStreamWrapper.println();
            }

            MethodInfo methodInfo = methods.items().get(index);
            MethodInfoPresenter methodInfoPresenter = new MethodInfoPresenter(result, printStreamWrapper, methodInfo);
            methodInfoPresenter.present();
        });

        printStreamWrapper.batchPrintln(descriptions);
    }
}
