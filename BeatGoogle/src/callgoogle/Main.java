package callgoogle;

import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()){
			String keyword = scanner.next();
			GoogleQuery googleQuery = new GoogleQuery(keyword);
			googleQuery.query();
		}
		scanner.close();
	}

}
