package 배열응용;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] name = { "a", "b", "c", "d", "e" };
		int[] term1 = { 77, 88, 99, 50, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		// 1. 2학기 성적이 오른 학생 수
		// 2. 1학기와 2학기 성적이 동일한 학생 수
		int count2 = 0;
		int count12 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count12++;
			} else if (term1[i] < term2[i]) {
				count2++;
			} // if
		} // for

		System.out.println("2학기 성적이 오른 사람은 " + count2);
		System.out.println("1, 2학기 성적이 동일한 사람은 " + count12);

		// 3. 2학기 학생 중 만점(100)인 학생의 이름과 인덱스 번호는?
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("만점 학생의 인덱스 번호는 " + i);
				System.out.println("학생의 이름은 " + name[i]);
			} // if
		} // for
			// 4. 1학기 성적의 평균과 2학기 성적의 평균 중 누가 더 높았나요?
		int sumTerm1 = 0;
		int sumTerm2 = 0;

		for (int i = 0; i < term2.length; i++) {
			sumTerm1 = sumTerm1 + term1[i];
			sumTerm2 = sumTerm2 + term2[i];
		} // for
		double avgTerm1 = (double) sumTerm1 / term1.length;
		double avgTerm2 = (double) sumTerm2 / term1.length;
		if (avgTerm1 > avgTerm2) {
			System.out.println("1학기 평균이 더 높았어요");
		} else if (avgTerm1 < avgTerm2) {
			System.out.println("2학기 평균이 더 높았어요");
		} else {
			System.out.println("1학기 2학기 동일합니다.");
		}
		// 5. 심화) 특정 멤버의 1학기, 2학기 성적은?
		for (int i = 0; i < term2.length; i++) {
			if (name[i].equals("b")) {
				System.out.println("b의 위치는 " + (i + 1));
				System.out.println("b의  1학기 성적은 + term1[i]" + "2학기 성적은" + term2[i]);
			}
		}
	}

}
