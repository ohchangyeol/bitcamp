package ex2;

public class ScoreVO {
		//field 
		private String name;
		private int kor;
		private int	eng;
		private int	math;
		private int sum;
		
		//constructor
		public ScoreVO(String name, int kor, int eng, int math, int sum) {
			super();
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.sum = sum;
		}

		//getter
		public String getName() {
			return name;
		}
		public int getKor() {
			return kor;
		}
		public int getEng() {
			return eng;
		}
		public int getMath() {
			return math;
		}
		public int getSum() {
			return sum;
		}

		//setter
		public void setName(String name) {
			this.name = name;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public void setMath(int math) {
			this.math = math;
		}
		public void setSum(int sum) {
			this.sum = sum;
		}
}
