package 배열;

public class 배열최소값구하기 {
	public static void main(String[] args) {
		int[] s = {90, 80, 20, 60, 70};
		int min = s[0];
		
		for(int x: s) {
			if(x < min) min = x;
		}
		System.out.println("최소 값은 "+min);
	}
}
