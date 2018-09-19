import java.util.Scanner;

public class J115P_Q1 {
	
	static int seqSearchSen(int[] a, int n, int key) {
		a[n] = key;
		int i;
		for(i=0;i<=n;i++) {
			if(a[i]==key) {
				break;
			}
		}
		if(i==n) {
			return -1;
		}else {
			return i;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num + 1];   	//요솟수 num + 1 보초(sentinel)을 위한 것.
		
		for(int i=0;i<num;i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		} // 값 저장
		
		System.out.println("검색할 값 : ");
		int ky = scan.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}

}
