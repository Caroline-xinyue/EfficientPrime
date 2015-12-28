public class Solution {
  public ArrayList<Integer> sieve(int a) {
      ArrayList<Integer> solution = new ArrayList<Integer>();
      int[] answer = new int[a+1];
      for(int i = 0; i <= a; i++) {
          answer[i] = 1;
      }
      answer[0] = 0;
      answer[1] = 0;
      for(int j = 2; j <= Math.sqrt(a); j++) {
          if(answer[j] == 1) {
              for(int k = 2; j*k <= a; k++) {
                  answer[j*k] = 0;
              }
          }
      }
      for(int i = 0; i <= a; i++) {
          if(answer[i] == 1) {
              solution.add(i);
          }
      }
      return solution;
  }
}
