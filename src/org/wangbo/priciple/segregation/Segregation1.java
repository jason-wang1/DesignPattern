package org.wangbo.priciple.segregation;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月09日
 *
 * @author WangBo
 * @version 1.0
 */
public class Segregation1 {
    public static void main(String args[]){

    }
}

interface Interface1{
    void oeration1();
    void oeration2();
    void oeration3();
    void oeration4();
    void oeration5();
}

class B implements Interface1{
    @Override
    public void oeration1() {
        System.out.println("B实现了operation1");
    }

    @Override
    public void oeration2() {
        System.out.println("B实现了operation2");
    }

    @Override
    public void oeration3() {
        System.out.println("B实现了operation3");
    }

    @Override
    public void oeration4() {
        System.out.println("B实现了operation4");
    }

    @Override
    public void oeration5() {
        System.out.println("B实现了operation5");
    }
}

class D implements Interface1{
    @Override
    public void oeration1() {
        System.out.println("D实现了operation1");
    }

    @Override
    public void oeration2() {
        System.out.println("D实现了operation2");
    }

    @Override
    public void oeration3() {
        System.out.println("D实现了operation3");
    }

    @Override
    public void oeration4() {
        System.out.println("D实现了operation4");
    }

    @Override
    public void oeration5() {
        System.out.println("D实现了operation5");
    }
}


class A {
    // A通过接口Interface1依赖(使用)B类，但只会用到1，2，3方法
    public void depend1(Interface1 i){
        i.oeration1();
    }
    public void depend2(Interface1 i){
        i.oeration2();
    }
    public void depend3(Interface1 i){
        i.oeration3();
    }
}

class C {
    // C通过接口Interface1依赖(使用)D类，但只会用到1，4，5方法
    public void depend1(Interface1 i){
        i.oeration1();
    }
    public void depend2(Interface1 i){
        i.oeration4();
    }
    public void depend3(Interface1 i){
        i.oeration5();
    }
}