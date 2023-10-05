package com.benjamin.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("Informe o primeira Numero para a análise ");
	        int num1 = scan.nextInt();
	        System.out.println("Informe o segundo Número para a análise ");
	        int num2 = scan.nextInt();
	        System.out.println("Informe o terceiro Número para a análise ");
	        int num3 = scan.nextInt();
	        
	        if      (num1>=num2 && num1>=num3) 
	           { System.out.println(num1 + " é o maior número");
	           }
	      	else if (num2>=num1 && num2>=num3)
	      	   {System.out.println(num2 + " é o maior número");
	      	   }
	      	else if (num3>=num1 && num3>=num2)
	      	   {System.out.println(num3 + " é o maior número");
	      	   }
	      	else {System.out.println("Os Número são iguais");
	      	   }
	      	   
	        if      (num1<=num2 && num1<=num3) 
	           { System.out.println(num1 + " é o menor número");
	           }
	      	else if (num2<=num1 && num2<=num3)
	      	   {System.out.println(num2 + " é o menor número");
	      	   }
	      	else if (num3<=num1 && num3<=num2)
	      	   {System.out.println(num3 + " é o menor número");
	      	   }
	      	else {System.out.println("Os Número são iguais");
	      	   }
	}

}
