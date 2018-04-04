import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaResourceManagement {

	public static void main(String[] args) throws FileNotFoundException {
		
		
/*
 * Code till Java 8
 * ;
		
		try (BufferedReader br=new BufferedReader(new FileReader("D:\\demo.txt"))) {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		BufferedReader br=new BufferedReader(new FileReader("D:\\demo.txt"));
		
		try (br) {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}