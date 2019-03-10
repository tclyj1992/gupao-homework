package com.gp.design.pattern.factory.method;

import com.gp.design.pattern.factory.IPhone;
import com.gp.design.pattern.factory.HuaWei;

public class HuaWeiFactory implements IFactory{
    @Override
    public IPhone getPhone() {
        return new HuaWei();
    }
}
