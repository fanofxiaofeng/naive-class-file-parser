package com.study.parser;

import com.study.constants.PresentKind;
import com.study.io.BasicInputStream;
import com.study.present.MainPresenter;
import com.study.util.PathUtils;
import com.study.util.PrintStreamWrapper;

import java.io.InputStream;
import java.util.EnumSet;

public class Main {

    public static void main(String[] args) throws Exception {
        String classAsPath = PathUtils.convert(args[0]);
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(classAsPath);

        PrintStreamWrapper printStreamWrapper = new PrintStreamWrapper("scripts/result/output.txt");
        BasicInputStream basicInputStream = new BasicInputStream(inputStream);
        ParseResult parseResult = new MainParser(basicInputStream).parse();

        EnumSet<PresentKind> allKinds = EnumSet.allOf(PresentKind.class);
        MainPresenter presenter = new MainPresenter(parseResult, printStreamWrapper, allKinds);
        presenter.present();
    }
}
