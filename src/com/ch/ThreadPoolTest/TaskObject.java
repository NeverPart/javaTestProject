package com.ch.ThreadPoolTest;

/**
 * @className: TaskObject
 * @Auther: ch
 * @Date: 2021/6/16 11:54
 * @Description: TODO
 */
public class TaskObject implements Runnable {

    private int taskNum;

    public TaskObject() {
    }

    public TaskObject(int taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public void run() {
        System.out.println("正在执行===>" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task"+taskNum+"执行完毕！！！");
    }
}
