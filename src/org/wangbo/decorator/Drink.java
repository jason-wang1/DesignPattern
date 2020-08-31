package org.wangbo.decorator;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月29日
 *
 * @author WangBo
 * @version 1.0
 */
public abstract class Drink {
    private int milkNum;
    private int soyNum;
    private int chocolateNum;
    String desc;
    float basicFee;

    float cost() {
        float res = basicFee;
        res += milkNum;
        res += soyNum * 2;
        res += chocolateNum * 4;

        return res;
    }

    public String getDesc(){
        return this.desc + " 的费用：" + cost();
    };

    public int getMilkNum() {
        return milkNum;
    }

    public void setMilkNum(int milkNum) {
        this.milkNum = milkNum;
    }

    public int getSoyNum() {
        return soyNum;
    }

    public void setSoyNum(int soyNum) {
        this.soyNum = soyNum;
    }

    public int getChocolateNum() {
        return chocolateNum;
    }

    public void setChocolateNum(int chocolateNum) {
        this.chocolateNum = chocolateNum;
    }

}
