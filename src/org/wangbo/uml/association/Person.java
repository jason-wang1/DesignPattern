package org.wangbo.uml.association;

/**
 * Descreption: 双向关联关系
 * Date: 2020年08月09日
 *
 * @author WangBo
 * @version 1.0
 */
public class Person {
    private IDCard card;
}

class IDCard{
    private Person person;
}