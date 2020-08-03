package com.sda.gina.di.dao;

public class EnglishSpeakerDAO implements Speaker, WriterDAO{

    String text = "Hello ";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String sayHello() {
       return text;
    }


    public void writer(String text) {
        text= this.text;
    }
}
