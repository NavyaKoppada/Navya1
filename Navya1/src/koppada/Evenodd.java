package koppada;

public class Evenodd {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if(num%2==0)
				System.out.println("given integer number " + num + " is even");
		else
			System.out.println("given integer number " + num + " is odd");
	}

}
