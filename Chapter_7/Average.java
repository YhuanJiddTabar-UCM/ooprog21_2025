class Average {

   public static double[] mid = new double[4];
   public static int[] times = {100, 200, 150, 300};
   
   public static void main(String[] args) {
      int total = 0;
      Compute();
      for (int i = 1; i < times.length; i++) {
         if (times[i] > mid[i - 1]) {
            total++;
         }
      }
      System.out.print(total);
   }

   public static void Compute() {
      int sum = 0;
      int count = 0;
      for (int i = 0; i < times.length; i++) {
         sum += times[i];
         count++;
         mid[i] = sum / count;
      }
   }
}
