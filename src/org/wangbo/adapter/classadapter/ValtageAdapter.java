package org.wangbo.adapter.classadapter;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月23日
 *
 * @author WangBo
 * @version 1.0
 */
public class ValtageAdapter extends Valtage220V implements IValtage5V {
    @Override
    public int output5V() {
        // 获取220V电压
        int srcV = output220V();
        int dstV = srcV / 44;
        return dstV;
    }
}
