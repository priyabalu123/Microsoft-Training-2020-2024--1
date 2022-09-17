import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int space=n;
    int num=1;
    for(int i=0;i<n;i++)
      {
        for(int j=1;j<=space;j++)
          {
            System.out.print(" ");
          }
        num=1;
        for(int k=0;k<=i;k++)
          {
            System.out.print(num+" ");
            num=num*(i-k)/(k+1);
          }
        space--;
        System.out.println();
      }
  }
}

/*Input:5
 Output:
             1
          1     1
        1    2    1
      1    3   3     1
   1    4     6    4    1  */
