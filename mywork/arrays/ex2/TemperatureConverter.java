package mywork.arrays.ex2;

public class TemperatureConverter {

	public static void main(String[] args) {
		System.out.println("C   &   F");
		for(int i = 0; i < args.length; i++){
			int n = Integer.parseInt(args[i]);
			System.out.println(n + "   " + ((n * 1.8) + 32 ));
		}

	}

}
