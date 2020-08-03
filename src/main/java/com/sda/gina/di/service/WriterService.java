package com.sda.gina.di.service;

import com.sda.gina.di.dao.WriterDAO;

public class WriterService {
    WriterDAO writerDAO;

    public WriterService(WriterDAO writerDAO) {
        this.writerDAO = writerDAO;
    }

    public WriterDAO getWriterDAO() {
        return writerDAO;
    }

    public void setWriterDAO(WriterDAO writerDAO) {
        this.writerDAO = writerDAO;
    }

    public void displayWriter(String text){
        writerDAO.writer(text);
    }
}
