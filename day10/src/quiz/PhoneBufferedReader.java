package quiz;
import java.io.*;

public class PhoneBufferedReader {
	public static void main(String[] args) {
		File file = new File("C:\\Temp\\Phone.txt");
		
		
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while(true) {
			String line = bufferedReader.readLine();
				if(line==null)break;
				System.out.print(line+"\r\n");
			}
			
			bufferedReader.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
