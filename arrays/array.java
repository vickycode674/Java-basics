    //similaar to carrying no of eggs in a tray

    public class array
    {
        public static void main(String arg[])
        {
            // int nums[]={3,5,6}; //declaration of array in javas

            // System.out.println(nums[2]);

            //multidimensional arrays
            int nums[][]=new int[3][4];
            int random=0;
            // (int)Math.random()*100;

            for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j]=(int)(Math.random()*100);
            }
            }
            //enhanced for loop while printing

            for(int n[]:nums)
            {
                for(int m:n)
                {
                    System.out.print(m + " ");
                }
                System.out.println();
            }
    //    for(int i=0;i<3;i++){
    //           for(int j=0;j<4;j++){
    //              System.out.print(nums[i][j]+" ");
    //           }
    //           System.out.println();
    //         }
    //     }

    //jagged arrays

    //arrays inside the following arrays size can be varies and based on the following  assumptiona

    //we particalurly not known the values of row and columns of the following arrays
    // 456 
    // 65
    // 2

    //Drawbacks of array

    //array is an object we canoot increse the size
    //*Traverse between elements
    //Array of different types its not possible     

                    //collections are advanced version of arrays in java




    }
    }