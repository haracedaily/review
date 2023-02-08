package com.house.review02;

public class PortableNotebook implements Tablet, Notebook{
	String mode;
	String prog;
	String brow;
	String video;
	String useApp;
	
	
	public PortableNotebook() {
		this.mode = "NOTEBOOK_MODE";
		System.out.println(this.mode);
	}

	@Override
	public void writeDocumentaion() {
		System.out.println(this.PROG+"을 통해 문서를 작성");
	}

	@Override
	public void searchInternet() {
		System.out.println(this.BROW+"을 통해 인터넷을 검색.");
	}

	@Override
	public void watchVideo() {
		System.out.println(this.VIDEO+"를 시청.");
	}

	@Override
	public void useApp() {
		if(this.mode=="NOTEBOOK_MODE") {
			System.out.println(this.USE_APP+"를 실행.");
		}else {
			System.out.println(this.USE_APP+"를 실행.");
		}
	}
	public void changeMode(PortableNotebook portableNotebook) {
		if(this.mode=="TABLET_MODE") {
			Notebook notebook= portableNotebook;
			this.mode="NOTEBOOK_MODE";
			System.out.println(this.mode);
		}else if(this.mode=="NOTEBOOK_MODE") {
			Tablet tablet= portableNotebook;
			this.mode="TABLET_MODE";
			System.out.println(this.mode);
		}
	}
//	public void changeMode(PortableNotebook portableNotebook) {
//		if(this.mode=="TABLET_MODE") {
//			Notebook notebook= portableNotebook;
//			this.mode="NOTEBOOK_MODE";
//			System.out.println(this.mode);
//		}else if(this.mode=="NOTEBOOK_MODE") {
//			Tablet tablet= portableNotebook;
//			this.mode="TABLET_MODE";
//			System.out.println(this.mode);
//		}
//	}
	
	
}
