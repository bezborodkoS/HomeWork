package com.exemple.app.test.proj1.methodCome;

public class FlyMail implements Sendler{
    private String senderTipe;

    public FlyMail() {
        this.senderTipe = this.getClass().getSimpleName().toLowerCase();
    }

    public String getSenderTipe() {
        return senderTipe;
    }

    @Override
    public void send(String text) {
        System.out.println("fly mail");
    }

    @Override
    public String returnNmeClass() {
        return this.getClass().getSimpleName().toLowerCase();
    }
}
