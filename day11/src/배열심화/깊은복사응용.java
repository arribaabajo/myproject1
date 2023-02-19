package 배열심화;

public class 깊은복사응용 {
public static void main(String[] args) {
	String[] 과목명 = {"국어", "영어", "수학", "국사", "컴퓨터"};
	int[] 학기1성적 = {44, 66, 22, 99, 100};
	int[] 학기2성적 = 학기1성적.clone();
	System.out.println(학기1성적 == 학기2성적);
	학기2성적[0] = 22;
	학기2성적[2] = 88;
	
	for (int i = 0; i < 학기2성적.length; i++) {
		System.out.println(학기1성적[i]+" ");
	}System.out.println();
	for (int i = 0; i < 학기2성적.length; i++) {
		System.out.println(학기2성적[i]+" ");
	}
	int sameCount = 0;
	int upCount = 0;
	for (int i = 0; i < 학기2성적.length; i++) {
		if(학기1성적[i] == 학기2성적[i]) {
			sameCount++;
		}else if(학기1성적[i] < 학기2성적[i]) {
			upCount++;
			System.out.println("\n성적이 오른 과목은" + 과목명[i]);
		}
		System.out.println();
		System.out.println("동일한 과목 수는 " + sameCount);
		System.out.println("상승한 과목 수는 " + upCount);
	}
}
}
