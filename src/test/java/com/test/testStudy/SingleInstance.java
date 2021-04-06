package com.test.testStudy;

public class SingleInstance {
    private static SingleInstance instance =new SingleInstance();
    private SingleInstance(){}

    public static SingleInstance getSI(){
        return instance;
    }

}
