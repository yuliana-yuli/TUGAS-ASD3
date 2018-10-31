public class MainStackDouble {

	public static void main(String[] args) {
		
		StackDouble Tinggi = new StackDouble();
		Tinggi.cetak();
		
		Tinggi.push ((double) 150.10);Tinggi.cetak();
		Tinggi.push ((double) 125.15);Tinggi.cetak();
		Tinggi.push ((double) 140.35);Tinggi.cetak();
		Tinggi.push ((double) 155.20);Tinggi.cetak();
		
		Double tg = Tinggi.pop(); Tinggi.cetak();
		System.out.println(tg);
		

	}

}
