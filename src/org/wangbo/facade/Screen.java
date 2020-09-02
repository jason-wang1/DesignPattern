package org.wangbo.facade;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年09月02日
 *
 * @author WangBo
 * @version 1.0
 */
public class Screen {
    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void on() {
        System.out.println(" Screen up ");
    }

    public void off() {
        System.out.println(" Screen down ");
    }

}
