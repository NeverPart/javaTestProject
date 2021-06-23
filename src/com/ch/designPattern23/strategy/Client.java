package com.ch.designPattern23.strategy;

/**
 * @className: Client
 * @Auther: ch
 * @Date: 2021/6/11 13:03
 * @Description: 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("==========简单僵尸==========");
        Zombie zombie = new SimpleZombie();
        zombie.display();
        zombie.attack();
        zombie.move();
        System.out.println("==========大头僵尸==========");
        Zombie bigheadZombie = new BigHeadZombie();
        bigheadZombie.display();
        //bigheadZombie.setAttackable(new SimpleZombieAttack());
        bigheadZombie.attack();
        bigheadZombie.move();
        System.out.println("==========橄榄球僵尸==========");
        Zombie ganlanqiu = new GanlanqiuZombie();
        ganlanqiu.display();
        ganlanqiu.attack();
        ganlanqiu.move();


    }
}
