class makeChange1 {
  static int penny = 1,nickle = 5,dime = 10, quarter = 25;
  public static int makeChange(int all) {
    int ways = 0;
    int qb = all / quarter;
    int remain = all;
    for (int q=qb;q>=0; --q) { //���all=100����qb=4���պ�4��quarter
      if (remain - q * quarter == 0) { 
        ways++;
        continue;
      }
      int remainForDime = remain - q * quarter; // ��quarter��ʣ�µĽ��
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
              break; // ��С���Ϊpenny�����ü���������
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
