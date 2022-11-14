package com.hspedu.pkg;

//注意：

import java.util.Arrays;

//老韩建议：我们需要使用到哪个类，就导入哪个类即可，不建议使用 *导入
// import java.util.Scanner；//表示只会引入java.util 包下的 Scanner 
// import java.util.*；//表示将java.util 包下的所有类都引入（导入！)
public class Import01 {
    public static void main(String[] args) {
        //使用系统提供 Arrays 完成数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
