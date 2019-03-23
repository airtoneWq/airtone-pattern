package com.airtone.pattern.factory.simple;

/**
 * 使用反射方式，增加课程不需要修改该工厂类的代码
 */
public class SimpleCourceFactory2 {
    public ICource create(String className){
        try {
            if (null != className && !"".equals(className)){
                ICource cource = (ICource) Class.forName(className).newInstance();
                return  cource;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
