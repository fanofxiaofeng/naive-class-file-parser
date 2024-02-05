package com.study.present;

import com.study.parser.ParseResult;
import com.study.type.ItemsContainer;
import com.study.type.info.FieldInfo;
import com.study.util.PrintStreamWrapper;

import java.util.stream.IntStream;

public class FieldsPresenter extends AbstractPresenter {

    protected FieldsPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper) {
        super(result, printStreamWrapper);
    }

    @Override
    public void doPresent() {
        ItemsContainer<FieldInfo> fields = result.getFields();
        int count = fields.getCount();
        if (count == 0) {
            return;
        }

        IntStream.range(0, count).forEach(index -> {
            if (index > 0) {
                printStreamWrapper.println();
            }

            FieldInfo fieldInfo = fields.items().get(index);
            new FieldInfoPresenter(result, printStreamWrapper, fieldInfo).present();
        });
    }
}
