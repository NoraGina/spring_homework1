package com.sda.gina.di;

import com.sda.gina.di.service.SpeakerService;
import com.sda.gina.di.service.WriterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDi {
    public static void main(String[] args) {

        SpeakerService speakerServiceEnglish = getSpeakerBean("englishSpeakerService");
        speakerServiceEnglish.init();
        speakerServiceEnglish.destroy();

        System.out.println("---------------------------------------");
        SpeakerService speakerServiceFrench = getSpeakerBean("frenchSpeakerService");
        speakerServiceFrench.init();
        speakerServiceFrench.destroy();

        System.out.println("--------------------------");
        WriterService fileWriterService = getWriterBean("fileWriterService");
        fileWriterService.displayWriter("Hello: ");
        WriterService consoleWriterService = getWriterBean("consoleWriterService");
        consoleWriterService.displayWriter("Hello again: ");
        

        System.out.println(" File and Speaker");
        SpeakerService speakerServiceEngFil = getSpeakerBean("speakerServiceEngFile");
        speakerServiceEngFil.display();

        SpeakerService speakerServiceEngConsole = getSpeakerBean("speakerServiceEngCon");
        speakerServiceEngConsole.display();

        SpeakerService speakerServiceFrenchConsole = getSpeakerBean("speakerServiceFreCon");
        speakerServiceFrenchConsole.display();

    }

    static SpeakerService getSpeakerBean(String beanName){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        return (SpeakerService) applicationContext.getBean(beanName);
    }

    static WriterService getWriterBean(String beanName){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        return (WriterService) context.getBean(beanName);
    }

}
