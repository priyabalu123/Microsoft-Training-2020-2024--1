import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int matrix[][]=new int [row][col];
    int transpose[][]=new int[col][row];
    for(int i=0;i<row;i++)
      {
        for(int j=0;j<col;j++)
          {
            matrix[i][j]=sc.nextInt();
          }
      }
    for(int i=0;i<row;i++)
      {
        for(int j=0;j<col;j++)
          {
            transpose[j][i]=matrix[i][j];
          }
      }
    for(int i=0;i<col;i++)
      {
        for(int j=0;j<row;j++)
          {
            System.out.print(transpose[i][j]+" ");
          }
        System.out.println();
      }
  }
}

/*Input:2 3
  1 2 3
  4 5 6
  Output:
  1 4
  2 5
  3 6 */
