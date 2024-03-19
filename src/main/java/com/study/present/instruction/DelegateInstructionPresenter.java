package com.study.present.instruction;

import com.study.parser.ParseResult;
import com.study.present.Presenter;
import com.study.type.instruction.AbstractInstruction;
import com.study.type.instruction.InvokeInterfaceInstruction;
import com.study.type.instruction.ThreeByteInstruction;
import com.study.type.instruction.factory.LookupSwitchInstruction;
import com.study.type.instruction.factory.TableSwitchInstruction;
import com.study.util.PrintStreamWrapper;

import java.util.Set;

public class DelegateInstructionPresenter extends AbstractInstructionPresenter {

    private final AbstractInstruction instruction;

    public DelegateInstructionPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, AbstractInstruction instruction) {
        super(result, printStreamWrapper);
        this.instruction = instruction;
    }

    @Override
    public void doPresent() {
        if (instruction instanceof TableSwitchInstruction tableSwitchInstruction) {
            Presenter presenter = new TableSwitchInstructionPresenter(result, printStreamWrapper, tableSwitchInstruction);
            presenter.present();
            return;
        }
        if (instruction instanceof LookupSwitchInstruction lookupSwitchInstruction) {
            Presenter presenter = new LookupSwitchInstructionPresenter(result, printStreamWrapper, lookupSwitchInstruction);
            presenter.present();
            return;
        }
        if (instruction instanceof ThreeByteInstruction threeByteInstruction) {
            if (Set.of("invokevirtual", "invokestatic", "invokespecial").contains(instruction.getName())) {
                Presenter presenter = new ThreeInvokeInstructionPresenter(result, printStreamWrapper, threeByteInstruction, baseIndentLevel);
                presenter.present();
                return;
            }
            if (Set.of("getstatic", "putstatic", "getfield", "putfield").contains(instruction.getName())) {
                Presenter presenter = new AccessFieldInstructionPresenter(result, printStreamWrapper, threeByteInstruction);
                presenter.present();
                return;
            }
        }

        if (instruction instanceof InvokeInterfaceInstruction invokeInterfaceInstruction) {
            Presenter presenter = new InvokeInterfaceInstructionPresenter(result, printStreamWrapper, invokeInterfaceInstruction);
            presenter.present();
            return;
        }

        Presenter presenter = new SimpleInstructionPresenter(
                result,
                printStreamWrapper,
                instruction
        );
        presenter.present();
    }
}
