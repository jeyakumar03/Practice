import java.util.Scanner;
import java.util.Arrays;
class bubblesort
{
  public static void main(String[] args)
  {
  Scanner ob=new Scanner(System.in);
  System.out.println("Enter the size:");
  int t=ob.nextInt();
  int[] ar=new int[t];
  System.out.println("Enter the array:");
  for(int i=0;i<t;i++)
  {
    ar[i]=ob.nextInt();
  }
  sort(ar,t);
  
}
 public static void sort(int[] a,int n)
 {
    for(int i=0;i<n;i++)
    {
     for(int j=0;j<n-1;j++)
     {
       if(a[j]>a[j+1])
       {
         int temp=a[j];
         a[j]=a[j+1];
         a[j+1]=temp;
       }
     }
     System.out.println(Arrays.toString(a));
   }
   for(int i=0;i<n;i++)
   {
      System.out.println(a[i]);
   }
}
}

   
