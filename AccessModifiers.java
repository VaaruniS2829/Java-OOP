class Demo{

	public int a = 10;

	private int b = 20;

	protected int c = 30;

	int d = 40;

	public void showValues() {

		System.out.println("Public variable a : " +a);

		System.out.println("Private variable b : " +b);

		System.out.println("Protected variable c : " +c);

		System.out.println("Default variable d : " +d);

	}

}

public class AccessDemo {

      public static void main(String args[]) {

    	  Demo obj = new Demo();

    	  obj.showValues();

    	  System.out.println("Accessing public variable : " + obj.a);

    	  // obj.b is not accessible here (private)

      }

}
