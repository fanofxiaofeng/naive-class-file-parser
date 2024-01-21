package com.study.present;

import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.Fields;
import com.study.type.info.FieldInfo;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class FieldsPresenter extends AbstractPresenter {

    private final Fields fields;

    protected FieldsPresenter(ParseResult result, PrintStream printStream) {
        super(result, printStream);
        this.fields = result.getFields();
    }

    @Override
    public void present() {
        if (fields.fieldsCount().toInt() == 0) {
            return;
        }

        List<String> descriptions = new ArrayList<>(fields.fieldsCount().toInt());

        ConstantPool constantPool = result.getConstantPool();
        for (FieldInfo fieldInfo : fields) {
            String description = fieldInfo.description(constantPool);
            descriptions.add(description);
        }

        String result = String.join("\n", descriptions);
        printStream.println(result);
    }
}
