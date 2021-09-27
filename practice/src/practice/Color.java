package practice;

public enum Color {
	RED, GREEN, BLUE;
	
	//构造函数只能是private，可以是具体可以是抽象
	private Color() {
		System.out.println("Constructor called for " + this.toString());
	}
	public void colorInfo() {
		System.out.println("Universal color");
	}
}
