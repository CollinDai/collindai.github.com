class makeChange4 {
  static int[] types = {1, 5, 10, 25};
  static int[] ways = null;
  public static int makeChange(int remain, int k) { 
    // first k types of coin. initially 3 in this case
    // System.out.println("===");
    // System.out.println(remain);
    // System.out.println(k);
    // System.out.println("===");
    if (remain < 0 || k < 0) return 0;
    else if (ways[remain] != 0) return ways[remain];
    else if (remain == 0) return 1;
    else {
      int a = makeChange(remain, k-1);
      // System.out.format("a: %d%n",a);
      int b = makeChange(remain-types[k], k);
      // System.out.format("b: %d%n",b);
      ways[remain] = a + b;
      // System.out.println("---");
      return ways[remain];
    }
  }
  
  public static void main(String[] argv) {
    int in = Integer.parseInt(argv[0]);
    ways = new int[in+1];
    System.out.println(makeChange(in,3));
    
    // for (int i : ways)
      // System.out.println(i);
  }
}