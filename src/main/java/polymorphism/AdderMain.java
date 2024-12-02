package polymorphism;

public class AdderMain {

	public static void main(String[] args) {
		MethodOverLoadingAdder ad = new MethodOverLoadingAdder();
		ad.add();
		ad.add(10, 110);
		ad.add(45, 45.1);
		ad.add(45.5, 110);

	}

}
