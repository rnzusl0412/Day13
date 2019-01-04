package home;

// 두 수를 4칙 연산하는 클래스
public class Calc {

    private int a;
    private int b;

    // java beans

    public Calc() {
        super();
    }

    public Calc(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    // a+b, a-b, a*b, a/b

    public int getHap() {
        return a + b;
    }

    public int getSub() {
        return a - b;
    }

    public int getMul() {
        return a * b;
    }

    public double getDiv() {
        return (double)a / b;
    }
    
    public double getAvg() {
    	return (double) (a+b)/2;
    }

    public String toString() {
        String str01 = String.format("%7d + %7d = %5d\n", a, b, this.getHap());
        String str02 = String.format("%7d - %7d = %5d\n", a, b, this.getSub());
        String str03 = String.format("%7d * %7d = %5d\n", a, b, this.getMul());
        String str04 = String.format("%7d / %7d = %5.2f\n", a, b, this.getDiv());
        String str05 = String.format("(%5d + %5d)/2 = %5.2f\n", a, b, this.getAvg());
        return str01 + str02 + str03 + str04 +str05;
    }
}