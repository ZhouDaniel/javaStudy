public class ArrayTest {
    public static void main(String[] args) {
        MyTools mt = new MyTools();
        int[] arr = {5, 2, 7, 1, 3};
        mt.bubble(arr);
        // 输出排序后的arr
        System.out.println("=====排序后的arr");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        //在idea 当我们 run 一个文件时，会先编译成 。cLass -＞在运行
    }
}

// 创建一个类MyTools，编写一个方法，可以完成对int数组冒泡排序的功能
//{5,2,7,1,3}
class MyTools {
    public void bubble(int[] arr) {
        // 冒泡排序
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
