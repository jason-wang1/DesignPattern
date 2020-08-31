package org.wangbo.priciple.inversion.improve;

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

interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{

    @Override
    public String getInfo() {
        return "电子邮件信息：hello，world";
    }
}

// 增加微信
class WeiXin implements IReceiver{

    @Override
    public String getInfo() {
        return "微信信息：hello，world";
    }
}

class Person{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}