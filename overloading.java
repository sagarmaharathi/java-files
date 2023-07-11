public class overloading
{
 int add()
  {
  return(10+10);
  }
 int add(int x,int y)
  {
  return(x+y);
  }
 float add(float a,float b)
  {
  return(a+b);
  }
public static void main(String args[])
  {
  overloading ob=new overloading();
  System.out.println("using default value is:"+ob.add());
  System.out.println("add two integer:"+ ob.add(59,30));
  System.out.println("add two float:"+ ob.add(2.1f,4.8f));
  }
}