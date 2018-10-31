
public class MainStackString {

	public static void main(String[] args) {
	StackString Nama = new StackString();
	Nama.cetak();
	
	
	Nama.push("YULIANA"); Nama.cetak();
	Nama.push("RENITA"); Nama.cetak();
	Nama.push("MITA"); Nama.cetak();
	Nama.push("JJIRA"); Nama.cetak();
	  
	
	String nm = Nama.pop(); Nama.cetak();
	System.out.println(nm);
}
}