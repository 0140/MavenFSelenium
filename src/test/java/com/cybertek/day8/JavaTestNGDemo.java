package com.cybertek.day8;

import org.testng.annotations.Test;
import org.testng.Assert;

public class JavaTestNGDemo {



    @Test
    public void test1() {
        String a="A";
        String b="A";
        Assert.assertEquals(a,b);
    }

    @Test
    public void test2() {
        String str1="apple";
        String str2="orange";
        Assert.assertEquals(str1,str2);
    }
    @Test
    public void test3(){
        String str1 = "ADAF";
        String str2 = "AAA";
        Assert.assertTrue(str1.contains(str2));
    }

    @Test
    public void test4(){
        Assert.assertFalse(false);
    }
}

