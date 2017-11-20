import java.util.Scanner;

class Account{
	Scanner scan=new Scanner(System.in);
	Scanner scan2=new Scanner(System.in);
	int price;
	String item;
	int date;

	public Account(){
	}

	public void create(){//
		System.out.println("-------------------------------------------");
		System.out.print("date : ");
		date=scan.nextInt();
		System.out.print("item: ");
		item=scan2.next();
		System.out.print("price : ");
		price=scan.nextInt();
		System.out.println("Success!");
		System.out.println("-------------------------------------------");

	}

	public void show() {//현 배열의 데이터를 출력하기위한 함수
		System.out.println( " [date=" + date + ", item=" + item + ", price=" + price + "]");
	}

}
