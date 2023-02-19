package 배열심화;

public class 열이다른 {
public static void main(String[] args) {
	//배열 처음에 만들 때 값을 이미 알고 있는 경우
	int[][]n1 = {
			{1, 2, 3},
			{4, 5 ,6},
	
	};	System.out.println(n1.length);
		System.out.println(n1[0][0]);
		System.out.println(n1[1][2]);
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1.length; j++) {
				System.out.print(n1[i][j]+" ");
			}
			System.out.println();
		}
	// 배열 처음에 만들 때 값을 모르고 있는 경우
		// 1차원 배열을 만들어라, 1차원 배열을 2차원 배열의 각 행에 끼워넣어라.
		
	
 }
}
