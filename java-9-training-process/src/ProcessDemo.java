import java.io.IOException;

public class ProcessDemo
{
   public static void main(String[] args) throws IOException
   {
      Process p = new ProcessBuilder("notepad.exe").start();
      System.out.println(p.pid());
   }
}