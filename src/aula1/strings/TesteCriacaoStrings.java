package aula1.strings;

public class TesteCriacaoStrings {

	public static void main(String[] args) {
		String a = "ABC";
		String b = "ABC";
		b = b + ""; // Nova instância foi criada.
		
		System.out.print(a + " e " + b + " são ");
		if(a == b)
			System.out.println("Iguais");
		else
			System.out.println("Diferentes");
		
	}
	
}
