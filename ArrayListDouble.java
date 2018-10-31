import java.util.ArrayList;
public class ArrayListDouble {

	
	public static void main(String[] args) {
		ArrayList<Double> TinggiBadan = new ArrayList<Double>();
		TinggiBadan.add ((double) 150.10);
		TinggiBadan.add ((double) 125.15);
		TinggiBadan.add ((double) 140.35);
		TinggiBadan.add ((double) 155.20);
		
		System.out.println("Berapa Banyak Data :" + TinggiBadan.size());
		System.out.println("TinggiBadan :" + TinggiBadan);
		TinggiBadan.set(1, (double) 38.10);
		TinggiBadan.set(2, (double) 38.25);
		System.out.println("TinggiBadan :" + TinggiBadan);

	}

}
