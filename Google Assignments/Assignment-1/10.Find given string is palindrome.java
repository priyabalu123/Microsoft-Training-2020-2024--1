import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String rev="";
    int len=str.length();
    for(int i=len-1;i>=0;i--)
      {
        rev=rev+str.charAt(i);
      }
    if(str.equals(rev))
    {
      System.out.print("Palindrome");
    }
    else{
      System.out.print("Not a Palindrome");
    }
  }
}

/*Input:madam
 Output:Palindrome */
