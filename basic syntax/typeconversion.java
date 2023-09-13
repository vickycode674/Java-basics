class typeconversion{

public static void main(String args[]){
// int ab=128;
// byte b=127;  //cannot cross more than 127

float f=4.6f;
int  a=(int)f;

//conversion of byte limt is 127 whihc it divides with following number and give remainder
int s=257;
byte k=(byte)s;
 
//'automatic type conversion' when to float and are given  their resulting sum is integer then automatical tc applies
// b=(byte)ab;  //casting a of integer to an byte format to store in b bytes
System.out.println(k);


//type promotions 


byte h=3;
byte z=10;

int l=h*z;  //converts h,z to l interger

System.out.print(l);







}
}