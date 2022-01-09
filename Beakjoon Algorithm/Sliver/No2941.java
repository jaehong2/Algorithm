import java.util.Scanner;

// 2941 - 크로아티아 알파벳
public class Main {
	public static void main(String args[])throws Exception {

		Scanner sc  = new Scanner(System.in);

		String changeList[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=",  "z="};

		String input = sc.nextLine();

		for(int i=0; i<changeList.length; i++) {
			// 입력한문자중 변경되야하는 알파벳이 있다면 *로 치환
			if(input.contains(changeList[i])) {
				input = input.replaceAll(changeList[i], "*");
			}
		}
		System.out.println(input.length());
	}

}