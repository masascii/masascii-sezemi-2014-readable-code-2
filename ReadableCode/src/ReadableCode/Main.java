package ReadableCode;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br_filename = new BufferedReader(new InputStreamReader(System.in));
			File file = new File(br_filename.readLine());
			
			BufferedReader br_file = new BufferedReader(new FileReader(file));
			System.out.println(br_file.readLine());
		}catch(FileNotFoundException e) {
			System.err.println(e);
		}catch(IOException e) {
			System.err.println(e);
		}
	}
}
