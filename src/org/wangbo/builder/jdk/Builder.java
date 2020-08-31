package org.wangbo.builder.jdk;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月28日
 *
 * @author WangBo
 * @version 1.0
 */
public class Builder {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StringBuilder stringBuilder = new StringBuilder("hello,world");
        stringBuilder.append("are");
        String string = stringBuilder.toString();
        System.out.println(string);
    }
}
