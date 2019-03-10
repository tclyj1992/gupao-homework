package com.gp.design.pattern.factory.method;

import com.gp.design.pattern.factory.IPhone;
import com.gp.design.pattern.factory.XiaoMi;

public class XiaoMiFactory implements IFactory{
    @Override
    public IPhone getPhone() {
        return new XiaoMi();
    }
}
