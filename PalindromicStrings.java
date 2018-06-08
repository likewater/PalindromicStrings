public class PalindromicStrings {

  public static void main(String... y){
    int z = Integer.parseInt(y[0]);
    PalindromicStrings a = new PalindromicStrings();
    System.out.println(a.isPalindromic(z));
  }

  public boolean isPalindromic(int x) {
    if (x < 0) {
      return false;
    }
    if ((x >= 0 && x < 10) | (x % 11) == 0) {
      return true;
    }
    else {
      long reversedNum = 0;
      long input_long = x;
      while (input_long !=0) {
        reversedNum = reversedNum * 10 + input_long % 10;
        input_long = input_long / 10;
        System.out.println(reversedNum + " " + input_long);
      }
      if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE){
        throw new IllegalArgumentException();
      }
      if (reversedNum == x) {
        return true;
      }
      else {
        return false;
      }
    }
  }
}
