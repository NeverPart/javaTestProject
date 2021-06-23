package com.ch.ThreadPoolTest;

import com.sun.jmx.snmp.tasks.ThreadService;

import java.util.concurrent.*;

/**
 * @className: Test
 * @Auther: ch
 * @Date: 2021/6/16 10:11
 * @Description: 线程池测试
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        /**
         *corePoolSize:核心线程数
         * maximumPoolSize:最大线程数
         * keepAliveTime:存活时间
         * TimeUnit unit:存活时间单位
         * ArrayBlockingQueue<> :等待队列
         * Executors.defaultThreadFactory():线程工厂
         * new ThreadPoolExecutor.AbortPolicy() :拒绝策略
         **/
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                3, 5, 5L,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy()
        );

        for (int i = 0; i < 8; i++) {
            TaskObject taskObject = new TaskObject(i);
            executor.execute(taskObject);
            System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
                    executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());
        }
        executor.shutdown();
    }
}
