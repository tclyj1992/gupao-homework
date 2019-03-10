package com.gp.design.pattern.factory.abstr;

import com.gp.design.pattern.factory.HuaWei;
import com.gp.design.pattern.factory.IPhone;
import com.gp.design.pattern.factory.IVideo;

public class HuaWeiFactory implements IFactory{
    @Override
    public IPhone getPhone() {
        return new HuaWei();
    }

    @Override
    public IVideo getVideo() {
        return new HuaWeiVideo();
    }
}
