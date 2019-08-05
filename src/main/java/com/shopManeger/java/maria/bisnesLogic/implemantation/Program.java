package com.shopManeger.java.maria.bisnesLogic.implemantation;

import com.shopManeger.java.maria.bisnesLogic.interfaces.IProgram;
import com.shopManeger.java.maria.dataAccess.classDA.Message;
import com.shopManeger.java.maria.dataAccess.implemantation.TelegramMaria;
import com.shopManeger.java.maria.dataAccess.interfaces.ITelegram;

public class Program implements IProgram {

    private ITelegram telegram;

    public Program() {
        this.telegram = new TelegramMaria();
    }

    public void start() {
        telegram.sendMassage(new Message("Hello Maria", "12345"));
    }
}
