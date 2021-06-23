package com.ch.testProject;

/**
 * @className: Class
 * @Auther: ch
 * @Date: 2021/6/3 10:44
 * @Description: TODO
 */
public class Clazz {
    public String banji;
    private String paiming;

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    public String getPaiming() {
        return paiming;
    }

    public void setPaiming(String paiming) {
        this.paiming = paiming;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "banji='" + banji + '\'' +
                ", paiming='" + paiming + '\'' +
                '}';
    }
}
