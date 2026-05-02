package _05_popcorn;

public class PopcornMaker {

	public static void main(String[] args) {
		Popcorn ruffles = new Popcorn("caramel");
		Microwave cheese = new Microwave();
		cheese.putInMicrowave(ruffles);
		cheese.setTime(3);
		cheese.startMicrowave();
		System.out.println("why did we put raw sugar in the microwave for three minutes its burnt bruh");
	}

}
