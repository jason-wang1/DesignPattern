package org.wangbo.decorator.jdk;

import java.io.*;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月29日
 *
 * @author WangBo
 * @version 1.0
 */
public class Decorator {
    public static void main(String args[]) throws Exception{

        /**
         * 说明：
         * 1. InputStream是抽象类，类似前面说的Drink
         * 2. FileInputStream是InputStream的子类，类似前面的LongBlack
         * 3. FilterInputStream是InputStream的子类，类似前面的Decorator装饰者
         * 4. DataInputStream是FilterInputStream的子类，具体修饰者，类似前面的Milk、Soy
         * 5. FilterInputStream聚合了InputStream，含有被装饰者
         */
//        DataInputStream dis = new DataInputStream(new FileInputStream("D:\\Desktop.log"));
//        System.out.println(dis.read());
//        dis.close();
//
//        FileInputStream is = new FileInputStream("D:\\data\\test.txt");
//        FilterInputStream fis = new BufferedInputStream(is);
//
//        System.out.println((char) fis.read());
//        fis.mark(0);
//        System.out.println((char) fis.read());
//        fis.reset();


        DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\java.txt"));
        dos.writeInt(1234567);
        DataInputStream dis = new DataInputStream(new FileInputStream("D:\\java.txt"));
        System.out.println(dis.readInt());
        dis.close();
        dos.close();


    }
}
