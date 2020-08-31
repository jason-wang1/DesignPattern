package org.wangbo.singleton.type1;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月22日
 *
 * @author WangBo
 * @version 1.0
 */
public class SingletonTest01 {
    public static void main(String args[]){
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

class Singleton {
    private Singleton(){}

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}