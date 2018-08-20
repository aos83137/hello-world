package kr.yjc.jclass;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BookStrore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);  //바이트스트림in을 문자열로 싸서 사용하겠다는 뜻 /java io를 공부해야됨
		BufferedReader bis = new BufferedReader(isr); // 세트로 보내기위한 버퍼리더(빠르게 간다)	
		//스트림 형식 
		// 메인에서 보조기억으로 보내기 입력 스트림
		// 보조에서 메인으로 보낸다 출력 스트림
		// 데이터의 형태에 따른 분류 두가지
		// 문자 스트림(writer reader), 바이트 스트림(intput,output)(바이트 스트림이 많이 쓰임)
		
				
		
		//책장 만들기
		BookRecordSet brs = new BookRecordSet(30); // 30개의 배열을 가짐
		Iterator itr = null;						
		BookRecord br= null;
		String strTitle = null;
		String strAuthor = null; 
		int iCount = 0;
		
	}

}
