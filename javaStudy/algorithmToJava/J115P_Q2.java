import java.util.Scanner;

public class J115P_Q2 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException  {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("요솟값:");
		int num = scan.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("arr["+i+"] : ");
			arr[i] = scan.nextInt();
		}//배열 저장
		
		System.out.print("검색할 값 : ");
		int key = scan.nextInt();
		int cnt;
		for(cnt = 0;cnt<num;cnt++) {
			if(arr[cnt] == key) {
				break;
			}
		}
		int col;
		if(cnt==num) {
			col = 2*(cnt+1);
		}else {
			col = 2+2*(cnt+1);
		}
		
		for(int j=0;j<col;j++) {// 표출력
			for(int i=0;i<num+2;i++) {
				if(j==0) {
					if(i==0)
						System.out.printf("  ");
					else if(i==1)
						System.out.print("|");
					else
						System.out.printf("%2d", i-2);
				}
				else if(j==1) {
					if(i==0)
						System.out.println();
					if(i==1)
						System.out.print("+");
					else
						System.out.print("--");
				}
				if(j!=0&&j%2==0) {
					if(i==0) {
						System.out.println();
						System.out.printf("  ");
						}
					else if(i==1)
						System.out.print("|");
					else if(j==2*(i-1))
						System.out.printf(" *");
					else
						System.out.print("  ");
				}
				if(j!=1&&j%2==1) {
					if(i==0) {
						System.out.println();
						System.out.print(" "+(((j-1)/2)-1));
						}
					else if(i==1)
						System.out.print("|");
					else
						System.out.print(" " + arr[i-2]);
				}
			}
		}
		System.out.println();
		
		if(cnt==num) {
			System.out.println(key + " 값을 찾을 수 없습니다..");
		}else {
			System.out.println(key+"은 x["+cnt+"]에 있습니다.");
		}

	}
}
