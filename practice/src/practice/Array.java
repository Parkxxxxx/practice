package practice;

public class Array {
	
	public void SumUp () {
		int size = 10, total = 0;
		double[] myList = new double [size];
		for (int i=0; i<10; i++) {
			myList[i] = i+1;
			total += myList[i];
		}
		System.out.println(total);
	}

	public void DimArray() {
	String[][] s = new String[2][];
	s[0] = new String[2];
	s[1] = new String[3];
	s[0][0] = new String ("Good");
	s[0][1] = new String ("Luck");
	s[1][0] = new String ("to");
	s[1][1] = new String ("you");
	s[1][2] = new String ("!");
	for (int i=0; i<s.length; i++) {
		for (int j=0; j<s[0].length; j++) {
			System.out.println(s[i][j] + "  ");
		}
	}
	
}
	
}

