package home;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide() {
		try {
			System.out.print("������� ");
			System.out.print(this.left / this.right);
			System.out.print(" �Դϴ�.");
			} catch(Exception e) {
				System.out.println("\n e.getMessage()"+e.getMessage());
				System.out.println("\n e.toString()"+ e.toString());
				System.out.println("\n e.getStackTrace"+e.getStackTrace());
			}
		System.out.println("\nDivide End");
		
	}
}

public class E2 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();
	}
}
