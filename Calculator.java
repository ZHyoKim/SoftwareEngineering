import java.util.Scanner;

class Calculator{
	Calculator(){
		int select;
		do{
			Scanner scan = new Scanner(System.in);
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Convert Units");
			System.out.println("6. Quit");
			
			System.out.print("Select: ");
			select = scan.nextInt();
			switch(select){
			case 1:
				System.out.println("----------------------------");
				System.out.print("Enter 2 numbers: ");
				double add_n1 = scan.nextDouble();
				double add_n2 = scan.nextDouble();
				System.out.println(add_n1 + " + " + add_n2 + " = "+add(add_n1,add_n2));
				System.out.println("----------------------------");
				break;
			case 2:
				System.out.println("----------------------------");
				System.out.print("Enter 2 numbers: ");
				double sub_n1 = scan.nextDouble();
				double sub_n2 = scan.nextDouble();
				System.out.println(sub_n1 + " - " + sub_n2 + " = "+subtract(sub_n1,sub_n2));
				System.out.println("----------------------------");
				break;
			case 3:
				System.out.println("----------------------------");
				System.out.print("Enter 2 numbers: ");
				double mulpy_n1 = scan.nextDouble();
				double mulpy_n2 = scan.nextDouble();
				System.out.println(mulpy_n1 + " x " + mulpy_n2 + " = "+multiply(mulpy_n1,mulpy_n2));
				System.out.println("----------------------------");
				break;
			case 4:
				System.out.println("----------------------------");
				System.out.print("Enter 2 numbers: ");
				double div_n1 = scan.nextDouble();
				double div_n2 = scan.nextDouble();
				while(div_n2 == 0){
					System.out.println("ERROR: CAN'T BE DIVIDED BY ZERO");
					System.out.print("Enter 2 numbers: ");
					div_n1 = scan.nextDouble();
					div_n2 = scan.nextDouble();
				}
				System.out.println(div_n1 + " / " + div_n2 + " = "+divide(div_n1,div_n2));
				System.out.println("----------------------------");
				break;
			case 5:
				System.out.println("----------------------------");
				System.out.print("value:");
				double convert_n = scan.nextDouble();
				System.out.print("unit (pound,kg,inch,cm,F,C): ");
				String unit = scan.next();
				convert(convert_n,unit);
				break;
			case 6:
				System.out.println("Go to main menu");
				return;
			default:
				System.out.println("Please check your number");
			}
		}while(select != 6);
	}
	double add(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

	double subtract(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}

	double multiply(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}

	double divide(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1/n2;
	}

	void convert(double value, String unit) {
		// TODO Auto-generated method stub
		switch(unit){
		case "pound":
			System.out.println("----------------------------");
			double kg_value = value * 0.453592; // pound -> kg
			System.out.println(value+ " pound" + " -> " + kg_value + " kg" );
			System.out.println("----------------------------");
			break;
		case "kg": //kg -> pound
			System.out.println("----------------------------");
			double pound_value = value * 2.204622; // kg -> pound
			System.out.println(value+ " kg" + " -> " + pound_value + " pound" );
			System.out.println("----------------------------");
			break;
		case "inch":
			System.out.println("----------------------------");
			double cm_value = value * 2.54; // inch -> cm
			System.out.println(value+ " inch" + " -> " + cm_value + " cm" );
			System.out.println("----------------------------");
			break;
		case "cm":
			System.out.println("----------------------------");
			double inch_value = value / 2.54; // cm -> inch
			System.out.println(value+ " cm" + " -> " + inch_value + " inch" );
			System.out.println("----------------------------");
			break;
		case "F":
			System.out.println("----------------------------");
			double C_value = ((value-32)*5)/9 ; // F -> C
			System.out.println(value+ " F" + " -> " + C_value + " C" );
			System.out.println("----------------------------");
			break;
		case "C":
			System.out.println("----------------------------");
			double F_value = value * 9/5 +32; //C -> F
			System.out.println(value+ "C" + "-> " + F_value + "F" );
			System.out.println("----------------------------");
			break;
	
		}
	}

}