package org.wangbo.facade;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年09月02日
 *
 * @author WangBo
 * @version 1.0
 */
public class TheaterLight {
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on() {
        System.out.println(" TheaterLight up ");
    }

    public void off() {
        System.out.println(" TheaterLight down ");
    }

    public void bright() {
        System.out.println(" TheaterLight bright ");
    }

    public void dim() {
        System.out.println(" TheaterLight dim ");
    }
}
