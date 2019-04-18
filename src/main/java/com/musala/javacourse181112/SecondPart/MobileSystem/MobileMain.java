package com.musala.javacourse181112.SecondPart.MobileSystem;

import java.util.ArrayList;

public class MobileMain {
    public static void main(String[] args) {
        ArrayList<Modem> modems = new ArrayList<>();
        Nokia nokia = new Nokia("Nokia");
        modems.add(nokia);
        Samsung samsung = new Samsung("Samsung");
        modems.add(samsung);

        modems.forEach(modem ->
        {
            modem.test();
            modem.init();
        });
    }
}

