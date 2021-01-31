import java.util.*;
public class ScanfEx2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 하나 입력해주세요");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n", num);
		
		
		
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
//		String input = scanner.nextLine();
//		int num = Integer.parseInt(input);
//		
//		System.out.println(num);

	}

}
