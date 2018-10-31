import java.util.ArrayList;


public class ArrayListFloat {

	
	public static void main(String[] args) {
		ArrayList<Double> BeratBadan = new ArrayList<Double>();	
		BeratBadan.add ((double) 60.17);
		BeratBadan.add ((double) 45.20);
		BeratBadan.add ((double) 50.1);
		BeratBadan.add ((double) 65.10);
		
		System.out.println("Apakah ArrayList ada :" + BeratBadan.size());
		System.out.println("Berat Badan :" + BeratBadan);
		System.out.println("Berapa jumlah data :" + BeratBadan.isEmpty());
		BeratBadan.remove(2);
		System.out.println("Berat Badan :" + BeratBadan);
		

	}

}
