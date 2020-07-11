package com.bigdata;

/**
 * Created by root on 2020/7/11.
 *自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍。 例如，总容量是 10，当输入第 8 个元素时，数组进行扩容，容量从 10 变 15。
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class ModelFour {

    public static void main(String[] args) {

        //创建初始化数组，提示用户输入信息
        int[] arr = new int[10];
        int num = 1;  //统计次数
        boolean flag = true; //设置暂停标签
        while(flag) {
            /// 提示输入信息
            System.out.println("请输入第：" + num + "个信息");
            Scanner sc = new Scanner(System.in);
            int info = sc.nextInt();
            //赋值给数组
            arr[num-1] = info;
            //判断是否超资源
            if (num >= arr.length*0.8) {
                int[] arr_tmp = new int[arr.length*3/2];
                System.out.println("自动扩容至：" + arr_tmp.length);
                //复制数组内容到临时数组
                System.out.println("您的数组容量由：" + arr.length + "自动扩容至：" + arr_tmp.length);
                arr = arr_tmp;
            }
            //设置跳出机制
            System.out.println("是否继续输入？Y/N");
            String str = sc.next();
            flag = ("Y".equals(str)?true:false);
            System.out.println("您选择了" + (flag?"继续输入":"退出"));
            num++;
        }

        System.out.print("最终数组结果是；" + Arrays.toString(arr));
    }
}
