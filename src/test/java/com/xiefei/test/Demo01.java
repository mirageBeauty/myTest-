package com.xiefei.test;

import org.junit.Test;

public class Demo01 {

    @Test
    public void test01(){

        int i = Integer.MAX_VALUE;
        int j = i+1;
        System.out.println(j<i);
    }
}
