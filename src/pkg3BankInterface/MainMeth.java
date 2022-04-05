package pkg3BankInterface;

public class MainMeth {

	public static void main(String[] args) {

		HDFC k = new HDFC();

		System.out.println("Note - "+k.note);
		System.out.println("Bank Name - "+k.bname);
		System.out.println("Customer Name - "+k.name);
		System.out.println("Passbook No. - "+k.pass);
		System.out.println("Customer Grade - "+k.customType);
		System.out.println("ATM no - "+k.atm);
		
		k.m1();
		k.m2();
		
		System.out.println("=================================================");

		SBI k1 = new SBI();

		System.out.println("Note - "+k1.note);
		System.out.println("Bank Name - "+k1.bname);
		System.out.println("Customer Name - "+k1.name);
		System.out.println("Passbook No. - "+k.pass);
		System.out.println("Customer Grade - "+k1.customType);
		System.out.println("ATM no - "+k1.atm);
		
		k1.m1();
		k1.m2();

		System.out.println("====================================================");

		KOTAK k3 = new KOTAK();

		System.out.println("Note - "+k3.note);
		System.out.println("Bank Name - "+k3.bname);
		System.out.println("Customer Name - "+k3.name);
		System.out.println("Passbook No. - "+k.pass);
		System.out.println("Customer Grade - "+k3.customType);
		System.out.println("ATM no - "+k3.atm);
		
		k3.m1();
		k3.m2();

		System.out.println("=====================================================");

		AXIS k4 = new AXIS();

		System.out.println("Note - "+k4.note);
		System.out.println("Bank Name - "+k4.bname);
		System.out.println("Customer Name - "+k4.name);
		System.out.println("Passbook No. - "+k.pass);
		System.out.println("Customer Grade - "+k4.customType);
		System.out.println("ATM no - "+k4.atm);

		k4.m1();
		k4.m2();
		
		System.out.println("======================================================");

	}

}
