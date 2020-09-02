package org.wangbo.facade;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年09月02日
 *
 * @author WangBo
 * @version 1.0
 */
public class Stereo {
    private static Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    public void on() {
        System.out.println(" Stereo up ");
    }

    public void off() {
        System.out.println(" Stereo down ");
    }

    public void up() {
        System.out.println(" Stereo up ");
    }
}
