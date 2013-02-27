class makeChange2 {
  public static int makeChange(int remain) {
    if (remain < 0 ) return 0;
    else if (remain == 0) return 1;
    else return makeChange(remain-25) + makeChange(remain-10) + 
                makeChange(remain-5) + makeChange(remain-1);
  }
  
  public static void main(String[] argv) {
    System.out.println(makeChange(Integer.parseInt(argv[0])));
  }
}