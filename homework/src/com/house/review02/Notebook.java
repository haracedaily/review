package com.house.review02;

public interface Notebook {
	public static final int NOTEBOOK_MODE=1;
	String PROG="한글2020";
	String VIDEO="영화";
	int MODE=NOTEBOOK_MODE;

	
	public abstract void writeDocumentaion();
	public abstract void searchInternet();
}
