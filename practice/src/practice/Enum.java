package practice;
//enum Color {
//		RED, BLUE, GREEN;
//	}
public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Color myVar : Color.values()) {
			System.out.println(myVar);
		}
		
		Color myVar = Color.BLUE;
		switch (myVar) {
		case RED:
			System.out.println("red");
			break;
		case BLUE:
			System.out.println("blue");
			break;
		case GREEN:
			System.out.println("green");
			break;
		}
		
		//索引
		System.out.println(Color.GREEN.ordinal()); 
		//返回枚举常量
		//System.out.println(Color.valueOf("BLACK"));
	}

}
