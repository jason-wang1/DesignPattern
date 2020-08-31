package org.wangbo.adapter.classadapter;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月23日
 *
 * @author WangBo
 * @version 1.0
 */
public class Phone {
    // 充电方法
    public void charging(IValtage5V iValtage5V){
        if (iValtage5V.output5V() == 5){
            System.out.println("电压为5V，可以充电");
        } else {
            System.out.println("电压不匹配，无法充电");
        }
    }
}
