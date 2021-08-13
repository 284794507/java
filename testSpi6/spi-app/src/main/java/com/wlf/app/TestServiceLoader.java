package com.wlf.app;

import java.util.Iterator;
import java.util.ServiceLoader;

import com.wlf.api.ITest;

public class TestServiceLoader {
    public static void main(String[] args){
        ServiceLoader<ITest> serviceLoader = ServiceLoader.load(ITest.class);
        Iterator<ITest> iTests = serviceLoader.iterator();
        while (iTests.hasNext())
        {
            ITest iTest = iTests.next();
            System.out.println(iTest.getClass().getName());
            iTest.saySomething();
        }
    }
}
