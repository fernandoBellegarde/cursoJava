import java.util.Scanner;

public class bitAbit {

	public static void main(String[] args) {

		//isso aqui é usado pra testar bit, nao sei pra que serve na vida real
		
		//no caso é pra testar se o 6 bit é 0
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		int n = sc.nextInt();
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}
		sc.close();

	}

}
