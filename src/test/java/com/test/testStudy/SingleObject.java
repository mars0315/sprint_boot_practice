package com.test.testStudy;

public class SingleObject {
    private static SingleObject instance=new SingleObject();
    private SingleObject(){}

    public static SingleObject getSO(){
        return instance;
    }
}
