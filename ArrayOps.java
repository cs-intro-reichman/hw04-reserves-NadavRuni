public class ArrayOps {
    public static void main(String[] args) { 

        
    }
    
    public static int findMissingInt (int [] array)
     {
        boolean here=false;
        for (int i=0;i<=array.length;i++)
        {
            for(int check=0;check<array.length;check++)
            {
                if (array[check]==i)
                {
                    here=true;
                }    
            }
            if (here==true)
            {
                here=false;
            }
            else return i;
        }


        return 1;
    }

    public static int secondMaxValue(int [] array) {
        int max1=Math.max(array[0], array[1]);
        int max2=Math.min(array[0], array[1]);
        for (int i=2;i<array.length;i++)
        {
            if(array[i]>=max1)
            {
                max2=max1;
                max1=array[i];
            }
            else if (array[i]>max2)
            {
                max2=array[i];
            }
            
        }
        return max2;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean find=false;
        for (int i=0;i<array1.length;i++)
        {
            for (int j=0;j<array2.length;j++)
            {
                if (array1[i]==array2[j])
                {
                    find=true;
                }
            }
            if (find==false)
            {
                return find;
            }
            else 
            {
                find=false;
            }

        }
        for (int i=0;i<array2.length;i++)
        {
            for (int j=0;j<array1.length;j++)
            {
                if (array2[i]==array1[j])
                {
                    find=true;
                }
            }
            if (find==false)
            {
                return find;
            }
            else 
            {
                find=false;
            }

        }
        return true;
    }

    public static boolean isSorted(int [] array)
     {

        if (array.length>1)
        {
            if (array[0]<array[1])
            {
                for (int i =0 ; i<array.length-1;i++)
                {
                    if (array[i]>array[i+1])
                    {
                        return false;
                    }
                }
            }
            else if (array[0]>array[1])
            {
                for (int i =0 ; i<array.length-1;i++)
                {
                    if (array[i]<array[i+1])
                    {
                        return false;
                    }
                }
            }
            return true;
        
        }
        else return true;
    

    }

}
