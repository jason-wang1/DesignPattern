package org.wangbo.facade;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年09月02日
 *
 * @author WangBo
 * @version 1.0
 */
public class DVDPlayer {
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on() {
        System.out.println(" dvd on ");
    }

    public void off() {
        System.out.println(" dvd off ");
    }

    public void play(){
        System.out.println(" dvd is playing ");
    }

    public void pause(){
        System.out.println(" dvd pause .. ");
    }

}
