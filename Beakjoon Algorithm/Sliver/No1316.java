import java.util.Scanner;

public class Main{
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		int N = sc.nextInt();
		int result = 0;
		for(int i=0; i<N; i++) {
			if(groupWordCheck() == true) {
				result++;
			}
		}
		System.out.println(result);

	}

	// 그룹 단어 인지 체크
	public static boolean groupWordCheck() {
		String str = sc.next();

		// 알파벳 개수 만큼 배열 선언
		// 사용이 되었는지 아닌지 확인하기 위해
		boolean[] AlpaUse = new boolean[26];

		// 이전 단어를 저장
		int prevWord = 0;

		for(int i=0; i<str.length(); i++) {
			int nowWord = str.charAt(i);

			// 이전단어랑 현재랑 다를 경우
			if(prevWord != nowWord) {
				// 처음 사용한 단어의 경우, 배열의 경우 초기화 안하면 false로 자동초기화
				if(AlpaUse[nowWord - 'a'] == false) {
					AlpaUse[nowWord - 'a'] = true;
					prevWord = nowWord;
				}
				// 사용헀는 경우 그룹단어가 성립이 안됨
				else {
					return false;
				}
			}
			// 같을 경우는 패스
			else {
				continue;
			}
		}
		return true;
	}
}