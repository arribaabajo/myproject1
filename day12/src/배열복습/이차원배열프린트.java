package 배열복습;

public class 이차원배열프린트 {
	public static void main(String[] args) {
		String[][]s = {
				{"고기","감자","대파"},
				{"양파","고추","두부"},
				{"생선","달걀","배추"}	
		};
		System.out.println(s[0][2]);
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
			}
	}
}
