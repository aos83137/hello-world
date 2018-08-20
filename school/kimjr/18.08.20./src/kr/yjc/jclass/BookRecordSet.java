package kr.yjc.jclass;

class BookRecordSet extends BookRecord implements Aggregate {

	private BookRecord[] brSet;
	private int iLast=0;
	
	public BookRecordSet() {
//		this("","",0,0);
//		this(50);
		//brSet = new BookRecord[50];
	}
	public BookRecordSet(int size) {
		brSet = new BookRecord[size];
	}
	public BookRecord getBookRecord(int idx) {
		//원래는 권한이 되는지 확인 해야됨
		return brSet[idx];
	}
	public void addBookRecord(BookRecord br) {
//		brSet[iLast] = br;
		brSet[getSize()] = br;
		iLast++;
	}
	public void deleteBookRecord() {
		brSet[iLast-1] = null; //참조값이 없어짐 //배열이 0부터니까 잘보자!
		iLast--;
	}
	public int getSize() { //몇개 들어있는가
		return iLast;
	}
	
	@Override  //@디렉티브  jvm에 지시를함 이게 뭔지
	public Iterator getIterator() {
		// TODO Auto-generated method stub //stub : 자돟으로 툴이 생겼다는 의미
		return new BookRecordItertor(this); //이 객체와 BookRecordIterator가 연관 됨을 알 수 있다.
	}                //생성자가 없으니 빨간 줄 표시 남
	
	

}
