import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    for(int i=N;i>=1;i--)
      {
        for(int j=i;j>=1;j--)
          {
            System.out.print(j+" ");
          }
        System.out.println();
      }
  }
}

/*Input:5
  Output:
  5 4 3 2 1
4 3 2 1
3 2 1
2 1
1 */
