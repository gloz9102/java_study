interface Shape{ 
	double area();
};
class Square implements Shape{
	double width,height;
	
	Square(){
		this(50,70);
	}
	Square(double width,double height){
		this.width=width;
		this.height=height;
	}
	@Override
	public double area() {//width*height
		// TODO Auto-generated method stub
		return width*height;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
}
class Circle implements Shape{
	double radius;
	
	Circle(){
		this(10);
	}
	Circle(double radius){
		this.radius=radius;
	}
	@Override
	public double area() {//radius*radius*3.14
		// TODO Auto-generated method stub
		return radius*radius*3.14;
	}
	public double getRadius() {
		return radius;
	}
	
}
class Square2 extends Square{
	Square2(){
		super();
	}
	Square2(double width,double height){
		super(width,height);
	}
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Square(25,20);
		Shape s2 = new Square2(50,50);
		Shape c = new Circle(11);
		//도형 인터페이스의 참조변수로 만들수 있는 모든 객체를 생성합니다 
		//정사각형의 인스턴스를 참조할수 있는 클래스 또는 인터페이스로 모두 참조 해 봅니다
		System.out.println("사각형 1의 넓이>>"+s1.area());
		System.out.println("정사각형 1의 넓이>>"+s2.area());
		System.out.println("원 1의 넓이>>"+c.area());
		
	}
}
/*
class account{//계좌
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
*/