public class StarTriangleN {
   /**
     * Prints a right-aligned triangle of stars ('*') with N lines.
     * The first row contains 1 star, the second 2 stars, and so on. 
     */
   public static void starTriangle(int N) {
      // TODO: Fill in this function
      for (int m = 1; m <= N; m++) {
         for (int i = 1; i <= N-m; i++) {
            System.out.print(" ");
         }
         for (int j = 1; j <= m; j++) {
            System.out.print("*");
         }
         if(m != N) {
            System.out.println();
         }
      }
   }
   
   public static void main(String[] args) {
      starTriangle(7);
   }
}