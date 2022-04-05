package pkg2Vehichal;

public class MainMeth {

	public static void main(String[] args) {

		Bike k = new Bike();
		k.wheel = 2;
		k.seat = 2;
		k.engine = "2 Strock";

		System.out.println("This is "+k.wheel+" Wheeler");
		System.out.println("Seat No - "+k.seat);
		System.out.println("This is "+k.engine+" Engine");

		k.m1();
		k.m2();

		System.out.println("=================================================");

		Car k1 = new Car();

		k1.wheel = 4;
		k1.seat = 4;
		k1.engine = "4 Strock";

		System.out.println("This is "+k1.wheel+" Wheeler");
		System.out.println("Seat No - "+k1.seat);
		System.out.println("This is "+k1.engine+" Engine");

		k1.m1();
		k1.m3();

		System.out.println("====================================================");

		Truck k2 = new Truck();


		k2.wheel = 8;
		k2.seat = 5;
		k2.engine = "6 Strock";

		System.out.println("This is "+k2.wheel+" Wheeler");
		System.out.println("Seat No - "+k2.seat);
		System.out.println("This is "+k2.engine+" Engine");

		k2.m1();
		k2.m4();















	}

}
