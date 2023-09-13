
public class demo                     //similar to int main where all of the takes place
{
public static void main(String a[])
{
   AdvanCalc obj=new AdvanCalc();  //adjusting newer child class and keeping it primary code
   
   int r1=obj.add(4,5);
   int r2=obj.sub(7,3);
   int r3=obj.multi(4,5);
   int r4=obj.div(5,5);

   System.out.println(r1+ " "+r2+" "+r3+" "+r4);
}
}