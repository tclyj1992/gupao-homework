package com.gp.design.pattern.factory.abstr;

import com.gp.design.pattern.factory.IPhone;
import com.gp.design.pattern.factory.IVideo;

public interface IFactory {

    IPhone getPhone();

    IVideo getVideo();
}
