package com.stepit.Practice6;

public class Telegram implements Messenger, SmartphoneApp{
    @Override
    public void sendMessage() {
        System.out.println("send message via Telegram");
    }

    @Override
    public void getMessage() {
        System.out.println("receive message via Telegram");
    }

    @Override
    public void run() {

    }

    @Override
    public void close() {

    }

    @Override
    public void showReminders() {

    }
}
