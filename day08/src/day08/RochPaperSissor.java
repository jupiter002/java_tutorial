package day08;
import java.util.Scanner;

//Player vs AI
class Player{
	private String name;
	private Scanner sc = new Scanner(System.in);
	public Player(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int turn() {
		System.out.println(name+"[짱 (1), 깽(2), 보(3), 끝내기(4)]");
		return sc.nextInt();
	}
}
class computer extends Player{

	public computer(String name) {
		super(name);
	}
	public int turn() {
		return (int) (Math.random()*3+1);
	}
	
	
	
}


public class RochPaperSissor {
	public static void main(String[] args) {
		String rocksissorpaper[] = {"가위","바위","보"}; 
		Player me = new Player("아무개");
		computer AI = new computer("깡통");
		
				
		while(true) {
			
			int Playerch = me.turn();
			int AIch = AI.turn();
			if(Playerch<4 && Playerch>0) {
			if(Playerch==4) {
				break;
			}
			System.out.println(me.getName()+":"+rocksissorpaper[Playerch-1]);
			System.out.println(AI.getName()+":"+rocksissorpaper[AIch-1]);
			
				if(Playerch==AIch) {
				System.out.println("비김");
				}
				else if(Playerch==1 && AIch==3) {
				System.out.println("이김");
				}
				else if(Playerch==2 && AIch==1) {
				System.out.println("이김");
				}
				else if(Playerch==3 && AIch==1)	{
				System.out.println("이김");
				}
				else {
				System.out.println("졌음");
				}
			}
		
		}
	}
}
