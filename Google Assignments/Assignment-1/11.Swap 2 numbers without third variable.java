import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int X=sc.nextInt();
    int Y=sc.nextInt();
    X=X+Y;
    Y=X-Y;
    X=X-Y;
    System.out.print(X+" "+Y);
  }
}

/*Input:10 15
 Output:15 10 */
