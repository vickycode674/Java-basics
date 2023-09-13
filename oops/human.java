//encapsulation  -->In Java, encapsulation is achieved by using access modifiers such as private, public, and
//  protected to control the visibility of class members (fields and methods). Here's an example of encapsulation in
//   Java:


class humans  //why not capital class name (tech error)
{
   private int age;  //genrally private cannot acces direcly they can be done by using methods
   private String name;

//    public int getAge()
//    {
//     return age;       //geting age used after seting the age
//    }

//    public void setAge(int a){
//       age=a; //setting using the methods concept which can be done using objects 
//    }

//    public String getName(){
//     return name;
//    }           

//    public void setName(String n)
//    {
//     name=n;
//    }
}

public class human
{
    public static void main(String a[])
    {
        humans obj=new humans();
         obj.setAge(30);
         obj.setName("sai");
       System.out.println(obj.getName()+ " : "+obj.getAge());
    }
}

//constructor 

// constructor its a type of method which having a same name of class this constructor creates simlar to method helps
// to differntiate the content rather than direcly applying to the private class

// parmater vs default constructer 

// without paramter is default and were as parameter is called paramter 