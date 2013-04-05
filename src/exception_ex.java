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
			System.out.print("a 입력>>");
			br = new BufferedReader(new InputStreamReader(System.in));
			a = br.readLine();
			System.out.print("b 입력>>");
			br = new BufferedReader(new InputStreamReader(System.in));
			b=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try{
			System.out.println("a / b = "+Integer.parseInt(a) / Integer.parseInt(b));
		}catch (ArithmeticException e){
			System.err.println("<<<연산 오류입니다. 인자가 0으로 입력 된 것 같습니다.>>>");
			e.printStackTrace();
		}catch (NumberFormatException e){
			System.err.println("<<<문자열은 입력 불가능합니다. :(>>> ");
			e.printStackTrace();
		}catch (Exception e){
			System.out.println("sigh..");
			e.printStackTrace();
		}
	}

}
