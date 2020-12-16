package poly.kansai.janken;
import java.util.Random;
public class Janken1 {

	
	static int Random(){
		Random rand =new Random();
		int Rannum =rand.nextInt(3);
		
		return Rannum;
	}
	
	static void Result(int Rannum){
		if(Rannum==0) {
			System.out.println("グーです");
		}else if(Rannum==1){
			System.out.println("チョキです");
		}else {
			System.out.println("パーです");
		}
			
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int Rannum =Random();//0～2までの数字をランダムに入れる
		Result(Rannum);//グー、チョキ、パーの表示
		
	}

}
