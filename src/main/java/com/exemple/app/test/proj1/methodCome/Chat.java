package com.exemple.app.test.proj1.methodCome;

public class Chat  implements Sendler {
    private String senderTipe;

    public Chat() {
        this.senderTipe = this.getClass().getSimpleName().toLowerCase();
    }

    public String getSenderTipe() {
        return senderTipe;
    }

    @Override
    public void send(String text) {
        System.out.println(text);
    }

    @Override
    public String returnNmeClass() {
        return this.getClass().getSimpleName().toLowerCase();
    }
}
