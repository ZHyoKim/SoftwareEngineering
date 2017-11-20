import java.util.Scanner;

//Memo Manager
class Memo{
	Scanner scan=new Scanner(System.in);
	Scanner scan2=new Scanner(System.in);
	String text;
	public Memo(){
	}

	public void create(){//
		System.out.println("-------------------------------------------");
		System.out.print("Memo : ");
		text=scan.nextLine();
		System.out.println("Success!");
		System.out.println("-------------------------------------------");
	}

	public void show() {//현 배열의 데이터를 출력하기위한 함수
		System.out.println( text);
	}
}
