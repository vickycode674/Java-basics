class calculator
{ 
  int num=5;  //this is primitive declaration (instance variable)   //heap stores
  
  
  public int add(int n,int k)  //this is an method to create a certain thing
  {//local variable part n,k are part of stack
    int r=n+k;
    return r;
  }

  //method overloading
  public int add(int n,int k,int r){
    int j=n+k+r;
    return j;
  }
}

public class methods
{
 public static void main(String a[])
  {
    int num1=1; 
    int num2=2;
    int num3=7;

  calculator calc=new calculator(); //hey jvm i need new object and show caluclator 
  calculator calc1=new calculator();
  //here calc is refrence variable its  not an object

  //objects are genrally created in heap memory 

    int result=calc.add(num1,num2,num3);   //this is  instance 
    //connection between stack and heap during the calling its instane
  //  calc.num1=5;
    System.out.println(calc.num);
        System.out.println(calc1.num);


  }
}