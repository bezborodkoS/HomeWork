package com.exemple.app.test.proj1;


import com.exemple.app.test.proj1.methodCome.MasageProces;

public class ProjMain {
    public static void main(String[] args) {
//        String chanalTipe = "SMS";
//        String text= "some meet";
//        News news = new News();
//        EmailSend SMS = new EmailSend(news);
//        SmsSend smsSend = new SmsSend(news);
//        news.setNews("tex1"," tttttttttttttttt");
//        news.setNews("tex5"," aaaaaaaaaaaaaaaa");

        MasageProces masageProces = new MasageProces();
        masageProces.send( "Text for sms","sms");
        masageProces.send("tesxt for email","email");

    }
}
