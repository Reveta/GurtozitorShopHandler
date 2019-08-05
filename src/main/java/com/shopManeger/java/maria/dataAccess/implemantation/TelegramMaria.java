package com.shopManeger.java.maria.dataAccess.implemantation;

import com.shopManeger.java.maria.dataAccess.classDA.Message;
import com.shopManeger.java.maria.dataAccess.interfaces.ITelegram;

public class TelegramMaria implements ITelegram {

    public void sendMassage(Message message) {
        System.out.println("Sending message: " + message.getText() + " for " + message.getUserID());
    }
}
