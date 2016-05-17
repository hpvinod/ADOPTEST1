package com.megacorp.projx.JUnit;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;

import com.megacorp.projx.util.Addition;
import com.megacorp.projx.util.Addition_Test;
import com.megacorp.projx.util.Multiply;
import com.megacorp.projx.util.Multiply_Test;

@RunWith(Suite.class)

@Suite.SuiteClasses({Addition.class,Multiply.class})

public class AllTests

{

    // Empty, since the annotations include all of the necessary configuration

}
