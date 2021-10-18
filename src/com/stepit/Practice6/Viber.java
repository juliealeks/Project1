package com.stepit.Practice6;

public class Viber implements Messenger{
    @Override
    public void sendMessage() {
        System.out.println("send message via Viber");
    }

    @Override
    public void getMessage() {
        System.out.println("read message via Viber");
    }
}
