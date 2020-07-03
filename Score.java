
public class Score {

	public static void main(String[] args) {
		// 국어 점수 : 70
		int kor = 70;
		// 영어 점수 : 85;
		int eng = 85;
		// 수학점수 : 90;
		int math = 90;
		
		int hap = 0;
		hap = kor + eng + math;
		double avg = hap/3.0;
		System.out.println("총점 : "+hap);
		System.out.printf("평균 : %f \n", avg);

	}

}
