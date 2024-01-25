package com.study.present;

import com.study.parser.ParseResult;
import com.study.type.ItemsContainer;
import com.study.type.info.MethodInfo;
import com.study.util.PrintStreamWrapper;

import java.util.ArrayList;
import java.util.List;

public class MethodsPresenter extends AbstractPresenter {

    private final ItemsContainer<MethodInfo> methods;

    public MethodsPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper) {
        super(result, printStreamWrapper);
        this.methods = result.getMethods();
    }

    @Override
    public int present() {
        if (methods.getCount() == 0) {
            return 0;
        }

        int cnt1 = printStreamWrapper.getPrintlnCount();
        List<String> descriptions = new ArrayList<>(methods.getCount());

        for (MethodInfo methodInfo : methods) {
            int tempCount = printStreamWrapper.getPrintlnCount();
            if (tempCount > cnt1) {
                printStreamWrapper.println();
            }

            MethodInfoPresenter methodInfoPresenter = new MethodInfoPresenter(result, printStreamWrapper, methodInfo);
            methodInfoPresenter.present();
        }

        printStreamWrapper.batchPrintln(descriptions);

        int cnt2 = printStreamWrapper.getPrintlnCount();
        return cnt2 - cnt1;
    }
}
