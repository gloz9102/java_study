class account{
	int balance=0;//�ܾ�
	int acc_num=0;//���¹�ȣ
	void deposit_money(int amount){//�Ա�
		this.balance += amount;
		System.out.println(amount+"���� ���·� �ԱݵǾ����ϴ�.\n�ܾ� : "+this.balance);
	}
	void withdraw_money(int amount){//���
		if (this.balance>=amount) { //��ݾ��� �ܾ׺��� ���ų� �������� ��� ����
			this.balance -= amount;
		}else { 
			System.out.println(amount+"���� ����ϱ� ���� �ܾ��� ���ڶ��ϴ�. Ȯ�� �ٶ��ϴ�. :( \n�ܾ� : "+this.balance); 
			return;
			}
		System.out.println(amount+"���� ���¿��� ��ݵǾ����ϴ�.\n�ܾ� : "+this.balance);
	}
	void check_balance(){
		System.out.println("���� �ܾ��� "+this.balance+"�� �Դϴ�.");
	}
}
class checkcard extends account{
	int card_num;
	checkcard(account ac){//���縦 ���� ������
		this.balance=ac.balance;
		this.acc_num=ac.acc_num;
		this.card_num=ac.acc_num;
	}
}
public class main {

	/**
	 * ���� Ŭ������ ��ü�� �����Ͽ� �Ա��� �ϰ� �ܾ��� ��ȸ�մϴ�
		����, ����ī�� Ŭ������ ��ü�� ������ ���� ���縦 ���� �Ű������� �ִ� �����ڸ� �̿��Ͽ� 
		�����Ͽ� �Ա��� �ϰ� �ܾ��� ��ȸ�մϴ� 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			account myacc = new account();//���� ��ü ����
			myacc.deposit_money(5000);
			myacc.withdraw_money(5000);
			myacc.deposit_money(3000);
			System.out.println("======üũī�� ����========");
			/////////////////////////////////////////
			checkcard mycard = new checkcard(myacc);
			mycard.check_balance();
			mycard.deposit_money(10000);
			mycard.withdraw_money(7000);
			
	}

}
