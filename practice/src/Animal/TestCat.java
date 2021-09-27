package Animal;
	abstract class Animal2 {
		abstract void eat();
	}
	class Cat extends Animal2 {
		public void eat() {
			System.out.println("eat fish");
		}
		public void work() {
			System.out.println("catch mouse");
		}
	}
	class Wolf extends Animal2 {
		public void eat() {
			System.out.println("eat bones");
		}
		public void work() {
			System.out.println("keep home");
		}
	}

public class TestCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal2 a = new Cat();
		Cat c = (Cat)a;
		c.eat();
		c.work();
		Wolf d = new Wolf();
		d.eat();
		d.work();
	}

}
