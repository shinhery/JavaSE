package test

public class GuessNumberGame {
	import java.util.Random;
	import java.util.Scanner;

	public class GuessNumberGame {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int secretNumber = random.nextInt(100) + 1;
	        int attempts = 0;

	        System.out.println("1부터 100 사이의 숫자를 맞춰보세요.");

	        while (true) {
	            System.out.print("숫자를 입력하세요: ");
	            int guess = scanner.nextInt();
	            attempts++;

	            if (guess == secretNumber) {
	                System.out.println("정답입니다! 축하합니다!");
	                System.out.println("시도 횟수: " + attempts);
	                break;
	            } else if (guess < secretNumber) {
	                System.out.println("더 큰 숫자를 입력하세요.");
	            } else {
	                System.out.println("더 작은 숫자를 입력하세요.");
	            }
	        }

	        scanner.close();
	    }
	}
}