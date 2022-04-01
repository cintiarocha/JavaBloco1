package Introdução;

public class Atividade2 {

	public static void main(String[] args) {

		int n1, n2, n3 ;
		n1 = 26;
		n2 = 30;
		n3 = 25;
		
		if (n1>n2 && n1>n3 && n2>n3) {
			System.out.println("A ordem fica: " + n3 + " , " +  n2 + " , " + n1);
		}
		
		else if (n2>n1 && n2>n3 && n1>n3) {
			System.out.println("A ordem fica: " + n3 + " , "  + n1 + " , " +  n2);
		}
		
		else if (n3>n1 && n3>n2 && n2<n1) {
			System.out.println("A ordem fica: " + n1 + " , " + n2 +  " , " + n3);

		}
	}
	
	}
	


