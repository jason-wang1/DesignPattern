package org.wangbo.decorator;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月29日
 *
 * @author WangBo
 * @version 1.0
 */
public class Cafe {
    public static void main(String args[]){
        Drink shortBlack = new ShortBlack();
        shortBlack.setSoyNum(2);
        System.out.println(shortBlack.getDesc());

        Drink longBlack = new LongBlack();
        longBlack.setSoyNum(1);
        System.out.println(longBlack.getDesc());
    }
}
