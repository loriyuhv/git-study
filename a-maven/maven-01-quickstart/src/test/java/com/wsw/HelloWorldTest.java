package com.wsw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void hello() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.hello();
    }
}