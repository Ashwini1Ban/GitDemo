package pckdummy;

public class userA {

	void t1()
	{
		System.out.println("hi");
	}
	
	void t2()
	{ 
		System.out.println("hello");
	}
	
	void t3()
	{ 
		System.out.println("userB changes");
	}
	
	
	
	public static void main(String[] args) {
		userA aa=new userA();
	    aa.t1();
		aa.t2();
		
	}

}
