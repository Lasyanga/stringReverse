package consoleTutorials;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReverseString {

	public static void main(String[] args) {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String str = "", revstr = "";
		try {
			System.out.print("Enter String to be Reverse: ");
			str = read.readLine();
			
			for(int i = str.length() - 1; i >= 0; i--) {
				revstr += str.charAt(i);
			}
			
			System.out.print("Reverse String: \n\n"+ revstr);
		}catch(IOException e) {
			System.err.print(e.getMessage());
		}

	}

}
