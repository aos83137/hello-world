package kr.yjc.jclass;

public class BookRecord {
	private String strTitle;
	private String strAuthor;
	private int iCount;   
	//맴버변수 선언, private -> 정보은닉
	//str, i를 변수명 앞에 표시: 자료형을 나타냄  : 헝가리안방식
	//대소문자로 시작후 중간에 대문자로 표시 : 낙타표기(Camel 방식)
	//str_title: 중간에 _ 표시: 뱀표시(Snake 방식)
	
	public BookRecord() { // 생성자 오버로딩
		/*strTitle = "";
		strAuthor = "";
		iCount = 0;*/
		this("","",0);
		
		//super();//부모클래스의 생성자 호출
		//super.부모클래스 맴버면수 = 값; 잘 안씀 굳이 안씀 상속이라서
		//쓰는 경우는 부모랑 자식에서 변수 명이 같을 경우 사용하는데 의가 없다.
		
	}
	public BookRecord(String title, String author, int cnt) {
		this.strTitle = title;
		this.strAuthor = author;
		this.iCount = cnt;
	}
	public String getTitle() {
		//if(니가 타이틀을 읽을 권한이 있다면) 
		return this.strTitle;
	}
	public String getAuthor() {
		return this.strAuthor;
	}
	public int getCount() {
		return this.iCount;
	}
}
