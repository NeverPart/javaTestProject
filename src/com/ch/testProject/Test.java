package com.ch.testProject;

import java.util.*;

/**
 * @className: Test
 * @Auther: ch
 * @Date: 2021/6/2 14:44
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {
        //randomStr(2, 10);
        test("AaBBCC");

        /*int a = 100,b=50,c=a-- - b,d=a-- - b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);*/
       /*char[] ch = {'t','e','s','t'};
        System.out.println(ch);
        Test.change(ch);
        System.out.println(ch);*/

/*
        for (int i=0;i<1;){
            break;
        }
        System.out.println("sss");*/
     /*  List<Integer> l = new ArrayList<>();
       l.add(1);
       l.add(2);
        System.out.println(l);*/
    }

    public static void change(char[] ch) {
        ch[0] = 'b';

    }

    /**
     * @return void
     * @Author ch
     * @Description 生成一个随机字符串
     * @Date 2021/6/9 10:43
     * @Param strCount: 字符串个数
     * @Param strLength: 字符串长度
     **/
    public static void randomStr(int strCount, int strLength) {

        String str = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ0123456789";
        Random random = new Random();
        for (int i = 0; i < strCount; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < strLength; j++) {
                int index = random.nextInt(str.length());
                stringBuilder.append(str.charAt(index));
            }
            System.out.println(stringBuilder);
        }
    }

    public static void test(String str) {
        String[] strArr = str.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                stringBuilder.append(strArr[i]);
            }else {
                if (!strArr[i].equals(strArr[i-1])){
                    stringBuilder.append(strArr[i]);
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
