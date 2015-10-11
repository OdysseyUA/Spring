package com.springinaction.knights;

import com.springinaction.knights.exceptions.QuestException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Odyssey on 11.10.2015.
 */
public class Driver {

    public static void main(String[] args) throws QuestException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("knight-context.xml");
        Knight knight = (Knight)ctx.getBean("knight");
        knight.embarkOnQuest();

    }
}
