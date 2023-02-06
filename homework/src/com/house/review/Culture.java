package com.house.review;

public abstract class Culture {
	String title;
	int vi;
	int actors;
	int cust;
	protected int totalscore;
	String result;
	
	public Culture() {}
	public Culture(String title,int vi,int actors) {
		this.title=title;
		this.vi=vi;
		this.actors=actors;
	}
	
	public void setTotalScore(int score) {
		cust++;
		totalscore+=score;
	}
	public String getGrade() {
		if(totalscore/cust<=1) {
			result = "☆";
		}else if(totalscore/cust<=2) {
			result = "☆☆";
		}else if(totalscore/cust<=3) {
			result = "☆☆☆";
			}else if(totalscore/cust<=4) {
				result = "☆☆☆☆";
			}else if(totalscore/cust<=5) {
				result = "☆☆☆☆☆";}
		return result;
		
	}
	public abstract void getInformation();
	/*1) Culture 클래스를 정의한다.
	- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
	- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
	- 메소드는 다음과 같이 정의한다.
	(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
	(2) public String getGrade() : 평점을 구하는 기능
	(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
	*/
	
}
