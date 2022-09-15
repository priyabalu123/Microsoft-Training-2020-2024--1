import java.util.*;
class Main {
  public static int GCD(int N1,int N2)
  {
    if(N1==0)
    {
      return N2;
    }
    return GCD((N2%N1),N1);
  }
  public static int LCM(int N1,int N2)
  {
    return (N1*N2)/GCD(N1,N2);
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int N1=sc.nextInt();
    int N2=sc.nextInt();
    System.out.print(LCM(N1,N2));
  }
}

/*Input: 8 10
 Output: 40 */
