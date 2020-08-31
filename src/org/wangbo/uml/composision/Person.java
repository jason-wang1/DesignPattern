package org.wangbo.uml.composision;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月09日
 *
 * @author WangBo
 * @version 1.0
 */
public class Person{
    private IDCard idCard; // 聚合关系
    private Head head = new Head(); // 组合关系
}

class IDCard{}
class Head{}