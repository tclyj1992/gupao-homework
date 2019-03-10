package com.gp.design.pattern.factory;

/**
 * 华为手机
 */
public class HuaWei implements IPhone {
    @Override
    public void getBrand() {
        System.out.println("我是华为手机");
    }
}
