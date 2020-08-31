package org.wangbo.priciple.ocp;

/**
 * Descreption: XXXX<br/>
 * Date: 2020年08月09日
 *
 * @author WangBo
 * @version 1.0
 */
public class Ocp {
    public static void main(String args[]){
        // 看看存在的问题
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.drawRectangle(new Rectangle());
        graphEditor.drawCircle(new Circle());
        graphEditor.drawTriangle(new Triangle());
    }
}

// 这是一个绘图的类【使用方】
class GraphEditor{
    // 接收Sharp对象，根据type绘制不同的图形
    public void drawSharp(Sharp s){
        if (s.my_type == 1){
            drawRectangle(s);
        }else if (s.my_type == 2){
            drawCircle(s);
            // 新增代码
        }else if (s.my_type == 3){
            drawTriangle(s);
        }
    }

    public void drawRectangle(Sharp r){
        System.out.println("绘制矩形");
    }

    public void drawCircle(Sharp r){
        System.out.println("绘制圆形");
    }

    // 新增代码
    public void drawTriangle(Sharp r){
        System.out.println("绘制三角形");
    }

}

// 基类
class Sharp{
    int my_type;
}

class Rectangle extends Sharp{
    Rectangle(){
        super.my_type = 1;
    }
}

class Circle extends Sharp{
    Circle(){
        super.my_type = 2;
    }
}

// 新增一个三角形
class Triangle extends Sharp{
    Triangle(){
        super.my_type = 3;
    }
}