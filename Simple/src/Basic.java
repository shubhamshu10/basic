import java.util.HashSet;
import java.util.Set;
class Shn{
	public synchronized static void disp(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i+" ");
		}
	}
}
class A extends Thread{
	public void run(){
        Shn.disp(5);
        System.out.println(Thread.currentThread().getName());
	}
}
class B extends Thread{
	public void run(){
		Thread.currentThread().setPriority(NORM_PRIORITY);
        Shn.disp(19);
        System.out.println(Thread.currentThread().getName());
	}
}

public class Basic {
   
	public static void main(String[] args) {
		A obj1 =new A();
		B obj2 = new B();
		obj1.start();
		//System.out.println();
		obj2.start();
		
    }
}
