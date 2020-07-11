package com.bigdata;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by root on 2020/7/11.
 * 编程找出 1000 以内的所有完数并打印出来。 所谓完数就是一个数恰好等于它的因子之和，如：6=1＋2＋3
 *
 */


public class ModelTwo {

    public static void main(String[] args) {

        System.out.println("找到的结果！");
        //思路：从1 - 1000 ，逐个进行判断，找到因数，然后因数累加判断即可
        for(int i = 1; i <= 1000; i++) {
            int sum_ys = 0; //定义容器
            for(int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum_ys += j;
                }
            }
            if (sum_ys == i) {
                System.out.print(i + " ");
            }
        }

    }



}
