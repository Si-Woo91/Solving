package problem;

import java.util.Scanner;

/*2739번 구구단

문제
N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

입력
첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

출력
출력형식과 같게 N*1부터 N*9까지 출력한다.*/

public class Day08 {
	public static void main(String[] args) {
//		히스토리 비교 테스트
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("구구단 단을 입력 해주세요.");
		
		int dan = sc.nextInt();
		
		for(int i = 0; i < 9 ; i++) {
			
			System.out.println(dan +" X " + (i+1) + " = " +  dan * (i+1));
			
			
		}
		
		sc.close();
	}

}
