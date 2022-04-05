package pkg1Inheretance;

public class ClassB extends ClassA {

	
	String x = "Velocity";
	
	int b = 12;
	
	
	public void m1()
	{
		super.b =200;   // for value exchange
		
		System.out.println("XYZ");
	}
	
	public static void main(String[] args) {
		
		ClassB k1 = new ClassB();
		
		System.out.println(" No -"+k1.b);
		
		k1.m1();
		
	}
}
