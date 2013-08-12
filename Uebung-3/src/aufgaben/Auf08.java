package aufgaben;

public class Auf08 {
	
	public static double fac(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++)
			res *= i;
		return (double)res;
	}
	
	public static double calcSin(double x, int it) {
		double sin = 0;
		double vz = 1;
		double zaehler, nenner, res;
		for (int i = 1; i <= it; i += 2) {
			System.out.println("vz: " + vz);
			System.out.println("i: " + i);
			zaehler = Math.pow(x, i);
			System.out.println("zaehler: " + zaehler);
			nenner = fac(i);
			System.out.println("nenner: " + nenner);
			res = vz*(zaehler/nenner);
			System.out.println("res: " + res);
			sin += res;
			vz *= -1.0;
			System.out.println();
		}
		return sin;
	}
	
	public static void main(String[] args) {
		System.out.println(calcSin(1.8765434, 10));
		System.out.println(calcSin(0.8765431, 10));
	}

}
