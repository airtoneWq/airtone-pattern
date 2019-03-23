package com.airtone.pattern.factory.simple;

/**
 * 简单是简单了
 * 缺点：当新增其他课程时，需要修改该工厂类，不符合开闭原则
 */
public class SimpleCourceFactory {
    public ICource create(String name){
        if (name.equals("Java")){
            return new JavaCource();
        }else if (name.equals("Python")){
            return new PythonCource();
        }else{
            return null;
        }
    }
}
