package com.skw.hello;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void canConstructAPersonWithAName() {
        HelloWorld obj = new HelloWorld();
        assertEquals(10, obj.plus(4, 6));
    }   
}
