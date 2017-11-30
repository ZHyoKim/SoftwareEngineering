import java.util.Scanner;

//Memo Manager
class Memo{
	Scanner scan=new Scanner(System.in);
	Scanner scan2=new Scanner(System.in);
	String text;
	
	int num;
	public Memo(){
	}

	public void create(){//
		System.out.println("-------------------------------------------");
		System.out.print("Memo : ");
		text=scan.nextLine();
		System.out.println("Success!");
		System.out.println("-------------------------------------------");
	}

	
	public void update(){
		System.out.println("-------------------------------------------");
		System.out.print("select number you want to update: ");
		int num = scan.nextInt();//update하고 싶은 숫자 
		if(num < HW.memo_number){
			
			System.out.print("Memo : ");
			text = scan2.nextLine();
			HW.memos[num].text = text;
			System.out.println("Success!");
		}
		else{
			System.out.println("Wrong input!");
			
		}
	
		System.out.println("-------------------------------------------");
	}
	public void delete(){ //제거 위한 함수
		System.out.println("-------------------------------------------");
		System.out.print("select number you want to delte: ");
		num = scan.nextInt();
		if(num < HW.memo_number){
			for(int j=num; j<=HW.memo_number; j++){
				HW.memos[j] = HW.memos[j+1];
				
			}
			--HW.memo_number;
			System.out.println("Success!");	
		}
		else
			System.out.println("Wrong input!");
		System.out.println("-------------------------------------------");
			
	}
	public void show() {//현 배열의 데이터를 출력하기위한 함수
		System.out.println(text);
	}
}