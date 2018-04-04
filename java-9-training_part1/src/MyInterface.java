
public interface MyInterface {

	int DATA = 100;

	public void show();

	public default void disp() {
		System.out.println("This is default method in interface");
		showAll();
	}

	public static void print() {
		System.out.println("This is static method in interface");

	}

	private void showAll() {
		System.out.println("This is static method in interface");
	}

}
