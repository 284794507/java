package com.wlf.impl;

import com.wlf.api.ITest;

public class ITestImpl1 implements ITest {
    @Override
    public void saySomething() {
        System.out.println("Hi, mia.");
    }
}
