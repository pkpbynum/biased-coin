import java.util.Scanner;

public class BiasedCoinApp {

	public static void main(String[] args) {
		
		int coin1Heads = 0;
		int coin2Heads = 0;
		int fairCoinHeads = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bias for first coin: ");
		double bias1 = input.nextDouble();
		BiasedCoin coin1 = new BiasedCoin(bias1);
		
		System.out.println("Bias for second coin: ");
		double bias2 = input.nextDouble();
		BiasedCoin coin2 = new BiasedCoin(bias2);		
		
		BiasedCoin fairCoin = new BiasedCoin();
	
		
		for(int i = 0; i<100; i++) {
			coin1.flip();
			if(coin1.isHeads())
				coin1Heads += 1;
			
			coin2.flip();
			if(coin2.isHeads())
				coin2Heads += 1;
			
			fairCoin.flip();
			if(fairCoin.isHeads())
				fairCoinHeads += 1;
		}
		
		System.out.println("\nTotal number of heads with " + bias1 + " bias: " + coin1Heads);
		System.out.println("Total number of heads with " + bias2 + " bias: " + coin2Heads);
		System.out.println("Total number of heads with no bias: " + fairCoinHeads);
	
	}

}
