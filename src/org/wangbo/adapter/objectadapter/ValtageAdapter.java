package org.wangbo.adapter.objectadapter;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月23日
 *
 * @author WangBo
 * @version 1.0
 */
public class ValtageAdapter implements IValtage5V {
    private Valtage220V valtage220V; // 关联关系，聚合关系
    @Override
    public int output5V() {
        int dst = 0;
        if (valtage220V != null) {
            int src = valtage220V.output220V(); // 获取220V电压
            System.out.println("使用对象适配器，进行适配");
            dst = src / 44;
            System.out.println("适配完成，输出电压为：" + dst);
        }
        return dst;
    }

    public ValtageAdapter(Valtage220V valtage220V) {
        this.valtage220V = valtage220V;
    }
}
