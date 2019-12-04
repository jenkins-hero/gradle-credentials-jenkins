package com.tom;

public class ServiceWithDependency {
    private SpecialService specialService = new SpecialService();

    public String doSomething() {
        return specialService.callMe();
    }
}