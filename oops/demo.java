class A
{

    public A() 
    {
       System.out.println("object created");
    }

    public void show()
    {
            System.out.println("object created hello world");
    }
}


public class demo
{
    public static void main(String a[])
    {
        A obj =new A(); //creating a new object
        obj.show(); 

        //anomynous object 
        new A().show(); //direct referential call to the following object
    }
}