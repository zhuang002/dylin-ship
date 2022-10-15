import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] list = {'B','F','T','L','C'};
		String line  = sc.nextLine();
		for (int i=0;i<line.length();i++) {
			char c = line.charAt(i);
			for (int j=0;j<list.length;j++) {
				char ch = list[j];
				if (c==ch) {
					list[j] = '*';
				}
			}
		}
		boolean notempty=false;
		for (int i=0;i<list.length;i++) {
			if (list[i]!='*') {
				System.out.print(list[i]);
				notempty=true;
			}
		}
		
		if (!notempty) {
			System.out.println("NO MISSING PARTS");
		}
	}

}
