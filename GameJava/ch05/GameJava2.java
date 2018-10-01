import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GameJava2 {
	public static void main(String[] args) throws IOException{
		int result;
		
		if(args.length==3) {
			int x = Integer.valueOf(args[0]).intValue();
			int y = Integer.valueOf(args[1]).intValue();
			int z = Integer.valueOf(args[2]).intValue();
			
			result = playGame(x, y, z);
		}else {
			result = playGame();
		}
		
		System.out.println();
		if(result<=2) {
			System.out.println("참 잘했어요!");
		}else if(result<=5) {
			System.out.println("잘했어요!");
		}else if(result<=9) {
			System.out.println("보통이네요!");
		}else {
			System.out.println("분발하세요!");
		}
	}
		
	public static int playGame() throws IOException{
		int x, y, z;
		Random r = new Random();
		x=Math.abs(r.nextInt() % 9)+1;
		
		do {
			y=Math.abs(r.nextInt()%9);
		}while(y==x);
		
		do {
			z=Math.abs(r.nextInt()%9);
		}while(z==x);
		
		System.out.println(x+", "+y+", "+z);
		
		return playGame(x, y, z);
	}
	
	public static int playGame(int x, int y, int z) throws IOException{
		int count;
		int strike, ball;
		
		int[] usr = new int[3];
		int[] com = {x,y,z};
		
		System.out.println("숫자 야구 게임");
		
		count=0;
		do {count++;
			do {
				System.out.println("\n카운트: "+count);
				
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				String user;
				
				System.out.print("1번째 숫자: ");
				user= in.readLine();
				usr[0] = new Integer(user).intValue();
				
				System.out.print("2번째 숫자: ");
				user= in.readLine();
				usr[1] = new Integer(user).intValue();
				
				System.out.print("3번째 숫자: ");
				user= in.readLine();
				usr[2] = new Integer(user).intValue();
				
				if((usr[0] ==0)||(usr[1] ==0) || (usr[2]==0)) {
					System.out.println("0은 입력하지 마세요. 다시 입력해주세요.");
				}else if((usr[0]>9)||(usr[1]>9)||(usr[2]>9)) {
					System.out.println("1부터 9까지의 숫자 중 하나를 입력해주세요.");
				}else if((usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2])){
					System.out.println("모두 다른 숫자를 입력해주세요. 다시입력해주세요.");
				}
			}while((usr[0] ==0)||(usr[1] ==0) || (usr[2]==0)||
					(usr[0]>9)||(usr[1]>9)||(usr[2]>9)||
					(usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2]));
		
		strike = ball = 0;
		
		for(int i=0;i<3;i++) {
			if(usr[i]==com[i]) strike++; //strike 계산
			for(int j=0;j<3;j++) {
				if(i!=j) {
					if(usr[i]==com[j])ball++; //ball 계산
				}
			}
		}
		
		System.out.println("Strike: " + strike + " Ball: " + ball);
	}while((strike<3)&&(count<11));
	
	return count;
	}
}
