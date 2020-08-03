package com.sda.gina.di.dao;

import com.sda.gina.di.service.WriterService;

public class FrenchSpeakerDAO implements Speaker, WriterDAO {
    String text = "Bon jour ";

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
        text=this.text;
    }
}
