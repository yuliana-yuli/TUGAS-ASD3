
public class MainStackFloat {

	public static void main(String[] args) {
		
		StackFloat Berat = new StackFloat();
		Berat.cetak();
		
		Berat.push ((float) 60.17);Berat.cetak();
		Berat.push ((float) 45.20);Berat.cetak();
		Berat.push ((float) 50.1);Berat.cetak();
		Berat.push ((float) 65.10);;Berat.cetak();
		
		
		Float br = Berat.pop(); Berat.cetak();
		System.out.println(br);
		

	}

}
