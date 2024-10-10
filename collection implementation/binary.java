import java.util.Scanner;
import java.util.Arrays;
class binary
{
  public static void main(String[] args)
  {
     Scanner ob=new Scanner(System.in);
     System.out.println("Enter the number:");
     int n=ob.nextInt();
    // int[] ar=new int[n];
     System.out.println("Enter the array of numbers");
    /* for(int i=0;i<n;i++)
     {
       ar[i]=ob.nextInt();
     }*/
     split(ar);
  }
  private static  int change(int s)
  {
    if(s==1||s==2||s==4||s==8)
    {
     return 1;
    } 
    else if(s==3||s==6||s==5||s==9)
    {
      return 2;
    }
    else
    {
       return 3;
    }
  }
  public static void split(int num)
  {
  int n=num.length;
  int k=0;
   int[] ar=new int[n];
  for(int i=0;i<n;i++)
  {
    
  int sum=0;
  int r=0;
  
    while(num[i]>0)
    {
      num[i]=num%10;
      r=change(num[i]);
      sum+=r;
      num[i]=num[i]/10;
    }
    ar[k++]=sum;
  }
  Arrays.sort(ar);
  for(int i=0;i<n;i++)
  {
     System.out.println(ar[i]);
  }
  
}
}
    
  
    
      
      
