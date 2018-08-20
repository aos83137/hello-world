package kr.yjc.jclass;

public interface Iterator {
	public abstract boolean hasNext(); // 아직 조회할 요소가 있는가.
	public abstract Object next(); //다음 요소를 가져온다. 사용자는 무슨 클래스를 사용할 줄 모른다. 그래서 다형성을 이용한다.
	public abstract Object remove(); //삭제하면서 삭제한 요소 가져오기. 
}
