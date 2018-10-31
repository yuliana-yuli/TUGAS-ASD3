import java.util.ArrayList;


public class StackString {

	ArrayList<String> Teknik = new ArrayList<String>();
	int top = -1;
	
	public void push(String value) {
		Teknik.add(value);
		top = top + 1;
	}
	public String pop(){
		String value= Teknik.get (top);
		Teknik.remove(top);
		top = top - 1;
		return value;
	}
	public void cetak(){
		System.out.println(Teknik.toString());
		

	}

}
