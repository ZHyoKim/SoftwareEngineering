import java.util.Scanner;

class Memo_main{
	int in_choice;//�޴� ������ ����
	boolean flag=true;//while�� ����
	Scanner scan=new Scanner(System.in);
	public Memo_main(){
		//������
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
					HW.memos[HW.memo_number].type();//�ش� �迭�� ��ġ�� �Լ�ȣ���ؼ� ����
					++HW.memo_number;//���� �迭�� �ڸ��̵�.
				}
				else
					System.out.println("Capacity exceeded");//�迭�� ũ�⸦ ���������.
				break;

			case 2: 
				this.list();//update�� ����Ʈ�� ���������ִ� ��. 
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
		for(int i=0;i<HW.memo_number;++i){//���ݱ����� �����͸� ������
			System.out.print(i+" : " );
			HW.memos[i].show();
		}
		System.out.println("-------------------------------------------");
	}
}