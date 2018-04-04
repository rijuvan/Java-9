import java.util.Arrays;
import java.util.List;

public class SafeVarargsDemo
{
   public static void main(String[] args)
   {
      SafeVarargsDemo o = new SafeVarargsDemo();
      o.goodVarargsMethod(Arrays.asList("North", "South"), Arrays.asList("Up", "Down"));
   }

   private void goodVarargsMethod(List<String>... ls)
   {
      for (List<String> los: ls)
         System.out.println(los);
   }
}