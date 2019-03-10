package com.gp.design.pattern.factory.method;

import com.gp.design.pattern.factory.IPhone;

public class MethodFactoryTest {

    public static void main(String[] args) {
        IFactory factory = new HuaWeiFactory();
        IPhone phone = factory.getPhone();
        phone.getBrand();
    }
}
