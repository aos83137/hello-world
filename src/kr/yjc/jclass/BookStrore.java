package kr.yjc.jclass;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BookStrore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);  //����Ʈ��Ʈ��in�� ���ڿ��� �μ� ����ϰڴٴ� �� /java io�� �����ؾߵ�
		BufferedReader bis = new BufferedReader(isr); // ��Ʈ�� ���������� ���۸���(������ ����)	
		//��Ʈ�� ���� 
		// ���ο��� ����������� ������ �Է� ��Ʈ��
		// �������� �������� ������ ��� ��Ʈ��
		// �������� ���¿� ���� �з� �ΰ���
		// ���� ��Ʈ��(writer reader), ����Ʈ ��Ʈ��(intput,output)(����Ʈ ��Ʈ���� ���� ����)
		
				
		
		//å�� �����
		BookRecordSet brs = new BookRecordSet(30); // 30���� �迭�� ����
		Iterator itr = null;						
		BookRecord br= null;
		String strTitle = null;
		String strAuthor = null; 
		int iCount = 0;
		
	}

}
