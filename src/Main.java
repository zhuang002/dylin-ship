import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		ArrayList<Character> list = new ArrayList<>();
		list.add('B');
		list.add('F');
		list.add('T');
		list.add('L');
		list.add('C');
		
		for (int i=0;i<line.length();i++) {
			Character c = line.charAt(i);
			if (list.contains(c))
				list.remove(c);
		}
		if (list.size()==0) {
			System.out.print("NO MISSING PARTS");
			return;
		}
		for (char c:list) {
			System.out.print(c);
		}
	}

}
