import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int [] arr=new int[N];
    for(int i=0;i<N;i++)
      {
        arr[i]=sc.nextInt();
      }
    int temp;
    for(int i=0;i<N;i++)
      {
        for(int j=i+1;j<N;j++)
          {
              if(arr[i]>arr[j])
              {
                 temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
              }
          }
      }
    System.out.print(arr[N-2]);
  }
}

/*Input:5
   4 7 9 3 8
  Output:9 */ 
