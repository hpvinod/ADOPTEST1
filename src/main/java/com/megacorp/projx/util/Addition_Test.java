package com.megacorp.projx.util;

import java.io.IOException;

import java.io.PrintWriter;

import junit.framework.TestCase;

import com.megacorp.projx.util.Addition;

import com.megacorp.projx.util.Multiply;

public class Addition_Test extends TestCase

{

    private int x = 0;

    private int y = 0;

    // Stuff to do before test

    protected void setUp()

    {

        x = 4;

        y = 5;

    }

 

    // Stuff to do after test

    protected void tearDown()

    {

        x = 0;

        y = 0;

    }

    public void testAddition()

    {

        System.out.println("Test use of Addition class");

        int z = Addition.twoValues(x,y);

        System.out.println("    Result: " + z);

 

        assertEquals(9,z);  // The test

    }

}


