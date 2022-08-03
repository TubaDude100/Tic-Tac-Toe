package com.company;

public class Main {
public static void main(String[] args) {
        UserInterface ui = new UserInterface(new TTTB());

        while (ui.active()){
            ui.update();
        }

    }
}