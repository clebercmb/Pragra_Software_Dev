package io.pragra.learnign.tdd;

import org.testng.annotations.Test;

public class DummyTest {

    @Test(groups ={"smoke", "performance", "regression"})
    public void testCase1() {
        System.out.println("Dummy Test1");
    }

    @Test
    public void testCase2() {
        System.out.println("Dummy Test2");
    }

    @Test
    public void testCase3() {
        System.out.println("Dummy Test3");
    }



}

