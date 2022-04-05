package pkg1Inheretance;

public class ClassC {

	public static void main(String[] args) {
		
		
		ClassA k = new ClassB();
		
		k.m1();    // we have to call meth1 first
		System.out.println("No "+k.b);
		
	

	}

}
