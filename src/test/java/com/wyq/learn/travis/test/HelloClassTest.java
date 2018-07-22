package com.wyq.learn.travis.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;


@FixMethodOrder(value = MethodSorters.NAME_ASCENDING)
public class HelloClassTest {
    @Test
    public void test001_helloworld() {
        HelloClass helloClass = new HelloClass();
        assertEquals("Hello World!", helloClass.getHelloWorld());
    }
}
