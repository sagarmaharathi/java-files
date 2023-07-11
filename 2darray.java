import java.util.scanner;
public class 2darray
 {
  public static void main(String args[])
   {
   int a[][]=new int[2][4];
   int i,j;
   scanner sc=new scanner(System.in);
   System.out.println("enter the value in array:");
   for(i=0;i<2;i++)
     {
       for(j=0;j<4;j++)
        {
         a[i][j]=sc.nextint();
        }
      }
    System.out.println("array is:");
   for(i=0;i<2;i++)
     {
       for(j=0;j<4;j++)
        {
         System.out.println(a[i][j]+" ");
        }
      }
   }
}