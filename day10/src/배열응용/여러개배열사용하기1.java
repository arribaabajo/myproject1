package 배열응용;

public class 여러개배열사용하기1 {
	public static void main(String[] args) {
		String[] 식구 = {"아버지", "어머니", "나", "동생"};
		int[] age = {62, 58, 30, 27};
		double[] height = {175.5, 160.5, 190.1, 160.2};
		
		System.out.println("직책\t나이\t키");
		System.out.println("-------------------------");
		for (int i = 0; i < height.length; i++) {
			System.out.println(식구[i] + "\t" + age[i] + "\t" + height[i]);
		}
	}
}
