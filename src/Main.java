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
		//���� �������̽��� ���������� ����� �ִ� ��� ��ü�� �����մϴ� 
		//���簢���� �ν��Ͻ��� �����Ҽ� �ִ� Ŭ���� �Ǵ� �������̽��� ��� ���� �� ���ϴ�
		System.out.println("�簢�� 1�� ����>>"+s1.area());
		System.out.println("���簢�� 1�� ����>>"+s2.area());
		System.out.println("�� 1�� ����>>"+c.area());
		
	}
}
/*
class account{//����
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
*/