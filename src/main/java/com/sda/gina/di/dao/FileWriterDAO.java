package com.sda.gina.di.dao;

public class FileWriterDAO implements WriterDAO{

    public void writer(String text) {
        System.out.println( text+ " File writer");
    }
}
