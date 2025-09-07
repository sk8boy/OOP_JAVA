package chapter15.example2;

public class Example15_2 {
    public  static void main(String args[]) {
        StringBuffer str=new StringBuffer();	//共享变量
        People personOne, personTwo; 		//声明线程

        //新建线程
        personOne=new People("张三", str);
        personTwo =new People("李四", str);

        //启动线程
        personOne.start();
        personTwo.start();
    }
}

