package com.house.review;

public class Movie extends Culture{
	String gne;
	public Movie(String title,int vi,int actors,String gne) {
		super(title,vi,actors);
		this.gne=gne;
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
	@Override
	public void getInformation() {
		System.out.println("영화제목 : "+title+"\n 감독 : "+vi+"\n 배우 : "+actors+"\n 영화총점 : "+totalscore+"\n 영화평점 : "+result);
//System.out.println(gne+"제목 : "+title+"\n 감독 : "+vi+"\n 배우 : "+actors+"\n "+gne+"총점 : "+totalscore+"\n "+gne+"평점 : "+result);
	}
	/*2) Movie 클래스를 정의한다.
	- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	- 메소드는 다음과 같이 정의한다.
	(1) public abstract void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
	*/
}
