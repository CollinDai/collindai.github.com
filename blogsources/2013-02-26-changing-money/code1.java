class makeChange1 {
  static int penny = 1,nickle = 5,dime = 10, quarter = 25;
  public static int makeChange(int all) {
    int ways = 0;
    int qb = all / quarter;
    int remain = all;
    for (int q=qb;q>=0; --q) { //如果all=100，则qb=4，刚好4个quarter
      if (remain - q * quarter == 0) { 
        ways++;
        continue;
      }
      int remainForDime = remain - q * quarter; // 用quarter后剩下的金额
      int db = remainForDime / dime;
      for (int d=db; d>=0; --d) {
        if (remainForDime - d * dime == 0) {
          ways++;
          continue;
        }
        int remainForNickle = remainForDime - d * dime;
        int nb = remainForNickle / nickle;
        for (int n=nb; n>=0; --n) {
          if (remainForNickle - n * nickle == 0) {
            ways++;
            continue;
          }
          int remainForPenny = remainForNickle - n * nickle;
          int pb = remainForPenny;
          for (int p=pb; p>=0; --p) {
            if (remainForPenny - p * penny == 0) {
              ways++;
              break; // 最小面额为penny，不用继续打碎了
            }
          }
        }
      }
    }
    return ways;
  }
  
  public static void main(String[] argv) {
    System.out.println(makeChange(Integer.parseInt(argv[0])));
  }
}
