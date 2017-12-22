import java.util.Scanner;

class Calculator{
	double result=0;
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
		String unit_reverse = "";
		switch(unit){
		case "pound":
			result = PoundToKg(value); //value * 0.453592; // pound -> kg
			unit_reverse = "kg";
			break;
		case "kg": //kg -> pound
			result = KgToPound(value); // kg -> pound
			unit_reverse = "pound";
			break;
		case "inch":
			result = InchToCm(value); // inch -> cm
			unit_reverse = "cm";
			break;
		case "cm":
			result = CmToInch(value); // cm -> inch
			unit_reverse = "inch";
			break;
		case "F":
			result = FToC(value) ; // F -> C
			unit_reverse = "C";
			break;
		case "C":
			result = CToF(value); //C -> F
			unit_reverse = "F";
			break;
	
		}
		System.out.println("----------------------------");
		System.out.println(value+ " " +unit + " -> " + result + unit_reverse );
		System.out.println("----------------------------");
		
	}
	
	double PoundToKg(double value){
		return value * 0.453592;
	}
	double KgToPound(double value){
		return value * 2.204622;
	}
	double InchToCm(double value){
		return value * 2.54;
	}
	double CmToInch(double value){
		return value / 2.54;
	}
	double FToC(double value){
		return ((value-32)*5)/9;
	}
	double CToF(double value){
		return value * 9/5 +32;
	}
}
}
