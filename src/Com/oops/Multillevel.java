package Com.oops;

public class Multillevel {
	public static void main(String[] args) {
		Y y=new Y();
		System.out.println(y.a);
		y.xTest();
		
		
		Z z=new  Z();
		System.out.println(z.b);
		z.yTest();
		System.out.println(z.c);
		z.zTest();
		
		

	}

}



