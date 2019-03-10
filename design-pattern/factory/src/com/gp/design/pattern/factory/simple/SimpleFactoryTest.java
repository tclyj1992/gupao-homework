package com.gp.design.pattern.factory.simple;

import com.gp.design.pattern.factory.HuaWei;
import com.gp.design.pattern.factory.IPhone;

import java.util.Calendar;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();

        /*IPhone iPhone = factory.getPhone("小米");
        iPhone.getBrand();*/

        IPhone iPhone = factory.getPhone(HuaWei.class);

        iPhone.getBrand();

        //Calendar.getInstance()
        //LoggerFactory.getLogger
    }
}
