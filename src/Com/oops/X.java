package Com.oops;

public class X {
		
		int a=100;
		public void xTest()
		{
			System.out.println("method of X class");
		}

	}

	class Y extends X
	{
		int b=200;
		public void yTest()
		{
			System.out.println("method of Y class");
		}
	}

	class Z extends Y
	{
		int c=300;
		public void zTest()
		{
			System.out.println("method of Z class");
		}
	}


