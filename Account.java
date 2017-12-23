import java.util.Scanner;

class Account{
	Scanner scan=new Scanner(System.in);
	Scanner scan2=new Scanner(System.in);
	int price;
	String item;
	int date;
	int update_choice; //update할 아이템 선택
	int update_price;
	String update_item;
	int update_date;
	int delete_choice; //delete할 아이템 선택
	
	public Account(){
	}

	public boolean create(int date,String item,int price){
		this.date=date;
		this.item=item;
		this.price=price;
		if(this.date==date&&this.item==item&&this.price==price)
			return true;
		else
			return false;
	}
	public void type(){//
		System.out.println("-------------------------------------------");
		System.out.print("date : ");
		date=scan.nextInt();
		System.out.print("item: ");
		item=scan2.next();
		System.out.print("price : ");
		price=scan.nextInt();
		if (create(date,item,price))
			System.out.println("Success!");
		System.out.println("-------------------------------------------");

	}

	public void show() {//현 배열의 데이터를 출력하기위한 함수
		System.out.println( " [date=" + date + ", item=" + item + ", price=" + price + "]");
	}
	

	public void updateInput() {
		Account_main account_main = new Account_main();
		account_main.list();
		System.out.print("Select : ");
		update_choice=scan.nextInt();
		if(update_choice>=HW.account_number || update_choice<0){
			System.out.println("Please check your select!");
			return;
		}
		System.out.print("date(Before "+HW.accounts[update_choice].date+") : ");
		update_date=scan.nextInt();
	//	HW.accounts[update_choice].date = update_date;
		System.out.print("item(Before "+HW.accounts[update_choice].item+") : ");
		update_item=scan.next();
	//	HW.accounts[update_choice].item = update_item;
		System.out.print("price(Before "+HW.accounts[update_choice].price+") : ");
		update_price=scan.nextInt();
	//	HW.accounts[update_choice].price = update_price;
		if (update(update_choice, update_date, update_item, update_price))
			System.out.println("Update success!");
		System.out.println("-------------------------------------------");
		
	}
	
	static boolean update(int update_choice, int update_date, String update_item, int update_price){
		HW.accounts[update_choice].date = update_date;
		HW.accounts[update_choice].item = update_item;
		HW.accounts[update_choice].price = update_price;
		if(HW.accounts[update_choice].date == update_date && HW.accounts[update_choice].item == update_item &&
				HW.accounts[update_choice].price == update_price)
			return true;
		else
			return false;
		
	}
	
	public void deleteInput() {
		Account_main account_main = new Account_main();
		account_main.list();
		System.out.println("Select : ");
		delete_choice=scan.nextInt();
		if(delete_choice>=HW.account_number || delete_choice<0){
			System.out.println("Please check your select!");
			return;
		}
		int result = delete(delete_choice);
	}
	
	static int delete(int delete_choice){
		int i=0;
		for(i=delete_choice; i<HW.account_number; i++){
			HW.accounts[i]=HW.accounts[i+1];
		}
		HW.account_number--;
		System.out.println("Delete success!");
		System.out.println("-------------------------------------------");
		return HW.account_number;
	}

}


