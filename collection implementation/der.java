class co
{
   co()
   {
      System.out.println("Hi");
   }
   void dis()
   {
     System.out.println("hello");
   }
}
class der extends co
{
   der()
   {
      System.out.println("Welcome");
   }
    void dis()
   {
    super.dis();
   }
   
   public static void main(String[] args)
   {
      der d=new der();
      d.dis();

   }
}

