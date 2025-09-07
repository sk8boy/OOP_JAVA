package chapter15.example1;

public class MultThreadOne {
    public static void main(String agrs[]){
        Thread one=new threadTest("one" );
        Thread two=new threadTest("two" );
        Thread three=new threadTest("three" );

        //设置线程优先权
        one.setPriority(Thread.MIN_PRIORITY);
        two.setPriority(Thread.NORM_PRIORITY);
        three.setPriority(Thread.MAX_PRIORITY);

        one.start( );
        two.start( );
        three.start( );
    }
}

class threadTest extends Thread {

    public threadTest(String str){
        super(str);
    }

    public void run( ) {
        try{
            Thread.sleep(2);    //线程休眠
        }catch(InterruptedException e) {
            System.err.println(e.toString( ));
        }

        System.out.println(getName( )+" " +  getPriority( ));
    }
}

