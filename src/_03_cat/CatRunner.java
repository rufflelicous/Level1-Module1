package _03_cat;

public class CatRunner {

	public static void main(String[] args) {
		Cat sir = new Cat("ruffles");
		sir.meow();
		sir.printName();
		for(int i = 0; i < 9; i++) {
			sir.kill();
		}
	}

}
