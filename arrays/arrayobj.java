class Student  //careated a class with 3 variables
{
int rollno;
String name;
int marks;
}


public class arrayobj
{
    public static void main(String args[])
    {
        Student s1=new Student();                       //creating a object assigning the following 
        s1.rollno=1;
        s1.name="vivek";
        s1.marks=99;

        Student s2=new Student();                       
        s2.rollno=2;
        s2.name="soori";
        s2.marks=94;

        Student s3=new Student();                       
        s3.rollno=4;
        s3.name="Ramesh";
        s3.marks=92; 


        Student students[]=new Student[3];  //creating an array to store student and intialize with the length

        students[0]=s1;
        students[1]=s2;
        students[2]=s3; 

        // for(int i=0;i<students.length;i++)
        // {
        //     System.out.println(students[i].name+ " : "+students[i].marks + ":" +students[i].rollno);
        // }


    for(Student stud:students)
    {
        System.out.println(stud.name+ ":"+stud.marks);
    }

    //enhanced foor loop     or for each loop

    // int nums[]=new int[4];

    // nums[0]=4;
    // nums[1]=8;
    // nums[2]=3;
    // nums[3]=9;


    // for(int i=0;i<nums.length;i++){
    //     System.out.println(nums[i]);
    // }
    // for(int n:nums){
    //     System.out.println(n);
    // }


    }
}
