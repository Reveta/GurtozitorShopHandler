package com.shopManeger.java.maria;

import com.shopManeger.java.maria.bisnesLogic.implemantation.Program;
import com.shopManeger.java.maria.bisnesLogic.interfaces.IProgram;

public class Main {

    private static IProgram program = new Program();

    public static void main(String[] args) {
        program.start();

    }
}
