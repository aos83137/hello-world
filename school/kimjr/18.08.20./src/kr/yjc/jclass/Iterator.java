package kr.yjc.jclass;

public interface Iterator {
	public abstract boolean hasNext(); // ���� ��ȸ�� ��Ұ� �ִ°�.
	public abstract Object next(); //���� ��Ҹ� �����´�. ����ڴ� ���� Ŭ������ ����� �� �𸥴�. �׷��� �������� �̿��Ѵ�.
	public abstract Object remove(); //�����ϸ鼭 ������ ��� ��������. 
}
