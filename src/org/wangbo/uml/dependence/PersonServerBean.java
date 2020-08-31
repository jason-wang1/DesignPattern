package org.wangbo.uml.dependence;

/**
 * Descreption: 依赖关系
 * Date: 2020年08月09日
 *
 * @author WangBo
 * @version 1.0
 */
public class PersonServerBean {
    private PersonDao personDao; // 成员属性
    public void save(Person person){} // 接收的参数类型
    public IDCard getIDCard(Integer personId){ return null;} // 方法返回类型
    public void modify(){
        Department department = new Department(); // 方法中使用到
    }
}

class PersonDao{ }
class Person{}
class IDCard{}
class Department{}