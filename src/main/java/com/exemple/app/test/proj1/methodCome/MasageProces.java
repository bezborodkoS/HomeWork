package com.exemple.app.test.proj1.methodCome;

import java.security.PrivateKey;
import java.util.ArrayList;

public class MasageProces {
//    private ArrayList<ManagerSendler> impl;
private Chat chat;
private SMS sms;
private Email email;
//private
    public MasageProces() {
       this.chat = new Chat();
       this.sms = new SMS();
       this.email = new Email();
    }

//    public ArrayList<ManagerSendler> getImpl() {
//        return impl;
//    }
//
//    public void setImpl(ArrayList<ManagerSendler> impl) {
//        this.impl = impl;
//    }

    public void send(String text,String type){
        if (chat.getSenderTipe().equals(type)){
            chat.send(text);
        }else if (sms.getSenderTipe().equals(type)){
            sms.send(text);
        }else if (email.getSenderTipe().equals(type)){
            email.send(text);
        }
    }
}
