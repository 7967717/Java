package com.romanrudenko.screenSaver;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

/**
 * @author roman.rudenko on 12-Apr-16.
 */
@Configuration
@ComponentScan(basePackages = "com.romanrudenko.screenSaver")
public class Config {
    @Bean
    @Scope("periodical")
    public Color color(){
        Random random0 = new Random();
        Random random1 = new Random();
        Random random2 = new Random();
        return new Color(random0.nextInt(255), random1.nextInt(255), random2.nextInt(255));
    }

    @Bean
    public ColorFrame frame(){
        return new ColorFrame() {
            @Override
            protected Color getColor() {
                return color();
            }
        };
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        while (true){
            context.getBean(ColorFrame.class).showOnRandomPlace();
            Thread.sleep(500);
        }
    }
}
