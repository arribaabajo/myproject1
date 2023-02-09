package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		int[] x = new int[10]; //length:10
		x[0] = 10;
		x[1] = 20;
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
		}
		
		//우리 가족의 성별을 char[]로, 구성원을 String[]으로, 시력을 double[]로 저장, 프린트
		char[] a = {'남', '여', '남', '여'};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		String[] b = {"아빠", "엄마", "나", "동생"};	
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		double[] c = {0.5, 0.5, 0.1, 0.5};
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+ " ");
		}
	}

}
