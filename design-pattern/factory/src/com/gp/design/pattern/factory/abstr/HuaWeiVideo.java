package com.gp.design.pattern.factory.abstr;

import com.gp.design.pattern.factory.IVideo;

public class HuaWeiVideo implements IVideo {
    @Override
    public void getBrand() {
        System.out.println("我是华为Video");
    }
}
