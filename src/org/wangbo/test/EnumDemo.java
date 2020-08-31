package org.wangbo.test;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月09日
 *
 * @author WangBo
 * @version 1.0
 */
public class EnumDemo {
    public static void main(String args[]){
        Day monday = Day.MONDAY;
        Day monday1 = Day.MONDAY;
        Day tuesday = Day.TUESDAY;
        Day tuesday1 = Day.TUESDAY;
        System.out.println(monday.hashCode());
        System.out.println(monday1.ordinal());
        System.out.println(tuesday.ordinal());
        System.out.println(tuesday1.valueOf("MONDAY"));
    }
}

enum Day{
    MONDAY,
    TUESDAY,
}
