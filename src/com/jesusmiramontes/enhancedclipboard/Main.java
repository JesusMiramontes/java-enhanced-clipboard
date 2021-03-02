package com.jesusmiramontes.enhancedclipboard;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class Main {

    public static void main(String[] args) {

    }

    public static void setClipboardValue(String value){
        StringSelection selection = new StringSelection(value);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }
}
