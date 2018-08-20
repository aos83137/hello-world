package kr.yjc.jclass;

public class BookRecordItertor implements Iterator {

	private BookRecordSet brs;
	private int index;
	
	public BookRecordItertor(BookRecordSet brs) {
		this.brs = brs;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index<brs.getSize()) return true;
		else return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		BookRecord br = brs.getBookRecord(index);
		index++;
		return br;
	}

	@Override
	public Object remove() {  //삭제 했다 안했다만 알고싶은땐 boolean 이면되는데 뭘 삭제한지 알고싶기에 Object사용
		// TODO Auto-generated method stub
		BookRecord br = brs.getBookRecord(brs.getSize()-1);
		brs.deleteBookRecord();
		return br;
	}

}
