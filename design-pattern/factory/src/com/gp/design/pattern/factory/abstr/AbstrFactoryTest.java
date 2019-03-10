package com.gp.design.pattern.factory.abstr;

import com.gp.design.pattern.factory.IPhone;
import com.gp.design.pattern.factory.IVideo;

public class AbstrFactoryTest {

    public static void main(String[] args) {
        IFactory factory = new HuaWeiFactory();
        IPhone phone = factory.getPhone();
        phone.getBrand();

        IVideo video = factory.getVideo();
        video.getBrand();
    }
}
