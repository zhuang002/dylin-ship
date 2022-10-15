import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		HashMap<Character, Boolean> dic = new HashMap<>();
		
		dic.put('B', false);
		dic.put('F', false);
		dic.put('T', false);
		dic.put('L', false);
		dic.put('C', false);
		
		for (int i=0;i<line.length();i++) {
			char c = line.charAt(i);
			dic.put(c, true);
		}
		
		boolean empty = true;
		for (Character key:dic.keySet()) {
			if (!dic.get(key)) {
				System.out.print(key);
				empty = false;
			}
		}
		
		if (empty) {
			System.out.print("NO MISSING PARTS");
		}
	}

}
