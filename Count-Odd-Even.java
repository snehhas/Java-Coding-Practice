static void countOddEven(int a[], int n) {

        int x = 0;
       for(int i : a)
           if((i&1) == 1)
               x++;   
       System.out.print(x + " " + (n-x));
    }
