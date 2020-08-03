package com.sda.gina.di.dao;

public class ConsoleWriterDAO implements WriterDAO{

    public void writer(String text) {
        System.out.println(text+ " Console writer");

    }
}
