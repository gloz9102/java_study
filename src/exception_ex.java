import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class exception_ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br; 
		String a = null,b=null;
		try {
			System.out.print("a �Է�>>");
			br = new BufferedReader(new InputStreamReader(System.in));
			a = br.readLine();
			System.out.print("b �Է�>>");
			br = new BufferedReader(new InputStreamReader(System.in));
			b=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try{
			System.out.println("a / b = "+Integer.parseInt(a) / Integer.parseInt(b));
		}catch (ArithmeticException e){
			System.err.println("<<<���� �����Դϴ�. ���ڰ� 0���� �Է� �� �� �����ϴ�.>>>");
			e.printStackTrace();
		}catch (NumberFormatException e){
			System.err.println("<<<���ڿ��� �Է� �Ұ����մϴ�. :(>>> ");
			e.printStackTrace();
		}catch (Exception e){
			System.out.println("sigh..");
			e.printStackTrace();
		}
	}

}
