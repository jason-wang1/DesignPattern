package org.wangbo.adapter.interfaceadapter;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月23日
 *
 * @author WangBo
 * @version 1.0
 */
public class Client {
    public static void main(String args[]){
        AbsAdapter absAdapter = new AbsAdapter(){

            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        absAdapter.m1();
        absAdapter.m2();
    }
}
