package com.sda.gina.di.service;

import com.sda.gina.di.dao.Speaker;
import com.sda.gina.di.dao.WriterDAO;

public class SpeakerService {
    private Speaker speaker;
    private WriterDAO writerDAO;

   public SpeakerService(Speaker speaker) {
        this.speaker = speaker;

    }



    public SpeakerService(Speaker speaker, WriterDAO writerDAO) {
        this.speaker = speaker;
        this.writerDAO = writerDAO;
    }

    public WriterDAO getWriterDAO() {
        return writerDAO;
    }

    public void setWriterDAO(WriterDAO writerDAO) {
        this.writerDAO = writerDAO;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    /*public void displaySpeaker(){
        System.out.println(speaker.sayHello());
    }*/



    public void init(){
        try{
            System.out.println("- - - initializing register bean using init-method");
            System.out.println(speaker.sayHello());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void destroy(){
        try{
            System.out.println("- - - destroying register bean using destroy-method");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void display(){
        writerDAO.writer(speaker.sayHello());
    }


}
