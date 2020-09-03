package com.jym;
//两数之和
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

public class Test01 {
    private static int target = 13;
    private static int[] arr = {1, 7, 11, 15,2};
    public static void main(String[] args) {
        if (arr.length > 0) {
            int first = 0;
            get(first);
        }
    }

    private static void get(int first) {
        int index = arr[first];
        for (int i = first + 1; i < arr.length; i++) {
            if (index + arr[i] == target) {
                System.out.println(first + " " + i);
                return;
            }
        }
        if (first + 1 < arr.length) {
            get(first + 1);
        }else {
            System.out.println("无");
        }
    }
}
