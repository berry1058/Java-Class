package mywork.methods.ex1;

public class NumberGenerator {

	public static void main(String[] args) {
		double number = 0;

		int i = 0;
		int i2 = 0;
		int g = 0;
		int l = 0;

		number = Math.random();

		for (int h = 0; h < 10000; h++) {
			if (i != 10000 || g != l) {
				number = Math.random();
				if (number > .5) {

					g++;
				} else {

					l++;
				}
			}
			i++;

		}
		System.out.println(i);
		System.out.println(g + " & " + l);
		long t = System.currentTimeMillis();
		System.out.println(t);

		for (int n = 0; n < 1000000; n++) {
			if (n != 1000000 || g != l) {
				number = Math.random();
				if (number > .5) {
					g++;
				} else {
					l++;
				}
			} else {
				break;
			}
			i2++;

		}
		System.out.println(i2);
		System.out.println(g + " & " + l);
		long t2 = System.currentTimeMillis();
		System.out.println(t2);
		System.out.println(t2 - t);
	}

}
