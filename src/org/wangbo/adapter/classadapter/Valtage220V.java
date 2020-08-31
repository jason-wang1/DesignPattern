package org.wangbo.adapter.classadapter;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月23日
 *
 * @author WangBo
 * @version 1.0
 */


// 被适配的类
public class Valtage220V {

    // 输出220V电压
    public int output220V(){
        int src = 220;
        System.out.println("电压："+ src + "伏");
        return src;
    }
}
