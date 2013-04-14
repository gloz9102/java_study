import java.util.ArrayList;
import java.util.Collections;

class Data implements Comparable<Data>{
	private ArrayList <Integer> list=new ArrayList<>();
	Data(int i){
		for(int j=i;j<i+5;j++){
			Double ran=Math.random();
			int t=(int)(ran*50);
			list.add(t);
			System.out.println("리스트에 ["+t+"]를 넣음");
			
		}
	}
	public ArrayList<Integer> getList() {
		return list;
	}
	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}
	public void printList(){
		for(int i : this.getList()) {
			System.out.println(i);
		}
	}
	@Override
	public int compareTo(Data arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())	
			return false;
		Data other = (Data) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}
}
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1=new Data(0);
		Data d2=new Data(0);
		System.out.println("Data1의 리스트 내용");
		System.out.println(d1.getList());
		System.out.println("Data2의 리스트 내용");
		System.out.println(d2.getList());

		Collections.sort(d1.getList());
		Collections.sort(d2.getList());
		System.out.println("Data1의 리스트 내용");
		System.out.println(d1.getList());
		System.out.println("Data2의 리스트 내용");
		System.out.println(d2.getList());
		
		
	}

}
