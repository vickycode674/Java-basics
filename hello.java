class calculator
{

  int a;  //this is primitive declaration
  public int add(int n,int k)  //this is an method to create a certain thing
  {
    int r=n+k;
    return r;
  }
}

public class hello
{
 public static void main(String a[])
  {
    int num1=1; 
    int num2=2;

  calculator calc=new calculator(); //hey jvm i need new object and show caluclator

    int result=calc.add(num1,num2);   //this is  instance
   
    System.out.println(result);

  }
}