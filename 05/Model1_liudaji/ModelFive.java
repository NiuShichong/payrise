package com.bigdata;

import java.util.Arrays;

/**
 * Created by root on 2020/7/11.
 */


public class ModelFive {

    public static void main(String[] args) {

        //创建数组
        String[][] arr = new String[17][17];
        // 打印+
        for (int i = 0; i < arr.length; i++) {
            //行
            for (int j = 0; j < arr[0].length; j++) {
                //列
                arr[i][j] = ("+  ");
            }
        }
        // System.out.println(Arrays.toString(arr));
        // 修改第一行和第一列为标识符
        for (int i = 0; i < 10; i++) {
            arr[0][i+1] = Integer.toString(i) + "  " ;
        }
        for (int i = 0; i < 10; i++) {
            arr[i+1][0] = Integer.toString(i) + "  " ;
        }
        //阿西克码值：a = 97
        for (int i = 10; i < 16; i++) {
            arr[0][i+1] = (char)(87+i) + "  " ;
        }
        for (int i = 10; i < 16; i++) {
            arr[i+1][0] = (char)(87+i)  + "  " ;
        }

        //打印查
        for (int i = 0; i < arr.length; i++) {
            //行
            for (int j = 0; j < arr[0].length; j++) {
                //列
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
