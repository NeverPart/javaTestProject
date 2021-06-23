package com.ch.dataStructure.Stack;

import java.util.Stack;

/**
 * @className: StackTest
 * @Auther: ch
 * @Date: 2021/5/22 16:01
 * @Description: TODO
 */
public class StackTest {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // 判断如果栈是空则不匹配
                if (stack.isEmpty()) {
                    return false;
                }
                // 弹出栈顶
                char topChar = stack.pop();
                // 如果元素为右括号")",则栈顶要是左括号"(",否则不匹配
                if (c == ')' && topChar != '(') {
                    return false;
                }
                // 如果元素为右括号"]",则栈顶要是左括号"[",否则不匹配
                if (c == ']' && topChar != '[') {
                    return false;
                }
                // 如果元素为右括号"}",则栈顶要是左括号"{",否则不匹配
                if (c == '}' && topChar != '{') {
                    return false;
                }
            }
        }
        // 判断栈中是否为空
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackTest test = new StackTest();
        System.out.println(test.isValid("(]"));
    }
}
