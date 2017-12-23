import java.util.Scanner;

class Memo_main{
	int in_choice;//메뉴 내부의 선택
	boolean flag=true;//while문 조건
	Scanner scan=new Scanner(System.in);
	public Memo_main(){
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
			Memo Memo = new Memo();
			
			switch(in_choice){

			case 1: 
				if(HW.memo_number<30){
					HW.memos[HW.memo_number]=new Memo();
					HW.memos[HW.memo_number].type();//해당 배열의 위치에 함수호출해서 생성
					++HW.memo_number;//다음 배열로 자리이동.
				}
				else
					System.out.println("Capacity exceeded");//배열의 크기를 벗어날수없음.
				break;

			case 2: 
				this.list();//update시 리스트를 먼저보여주는 것. 
				Memo memo_u = new Memo();
				memo_u.update();
				break;

			case 3://delete
				this.list();
				Memo memo_d = new Memo();
				memo_d.delete();
				break;

			case 4: 
				System.out.println("Go to main menu");
				flag=false;
				break;
				
			}	//switch end
		}  //while end
	}//menu end
	public void list(){
		System.out.println("-------------------------------------------");
		for(int i=0;i<HW.memo_number;++i){//지금까지의 데이터를 보여줌
			System.out.print(i+" : " );
			HW.memos[i].show();
		}
		System.out.println("-------------------------------------------");
	}
}