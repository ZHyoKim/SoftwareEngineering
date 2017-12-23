import java.util.Scanner;

//Memo Manager
class Memo{
	Scanner scan=new Scanner(System.in);
	Scanner scan2=new Scanner(System.in);
	String text=null;
	String testtext=null;
	
	int num;
	private int update_num;
	private int delete_num;
	
	public Memo(){
	}

	public boolean create(String input){
		this.text=input;
		if(text==input)
			return true;
		else
			return false;
	}
	public void type(){//
		System.out.println("-------------------------------------------");
		System.out.print("Memo : ");
		text=scan.nextLine();
		if(create(text))
			System.out.println("Success!");
		System.out.println("-------------------------------------------");
	}
	
	public void update(){
		System.out.println("-------------------------------------------");
		System.out.print("select number you want to update: ");
		update_num= scan.nextInt();
		if(update_num>=0 && update_num < HW.memo_number){
			System.out.print("Memo : ");
			text = scan2.nextLine();
	
			if(HW.memos[update_num].updatetest(update_num,text))
				System.out.println("Success!");
		}
		else{
			System.out.println("Wrong input!");
		}
		System.out.println("-------------------------------------------");
	}
	public boolean updatetest(int update_num, String input) {
		
		testtext = this.text;
		this.text = input;
		//System.out.println("update's this.text "+this.text);
		//System.out.println("update's testtext "+testtext);
		
		if(this.text.equals(testtext))
			return false;
		else
			return true;
			
	}
	public void delete(){ //제거 위한 함수
		System.out.println("-------------------------------------------");
		System.out.print("select number you want to delete: ");
		delete_num = scan.nextInt();
		if(delete_num >= 0 && delete_num < HW.memo_number){
			if(HW.memos[delete_num].deletetest(delete_num))
				System.out.println("Success!");	
		}
		else
			System.out.println("Wrong input!");
		System.out.println("-------------------------------------------");
			
	}
	
	public boolean deletetest(int delete_choice) {
			
			testtext = this.text;
						
			for(int j=delete_choice; j<HW.memo_number; j++){
				HW.memos[j] = HW.memos[j+1];
			}
			HW.memo_number--;
		
			if(this.text == null)
				return true;
			else {
				if(this.text.equals(testtext))
					return false;
				else 
					return true;
			}
	}
	
	
	public void show() {//현 배열의 데이터를 출력하기위한 함수
		System.out.println(text);
	}
}