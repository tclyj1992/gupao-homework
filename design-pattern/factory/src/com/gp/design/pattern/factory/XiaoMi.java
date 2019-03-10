package com.gp.design.pattern.factory;

/**
 * 小米手机
 */
public class XiaoMi implements IPhone {


    @Override
    public void getBrand() {
        System.out.println("我是小米手机");
    }
}
