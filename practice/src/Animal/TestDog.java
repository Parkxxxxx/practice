package Animal;

class Animal {
	public void move() {
		System.out.println("Animal can move");
	}
}

class Dog extends Animal{
	public void move() {
		System.out.println("Dog can move");
	}
	public void bark() {
		System.out.println("Dog can bark");
	}
	public void moveTest() {
		this.move();
		super.move();
	}
}
public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Dog b = new Dog();
		a.move();
		b.move();
		b.bark();
		b.moveTest();
	}

}
