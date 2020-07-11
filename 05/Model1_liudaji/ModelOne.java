package com.bigdata;

/**
 * Created by root on 2020/7/11.
 * 提示用户输入年月日，然后判断这一天是一年中的第几天，然后打印
 */

import sun.org.mozilla.javascript.internal.regexp.SubString;

import java.util.Scanner;

public class ModelOne {

    public static void main(String[] args) {

        //提示用户输入年月日信息
        System.out.println("输入判断的日期(20200701简写即可)：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //解析用户输入的年月日信息，然后进行计算
        String year =  str.substring(0, 4);
        String month =  str.substring(4, 6);
        String day =  str.substring(6, 8);
        System.out.println("您要判断的是:" + year + "年" + month + "月" + day + "日");
        //判断：3578 10 12 是31日，469 11 30天，2月考虑闰年，1月直接是天数 Integer.parseInt(day)转类型
        int sum_day = 0; //定义容器
        System.out.println("天数:" + Integer.parseInt(month));
        for(int i = 0; i <= Integer.parseInt(month); i++) {
            switch(i) {
                //3578 10 12 是31日
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: {
                    sum_day += 31;
                    break;
                }
                //469 11 30天
                case 4:
                case 6:
                case 9:
                case 11: {
                    sum_day += 30;
                    break;
                }
                //1月直接是天数  但是考虑月份大于1 的时候还是应该为31
                case 1: {
                    if(Integer.parseInt(month) > 1) {
                        sum_day += 31;
                    } else {
                        sum_day += Integer.parseInt(day);
                    }
                    break;
                }
                //2月考虑闰年
                case 2: {
                    if((Integer.parseInt(year) % 100 !=0 && Integer.parseInt(year) % 4 == 0) || (Integer.parseInt(year) % 100 == 0 && Integer.parseInt(year)%400==0) ) {
                        sum_day += 29;
                    } else {
                        sum_day += 28;
                    }
                }
            }
        }
        System.out.println("天数:" + sum_day);
    }
}
