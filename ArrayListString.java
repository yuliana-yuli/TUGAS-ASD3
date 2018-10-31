import java.util.ArrayList;
public class ArrayListString {

	
	public static void main(String[] args) {
		ArrayList<String> Mahasiswa = new ArrayList<String>();
		Mahasiswa.add("YULIANA");
		Mahasiswa.add("RENITA");
		Mahasiswa.add("MITA");
		Mahasiswa.add("JIRA");
		
		ArrayList<String> Mahasiswa1 = Mahasiswa;
		System.out.println("1" + Mahasiswa.toString());
		System.out.println("2" + Mahasiswa.toString());
		Mahasiswa.remove(1);
		System.out.println("1" + Mahasiswa.toString());
		System.out.println("2" + Mahasiswa.toString());

	}

}
