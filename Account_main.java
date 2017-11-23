import java.util.Scanner;

class Account_main{
	int in_choice;//메뉴 내부의 선택
	int update_choice; //update할 아이템 선택
	int update_price;
	String update_item;
	int update_date;
	int delete_choice; //delete할 아이템 선택
	boolean flag=true;//while문 조건
	Scanner scan=new Scanner(System.in);
	public Account_main(){
		//생성자
	}
	public void menu(){
		while(flag){
			System.out.println("1. Create");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Quit");
			System.out.println("Select : ");
			in_choice=scan.nextInt();

			switch(in_choice){

			case 1: 
				if(HW.account_number<20){
					HW.accounts[HW.account_number]=new Account();
					HW.accounts[HW.account_number].create();//해당 배열의 위치에 함수호출해서 생성
					++HW.account_number;//다음 배열로 자리이동
				}
				else
					System.out.println("Capacity exceeded");//배열의 크기를 벗어날 수 없음
				break;

			case 2:
				if(HW.account_number==0){
					System.out.println("There is no data.");
					break;				
				}
				this.list();//update시 리스트를 먼저보여주는 것. 여기서 해도되고 update 메소에서 해도되고! 그냥 여기에 일단 써봤
				System.out.print("Select : ");
				update_choice=scan.nextInt();
				if(update_choice>=HW.account_number || update_choice<0){
					System.out.println("Please check your select!");
					break;
				}
				System.out.print("date(Before "+HW.accounts[update_choice].date+") : ");
				update_date=scan.nextInt();
				HW.accounts[update_choice].date = update_date;
				System.out.print("item(Before "+HW.accounts[update_choice].item+") : ");
				update_item=scan.next();
				HW.accounts[update_choice].item = update_item;
				System.out.print("price(Before "+HW.accounts[update_choice].price+") : ");
				update_price=scan.nextInt();
				HW.accounts[update_choice].price = update_price;
				System.out.println("Update success!");
				System.out.println("-------------------------------------------");
				break;
				
			case 3:
				System.out.println(HW.account_number);
				if(HW.account_number==0){
					System.out.println("There is no data.");
					break;				
				}
				this.list();
				System.out.println("Select : ");
				delete_choice=scan.nextInt();
				if(delete_choice>=HW.account_number || delete_choice<0){
					System.out.println("Please check your select!");
					break;
				}
				int i=0;
				for(i=delete_choice; i<HW.account_number; i++){
					HW.accounts[i]=HW.accounts[i+1];
				}
				HW.account_number--;
				System.out.println("Delete success!");
				System.out.println("-------------------------------------------");
				break;

			case 4: 
				System.out.println("Go to main menu");
				flag=false;
				break;
				
			}	
		}
	}//menu end
	public void list(){
		System.out.println("-------------------------------------------");
		for(int i=0;i<HW.account_number;++i){//업데이트 전에 지금까지의 데이터를 보여줌
			System.out.print(+i+" : " );
			HW.accounts[i].show();
		}
		System.out.println("-------------------------------------------");
	}//list end
}
