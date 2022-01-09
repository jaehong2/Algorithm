import java.util.Scanner;

//백준 2941 크로아티아 알파벳
public class Main {
	public static void main(String args[])throws Exception {

		Scanner sc  = new Scanner(System.in);

		String exchangeList[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=",  "z="};

		String input = sc.nextLine();

		for(int i=0; i<exchangeList.length; i++) {
			//입력한문자중 변경되야하는 알파벳이 있다면 *로 치환
			if(input.contains(exchangeList[i])) {
				input = input.replaceAll(exchangeList[i], "*");
			}
		}

		System.out.println(input.length());
	}

}