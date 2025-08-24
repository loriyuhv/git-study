package com.wsw;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void hello() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.hello();
    }

    @Test
    void add() {
        HelloWorld helloWorld = new HelloWorld();
        int add = helloWorld.add(1, 2);
        System.out.println(add);
    }
}