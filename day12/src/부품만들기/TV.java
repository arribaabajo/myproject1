package 부품만들기;

public class TV {
	//멤버변수, 선언
	public int ch; //0
	public int vol; //0
	public boolean onOff; //false
	
	public void 채널을바꾸다() {
		int change = 1; // 지역변수, local변수
		System.out.println(ch+"에서 "+change+"로 바꾸다.");
	}
	public void 유튜브보다() {//메서드를 만드는 것 ==> 메서드를 정의하다
		System.out.println(vol + "을 올려서 동영상을 보다");
	}
}
