class account{
	int balance=0;//잔액
	int acc_num=0;//계좌번호
	void deposit_money(int amount){//입금
		this.balance += amount;
		System.out.println(amount+"원이 계좌로 입금되었습니다.\n잔액 : "+this.balance);
	}
	void withdraw_money(int amount){//출금
		if (this.balance>=amount) { //출금액이 잔액보다 적거나 같을때만 출금 가능
			this.balance -= amount;
		}else { 
			System.out.println(amount+"원을 출금하기 위한 잔액이 모자랍니다. 확인 바랍니다. :( \n잔액 : "+this.balance); 
			return;
			}
		System.out.println(amount+"원이 계좌에서 출금되었습니다.\n잔액 : "+this.balance);
	}
	void check_balance(){
		System.out.println("현재 잔액은 "+this.balance+"원 입니다.");
	}
}
class checkcard extends account{
	int card_num;
	checkcard(account ac){//복사를 위한 생성자
		this.balance=ac.balance;
		this.acc_num=ac.acc_num;
		this.card_num=ac.acc_num;
	}
}
public class main {

	/**
	 * 계좌 클래스의 객체를 생성하여 입금을 하고 잔액을 조회합니다
		또한, 직불카드 클래스의 객체를 위에서 만든 복사를 위한 매개변수가 있는 생성자를 이용하여 
		생성하여 입금을 하고 잔액을 조회합니다 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			account myacc = new account();//계좌 객체 생성
			myacc.deposit_money(5000);
			myacc.withdraw_money(5000);
			myacc.deposit_money(3000);
			System.out.println("======체크카드 생성========");
			/////////////////////////////////////////
			checkcard mycard = new checkcard(myacc);
			mycard.check_balance();
			mycard.deposit_money(10000);
			mycard.withdraw_money(7000);
			
	}

}
