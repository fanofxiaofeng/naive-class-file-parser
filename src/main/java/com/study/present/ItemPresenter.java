package com.study.present;

import com.study.parser.ParseResult;
import com.study.type.constant.AbstractConstant;
import com.study.util.ConstantPoolUtils;
import com.study.util.PaddingUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.io.PrintStream;
import java.util.Optional;

public class ItemPresenter extends AbstractPresenter {

    private final Pair<Integer, AbstractConstant> pair;

    protected ItemPresenter(ParseResult result, PrintStream printStream, Pair<Integer, AbstractConstant> pair) {
        super(result, printStream);
        this.pair = pair;
    }

    @Override
    public void present() {
        int index = pair.getKey();
        AbstractConstant item = pair.getRight();

        String indexPart = buildIndexPart(index);
        String typePart = item.getTag().getType();
        String descPart = item.desc();

        String content;
        Optional<String> detail = item.detail(result.getConstantPool());
        if (detail.isPresent()) {
            content = buildContent(indexPart, typePart, descPart, detail.get());
        } else {
            content = buildContent(indexPart, typePart, descPart);
        }

        printStream.println(content);
    }

    private String buildContent(String indexPart, String typePart, String descPart) {
        String content = String.format("%s = %s%s",
                indexPart,
                StringUtils.rightPad(typePart, 19),
                descPart
        );
        return PaddingUtils.prepend(content, DEFAULT_LEFT_PADDING_CNT);
    }

    private String buildContent(String indexPart, String typePart, String descPart, String detail) {
        String content = String.format("%s = %s%s%s",
                indexPart,
                StringUtils.rightPad(typePart, 19),
                StringUtils.rightPad(descPart, 15),
                "// " + detail
        );

        return PaddingUtils.prepend(content, DEFAULT_LEFT_PADDING_CNT);
    }

    private String buildIndexPart(int index) {
        int lastIndex = ConstantPoolUtils.lastIndex(result.getConstantPool());
        int numberPartFixedWidth = String.format("#%d", lastIndex).length();
        return StringUtils.leftPad(String.format("#%d", index), numberPartFixedWidth);
    }
}
