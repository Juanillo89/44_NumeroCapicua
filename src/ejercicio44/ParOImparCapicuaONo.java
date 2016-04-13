package ejercicio44;

import java.util.Scanner;

public class ParOImparCapicuaONo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		String numero;
		boolean par = false;
		boolean capicua = true;
		System.out.print("Introduce número: ");
		num = sc.nextInt();
		sc.close();
		// Si el número es par
		if(num % 2 == 0)
		{
			par = true;
		}
		// Se guarda el número en una cadena
		numero = String.valueOf(num);
		// Es capicúa hasta que un valor del principio no coincide con uno del final
		int j = numero.length() - 1;
		for (int i = 0; i < numero.length() / 2 && capicua; i++)
		{
			if(numero.charAt(i) != numero.charAt(j))
			{
				capicua = false;
			}
			j--;
		}
		if(par && capicua)
		{
			System.out.println("El número es par y capicúa.");
		}
		else if(par && !capicua)
		{
			System.out.println("El número es par y no es capicúa.");
		}
		else if(!par && capicua)
		{
			System.out.println("El número es impar y capicúa.");
		}
		else if(!par && !capicua)
		{
			System.out.println("El número es impar y no es capicúa.");
		}
	}
}
