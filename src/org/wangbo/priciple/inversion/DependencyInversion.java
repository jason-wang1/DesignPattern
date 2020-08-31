package org.wangbo.priciple.inversion;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月09日
 *
 * @author WangBo
 * @version 1.0
 */
public class DependencyInversion {
    public static void main(String args[]){
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息：hello，world";
    }
}

class WeiXin {

    public String getInfo() {
        return "微信信息：hello，world";
    }
}

/**
 * 完成Person接收消息的功能
 * 问题：如果获取的对象是微信、短信等，则要新增类，并且Person类也要新增相应的方法
 * 解决思路：引入抽象接口IReceiver，表示接收者，Person与接口IReceiver发生依赖
 * 因为Email、微信等都各自实现了IReceiver，符合依赖倒转原则
 *
 */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }

    public void receive(WeiXin weiXin){
        System.out.println(weiXin.getInfo());
    }
}
