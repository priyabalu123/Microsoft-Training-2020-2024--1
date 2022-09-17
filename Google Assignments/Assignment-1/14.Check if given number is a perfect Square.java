import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    double sq=Math.sqrt(N);
    if(sq==Math.floor(sq))
    {
      System.out.print("Perfect Square");
    }
    else{
      System.out.print("Not a perfect Square");
    }
  }
}

/*Input:25
 Output:Perfect Square */
