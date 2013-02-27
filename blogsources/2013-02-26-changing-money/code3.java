class makeChange3 {
  static int[] types = {1, 5, 10, 25};
  public static int makeChange(int remain, int k) { 
    // first k types of coin. initially 3 in this case
    System.out.println(remain);
    System.out.println(k);
    if (remain < 0 || k < 0 ) return 0;
    // optimization 1. add an or condition k == 0
    // because there is always exactly 1 way to 
    // make change of any number of cents
    else if (remain == 0) return 1;
    else return makeChange(remain, k-1) + makeChange(remain-types[k], k);
  }
  
  public static void main(String[] argv) {
    System.out.println(makeChange(Integer.parseInt(argv[0]),3));
  }
}