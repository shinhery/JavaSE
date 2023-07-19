package test

public class AiTest02 {
	import java.util.Random;
	import java.util.Scanner;

	public class DiceSumGame {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        System.out.println("주사위 합 게임을 시작합니다!");
	        System.out.println("게임을 종료하려면 'exit'을 입력하세요.");

	        while (true) {
	            int dice1 = random.nextInt(6) + 1;
	            int dice2 = random.nextInt(6) + 1;
	            int sum = dice1 + dice2;

	            System.out.println("주사위 1: " + dice1);
	            System.out.println("주사위 2: " + dice2);
	            System.out.println("합계: " + sum);

	            if (sum == 7) {
	                System.out.println("축하합니다! 합계 7로 당첨되었습니다!");
	            } else {
	                System.out.println("아쉽지만 합계가 7이 아닙니다. 다시 시도하세요!");
	            }

	            System.out.print("계속 하시겠습니까? (Y/N): ");
	            String input = scanner.next();

	            if ("N".equalsIgnoreCase(input) || "exit".equalsIgnoreCase(input)) {
	                break;
	            }
	        }

	        System.out.println("게임을 종료합니다. 감사합니다!");
	        scanner.close();
	    }
	}
}