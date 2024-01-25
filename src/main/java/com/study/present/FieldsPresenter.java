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
    public int present() {
        ItemsContainer<FieldInfo> fields = result.getFields();
        if (fields.getCount() == 0) {
            return 0;
        }

        int cnt1 = printStreamWrapper.getPrintlnCount();

        int size = fields.getCount();
        IntStream.range(0, size).forEach(index -> {
            if (index > 0) {
                printStreamWrapper.println();
            }

            FieldInfo fieldInfo = fields.items().get(index);
            new FieldInfoPresenter(result, printStreamWrapper, fieldInfo).present();
        });

        int cnt2 = printStreamWrapper.getPrintlnCount();
        return cnt2 - cnt1;
    }
}
