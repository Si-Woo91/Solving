package problem;

import java.util.Scanner;

/**
 * 
 * 문제 10950번 A+B - 3
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 */

public class Day09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("테스트 케이스의 개수 >> ");
		int T = sc.nextInt();

		int[] ans = new int[T];
		
		if(T != 0)
		{
			
			for(int i = 0; i < ans.length; i++)
			{
				ans[i] = sum();
				System.out.println("["+ (i+1) + "] 번째의 합 >> " + ans[i]);
			}
		}
		else
		{
			System.out.println("잘 못 입력했습니다.");
		}
		
	}
	
	static int sum()
	{
		
		Scanner sc = new Scanner(System.in);

		int A;
		int B;
		int temp;
		
		System.out.println("두 수를 입력하세요.");
		A = sc.nextInt();
		B = sc.nextInt();
		
		temp = A + B;
		
		return temp;

	}
	
	
}
