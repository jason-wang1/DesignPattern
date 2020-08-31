package org.wangbo.priciple.ocp.improve;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月09日
 *
 * @author WangBo
 * @version 1.0
 */
public class Ocp {
    public static void main(String args[]){
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.drawSharp(new Rectangle());
        graphEditor.drawSharp(new Circle());
        graphEditor.drawSharp(new Triangle());
    }
}

// 这是一个绘图的类【使用方】
class GraphEditor{
    // 接收Sharp对象，根据type绘制不同的图形
    public void drawSharp(Sharp s){
        s.draw();
    }
}

// 基类
abstract class Sharp{
    int my_type;
    public abstract void draw(); // 抽象方法
}

class Rectangle extends Sharp{
    Rectangle(){
        super.my_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Sharp{
    Circle(){
        super.my_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class Triangle extends Sharp{
    Triangle(){
        super.my_type = 3;

    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}