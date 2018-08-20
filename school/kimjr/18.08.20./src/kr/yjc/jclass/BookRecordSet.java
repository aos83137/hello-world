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
		//������ ������ �Ǵ��� Ȯ�� �ؾߵ�
		return brSet[idx];
	}
	public void addBookRecord(BookRecord br) {
//		brSet[iLast] = br;
		brSet[getSize()] = br;
		iLast++;
	}
	public void deleteBookRecord() {
		brSet[iLast-1] = null; //�������� ������ //�迭�� 0���ʹϱ� �ߺ���!
		iLast--;
	}
	public int getSize() { //� ����ִ°�
		return iLast;
	}
	
	@Override  //@��Ƽ��  jvm�� ���ø��� �̰� ����
	public Iterator getIterator() {
		// TODO Auto-generated method stub //stub : �ډ����� ���� ����ٴ� �ǹ�
		return new BookRecordItertor(this); //�� ��ü�� BookRecordIterator�� ���� ���� �� �� �ִ�.
	}                //�����ڰ� ������ ���� �� ǥ�� ��
	
	

}
