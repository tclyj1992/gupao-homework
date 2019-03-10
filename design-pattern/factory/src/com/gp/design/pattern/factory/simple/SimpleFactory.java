package com.gp.design.pattern.factory.simple;

import com.gp.design.pattern.factory.IPhone;

/**
 * 简单工厂
 */
public class SimpleFactory {

    /*public IPhone getPhone(String phoneBrand){
        if("小米".equals(phoneBrand)){
            return new XiaoMi();
        }else if("华为".equals(phoneBrand)){
            return new HuaWei();
        }else {
            System.out.println("不生产该品牌的手机");
            return null;
        }
    }*/


    public IPhone getPhone(Class<?> clazz){

        try {
            if(null != clazz) {
                return (IPhone) clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
