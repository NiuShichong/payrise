package com.bigdata;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by root on 2020/7/11.
 * 实现双色球抽奖游戏中奖号码的生成，
 * 中奖号码由 6 个红球号码和 1 个蓝球号码组成
 * 其中红球号码要求随机生成 6 个 1~33 之间不重复的随机号码
 * 其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码。
 *
 */

import java.util.Random;

public class ModelThree {

    public static void main(String[] args) {

        //思路：创建两个数组，分别方红蓝球，通过   binarySearch  判断是否在数组内，防止重复即可
        //数字由随机数生成即可
        int[] arr_red = new int[6];
        for(int i = 0;i < 6; i++) {
            Random ra = new Random();
            int num = ra.nextInt(33)+1;
            boolean flag = true;
            for(int ii = 0; ii < i; ii++) {
                if (arr_red[ii] == num) {
                    flag = !flag;
                }
            }
            if(flag) { //判断是否已经存在
                arr_red[i] = num;
            }
        }
        Arrays.sort(arr_red);
        System.out.println("红球：" + Arrays.toString(arr_red));

        int[] arr_blue = new int[2];
        for(int i = 0;i < 2; i++) {
            Random ra = new Random();
            int num2 = ra.nextInt(16) + 1;
            boolean flag = true;
            for (int ii = 0; ii < i; ii++){
                if (arr_blue[ii] == num2){
                    flag = !flag;
                }
            }
            if(flag) { //判断是否已经存在
                arr_blue[i] = num2;
            }
        }
        Arrays.sort(arr_blue);
        System.out.println("蓝球：" + Arrays.toString(arr_blue));
        //组装打印
        for (int i = 0;i < arr_red.length; i++) {
            System.out.print(arr_red[i] + "  ");
        }
        for (int i = 0;i < arr_blue.length; i++) {
            System.out.print(arr_blue[i] + "  ");
        }
    }
}
