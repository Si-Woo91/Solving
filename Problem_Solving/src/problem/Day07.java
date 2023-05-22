package problem;

import java.util.HashMap;

//2480번 주사위 세개
//
//문제
//1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
//
//같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
//예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//
//3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
//
//입력
//첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
//
//출력
//첫째 줄에 게임의 상금을 출력 한다.

public class Day07 {
	public static void main(String[] args) {
		
		int max = 0;	// 제일 큰 눈금
		int money = 0;	// 상금
		
		
		// 랜덤으로 주사위 수 구하기
		int dice1 = (int)( Math.random() * 6 ) + 1;
		int dice2 = (int)( Math.random() * 6 ) + 1;
		int dice3 = (int)( Math.random() * 6 ) + 1;
		
		System.out.println("주사위 1 :: " + dice1 
				+ "\n" + "주사위 2 :: " + dice2
				+ "\n" + "주사위 3 :: " + dice3);
		
		Dice diceList = new Dice();
		int chk = diceList.dise(dice1, dice2, dice3).get("chk");	// 같은 눈금 수의 주사위 갯수
		
		max = diceList.dise(dice1, dice2, dice3).get("max");
		
		switch(chk) {
		
		case 3 :								// 세 주사위가 모두 같을 경우
			money = 10000 + (max * 1000);
			break;
		case 2 :								// 두 주사위만 같을 경우
			money = 1000 + (max * 100);
			break;
		case 1:									// 모두 다른 경우
			money = max * 100;
			break;
		}
		
		
		System.out.println("상금 :: " + money);
	}
}

class Dice {
	HashMap<String, Integer> dise(int a, int b, int c) {
		
		HashMap<String, Integer> temp = new HashMap<>();
		int chk = 0;
		int max = 0;
		
		if(a == b) {
			if(b == c) {					// 세 주사위가 모두 같을 경우
				
				max = a;
				chk = 3;
			}
		}
		
		if(a == b) {								// 두 주사위가 같을 경우
			if((b != c) || (c != a) ) {
				max = a;
				chk = 2;
			}
		}else if(b == c) {
			if((a != b) || (a != c) ) {
				max = b;
				chk = 2;
			}
		}else if(c == a) {
			if((c != b) || (a != b) ) {
				max = c;

				chk = 2;
			}
		}
		
		if(a != b && b != c && c != a) {			// 주사위가 모두 다를 경우
			if(a > b) {							
				if(a > c ) {
					max = a;
					chk = 1;
				}else {
					max = c;
					chk = 1;
				}
			}else if(b > c) {					
				if(b > a) {
					max = b;
					chk = 1;
				}
			} else {							
				max = c;
				chk = 1;
			}
		}
		
		temp.put("chk", chk);
		temp.put("max", max);
		
		return temp;
	}
}
