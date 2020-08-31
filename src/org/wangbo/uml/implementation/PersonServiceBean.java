package org.wangbo.uml.implementation;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月09日
 *
 * @author WangBo
 * @version 1.0
 */
public class PersonServiceBean implements PersonService {
    @Override
    public void delete(Integer id) { }
}

interface PersonService{
    public void delete(Integer id);
}