package com.ch.designPattern23.strategy;

/**
 * @className: AttackAble
 * @Auther: ch
 * @Date: 2021/6/11 12:51
 * @Description: 僵尸的攻击行为接口
 */
@FunctionalInterface
public interface AttackAble {
    void attack();
}
