package mywork.language.ex2;

public class Ex1 {
public static void main(String[] args) {
	int x = 0;
	for(int i = 1; i <= 100; i++){
		if((i % 2) != 0){
			x += i;
			System.out.println(i + " " + x);
		}
	}
	System.out.println("this is what x equals: " + x);
}
}
