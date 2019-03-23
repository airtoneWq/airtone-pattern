package com.airtone.pattern.factory.simple;

/**
 *
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleCourceFactory simpleCourceFactory = new SimpleCourceFactory();
        simpleCourceFactory.create("Python");
//        simpleCourceFactory.create("Java");


        SimpleCourceFactory2 simpleCourceFactory2 = new SimpleCourceFactory2();
        ICource cource = simpleCourceFactory2.create("com.airtone.pattern.factory.simple.JavaCource");
        cource.record();
    }
}
