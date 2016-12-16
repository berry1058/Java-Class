package mywork.language.ex4;

public class Ex2 {

	public static void main(String[] args) {
		int x = 0;
		
		for(int i = 1; i < 8; i++ ){
			 
			for(int j = i; j <= i; --j){
				if(j > 0){
				System.out.print(j + " ");
				
				}else{
					System.out.println();
					break;
				}
				
			}
		}
	}

}
