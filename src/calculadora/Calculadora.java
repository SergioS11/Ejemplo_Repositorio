package calculadora;

import java.util.Random;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner lectura = new Scanner(System.in);

		int x = 1;
		float z;

		while(x==1){
			System.out.println("O: ");
			String a = lectura.nextLine();

			if(a.contains("+")){
				String[] nums = a.split("\\+");
				float dato1 = Float.parseFloat(nums[0]);
				float dato2 = Float.parseFloat(nums[1]);
				z = dato1+dato2;
				System.out.println("O: " + a + "=" + z);
			}else{
				if(a.contains("-")){
					String[] nums = a.split("-");
					float dato1 = Float.parseFloat(nums[0]);
					float dato2 = Float.parseFloat(nums[1]);
					z = dato1-dato2;
					System.out.println("O: " + a + "=" + z);
				}else{
					if(a.contains("/")){
						String[] nums = a.split("/");
						float dato1 = Float.parseFloat(nums[0]);
						float dato2 = Float.parseFloat(nums[1]);
						z = dato1/dato2;
						System.out.println("O: " + a + "=" + z);
					}else{
						if(a.contains("*")){
							String[] nums = a.split("\\*");
							float dato1 = Float.parseFloat(nums[0]);
							float dato2 = Float.parseFloat(nums[1]);
							z = dato1*dato2;
							System.out.println("O: " + a + "=" + z);
						}
					}
				}
			}

			System.out.println("Desea realizar otra operacion? Si(1) No(0): ");
			x = Integer.parseInt(lectura.nextLine());

		}

	}

}
