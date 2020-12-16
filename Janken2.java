package poly.kansai.janken;
import java.util.Scanner;
public class Janken2 {

	static void conputer() {
		System.out.print("コンピューター:");
	}

	static int Scanner() {
		int User =0;
		while(true) {
		System.out.println("0：グー、1：チョキ、2：パー");
		Scanner scan = new Scanner(System.in);

			System.out.print("じゃんけんの手を入力してください:");
			if (scan.hasNextInt()) {//入力を待ち、入力された値がnextIntで読めるか判定
				User = scan.nextInt();
				if (User == 0 || User == 1 || User == 2) {//nextIntで読めたら判定

					break;
				}else {//nextIntで読めて０～２じゃなかったら
					System.out.println("正しい値を入力してください");
					scan.nextLine();
				}

			}else {//nextIntで読めなかったら
				System.out.println("正しい値を入力してください");
				scan.nextLine();
			}

		}
		 return User;
	}
	static void userResult(int User) {//
		if(User==0) {
			System.out.println("User：グー!(^^)!です");//グーの顔文字
		}else if(User==1){
			System.out.println("User:テョキ( ｀ー´)ノです");//ぴえん
		}else {
			System.out.println("User:パー( ^)o(^ )です");//( ..)φメモメモ
		}

	}

	static void showResult(int Rannum,int User) {
		int sum = User-Rannum;
		if(sum==0) {
			System.out.print("引き分け");
		}else if((sum==2||sum==-1)){
			System.out.print("勝利");
		}else {
			System.out.print("敗北");
		}

	}



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int User =Scanner();//じゃんけんの手を入力
		userResult(User);//userの手を表示
		int Rannum=Janken1.Random();//コンピューターの手をランダムで決定 Janken1より
		conputer();//コンピューター:と表示する
		Janken1.Result(Rannum);//コンピューターの手を表示 Janken1より
		showResult(Rannum,User);//勝敗の表示
	}

}
