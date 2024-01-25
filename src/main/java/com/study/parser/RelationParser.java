package com.study.parser;

import com.study.io.BasicInputStream;
import com.study.type.ConstantPool;
import com.study.type.ItemsContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public abstract class RelationParser<C> extends AbstractParser<ItemsContainer<C>> {

    protected final ConstantPool constantPool;

    private final Parser<C> childParser;

    protected RelationParser(
            BasicInputStream basicInputStream,
            ConstantPool constantPool,
            Supplier<Parser<C>> childParserSupplier
    ) {
        super(basicInputStream);
        this.constantPool = constantPool;
        this.childParser = childParserSupplier.get();
    }

    @Override
    public ItemsContainer<C> parse() {
        int count = parseCount();

        List<C> items = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            items.add(childParser.parse());
        }

        return new ItemsContainer<>(items);
    }
}
