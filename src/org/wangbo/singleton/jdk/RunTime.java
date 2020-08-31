package org.wangbo.singleton.jdk;

import java.text.NumberFormat;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月29日
 *
 * @author WangBo
 * @version 1.0
 */
public class RunTime {
    public static void main(String args[]){
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());

        NumberFormat instance = NumberFormat.getInstance();
    }
}
