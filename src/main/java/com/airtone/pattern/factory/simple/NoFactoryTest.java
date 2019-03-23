package com.airtone.pattern.factory.simple;

/**
 * 不使用工厂的调用方式
 * 缺点：应用层需要依赖JavaCource、PythonCource，继续增加依赖的会越来越多
 */
public class NoFactoryTest {
    public static void main(String[] args) {
        ICource cource1 = new JavaCource();
        cource1.record();

        ICource cource2 = new PythonCource();
        cource2.record();
    }
}
