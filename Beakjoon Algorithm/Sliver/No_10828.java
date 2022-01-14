import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//백준 10828 스택(list로 구현)
public class Main {
	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String args[]){

		String order = "";

		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		) {
			int N = Integer.parseInt(br.readLine());
			for (int i = 0; i < N; i++) {
				order = br.readLine();
				access(order);
			}
		}catch(Exception e) {
			e.printStackTrace();
			return;
		}
	}

	static void access(String order) {
		int stackTopVal = list.size() - 1;

		if (order.contains("push")) {
			list.add(Integer.parseInt(order.substring(5)));
		}

		else if (order.equals("top")) {
			if (list.size() != 0) {
				System.out.println(list.get(stackTopVal));
			} else {
				System.out.println(-1);
			}
		}

		else if (order.equals("size")) {
			System.out.println(list.size());
		}

		else if (order.equals("empty")) {
			if (list.size() != 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}

		else if (order.equals("pop")) {
			if (list.size() != 0) {
				System.out.println(list.get(stackTopVal));
				list.remove(stackTopVal);
			} else {
				System.out.println(-1);
			}

		}
	}
}