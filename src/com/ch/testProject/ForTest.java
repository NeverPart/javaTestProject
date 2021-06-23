package com.ch.testProject;

/**
 * @className: ForTest
 * @Auther: ch
 * @Date: 2021/5/17 11:04
 * @Description: for循环的执行顺序
 */
public class ForTest {
    /**
     * @Author ch
     * @Description
     * @Date 2021/5/17 11:05
     * @Param a:
     * @return boolean
     **/
    public  static boolean  testA(char a){
        System.out.print(a);
        return true;
    }
    /**
     * for循环的执行顺序
     * @param args
     */
    public static void main(String[] args) {
        int i=0;
        for (testA('a');testA('b')&&(i<2);testA('c')) {
            i++;
            testA('d');
        }
    }
}
