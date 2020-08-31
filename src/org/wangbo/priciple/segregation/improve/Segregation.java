package org.wangbo.priciple.segregation.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月09日
 *
 * @author WangBo
 * @version 1.0
 */
public class Segregation {
    public static void main(String args[]){
        A a = new A();
        a.depend1(new B()); // A类通过接口依赖B类
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D()); // C类通过接口依赖D类
        c.depend4(new D());
        c.depend5(new D());
    }
}

interface Interface1{
    void oeration1();
}
interface Interface2{
    void oeration2();
    void oeration3();
}
interface Interface3{
    void oeration4();
    void oeration5();
}

class B implements Interface1, Interface2{
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
}

class D implements Interface1, Interface3{
    @Override
    public void oeration1() {
        System.out.println("D实现了operation1");
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
    // A通过接口Interface1、Interface2依赖(使用)B类，会用到1，2，3方法
    public void depend1(Interface1 i){
        i.oeration1();
    }
    public void depend2(Interface2 i){
        i.oeration2();
    }
    public void depend3(Interface2 i){
        i.oeration3();
    }
}

class C {
    // C通过接口Interface1、Interface3依赖(使用)D类，会用到1，4，5方法
    public void depend1(Interface1 i){
        i.oeration1();
    }
    public void depend4(Interface3 i){
        i.oeration4();
    }
    public void depend5(Interface3 i){
        i.oeration5();
    }
}