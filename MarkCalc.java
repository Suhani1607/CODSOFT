import java.util.Scanner;

public class MarkCalc {
   public MarkCalc() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      float var2 = 0.0F;
      System.out.print("Enter Number of Subject: ");
      int var3 = var1.nextInt();

      for(int var4 = 1; var4 <= var3; ++var4) {
         System.out.println("Enter Mark of Subject_" + var4);
         float var5 = var1.nextFloat();
         var2 += var5;
      }

      System.out.println("Total marks obtain by a student: " + var2);
      float var6 = var2 / (float)var3;
      System.out.println("Average Percentage is: " + var6);
      if (var6 <= 100.0F && var6 >= 90.0F) {
         System.out.println("Grade: A+");
      } else if (var6 < 90.0F && var6 >= 80.0F) {
         System.out.println("Grade: A");
      } else if (var6 < 80.0F && var6 >= 70.0F) {
         System.out.println("Grade: B+");
      } else if (var6 < 70.0F && var6 >= 60.0F) {
         System.out.println("Grade: B");
      } else if (var6 < 60.0F && var6 >= 50.0F) {
         System.out.println("Grade: C");
      } else if (var6 < 50.0F && var6 >= 40.0F) {
         System.out.println("Grade: D");
      } else {
         System.out.println("FAIL...Need to work hard!!!");
      }

      var1.close();
   }
}