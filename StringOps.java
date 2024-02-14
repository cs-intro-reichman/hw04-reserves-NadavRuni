public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args)
     {
        
    }

    public static String capVowelsLowRest (String string) 
    {
        for (int i=0;i<string.length();i++)
        {
            if(isBig(string.charAt(i)))
            { 
                if(isVowels(string.charAt(i))==false)
                {
                    string= makeItNew(string, i, makeItSmall(string.charAt(i)));

                }
            }
            else if (isSmall(string.charAt(i)))
            {
                if(isVowels(string.charAt(i))==true)
                {
                    string= makeItNew(string, i, makeItBig(string.charAt(i)));

            }
        }
        }
        return string;
    }

    public static String camelCase (String string)
     {
        string=afterSpaceBigElseSmall(string);
        string=deleteSpace(string);
        if (isBig(string.charAt(0)))
        {
            string = makeItNew(string, 0, makeItSmall(string.charAt(0)));
        }

       return string;
    }

    public static int[] allIndexOf (String string, char chr) 
    {
     int [] indexof=new int[howManyChar(string, chr)];
     int place=0;
     for (int i=0;i<string.length();i++)  
     {
        if (string.charAt(i)==chr)
        {
            indexof[place]=i;
            place++;
        }

     }
        return indexof;
    }
    public static boolean isBig (char a)
     {
   // בודק האם היא אות גדולה 
      return (a >= 'A' && a <= 'Z') ;
     }
     public static boolean isSpace (char a)
     {
   // בודק האם זה רווח 
      return (a==' ');
     }
     public static int howManySpace (String s)
     {
   // מקבל מחרוזת וסופר כמה רווחים יש בה 
   int count=0;
   for (int i=0;i<s.length();i++)
   {
    if(isSpace(s.charAt(i)))
    {
count++;
    }
   }
   return count;
}
   
   public static int howManyChar (String s, char ch)
   {
 // מקבלת מחרוזת ואות ומחזירה כמה פעמים האות מופיעה
 int count=0;
 for (int i=0;i<s.length();i++)
 {
  if(ch==s.charAt(i))
  {
count++;
  }
 }
      return count;
     }
     public static boolean isSmall (char a)
     {
   // בודק האם היא אות קטנה 
      return (a >= 'a' && a <= 'z') ;
     }

     public static boolean isVowels (char a)
     {
// בודק האם זה אות ניקוד
      return ((a=='a')|| (a=='o')||(a=='e')||(a=='i')||(a=='u')||(a=='A')||(a=='O')||(a=='E')||(a=='I')||(a=='U'));
     }


    public static char makeItBig (char a)
     {
        // מקבל אות קטנה והופך אותה לגדולה 
        char newchar=(char) (a - 32);
        return newchar;
    }
    public static char makeItSmall (char a)
     {
        // מקבל אות גדולה והופך אותה לקטנה 
        char newchar=(char) (a + 32);
        return newchar;
    }
    public static String makeItNew(String s, int placeOfChange, char replace) 
    {
     // פעולה המקבלת , מחרוזת, מיקום החלפה , אות להחלפה ומחזירה את המחרוזת החדשה לאחר ההחלפה 
        char[] charOfString = s.toCharArray();
        charOfString[placeOfChange] = replace;
        return new String(charOfString);

}
public static String deleteSpace(String s) 
    {
     // פעולה המקבלת מחרוזת ומוחקת את רווחים
     char[] charOfStringOld = s.toCharArray();
     char[] charOfStringNew= new char[s.length()-howManySpace(s)];
     int place=0;
     for (int i=0;i<s.length();i++)  
     {
        if (isSpace(charOfStringOld[i])==false)
        {
            charOfStringNew[place]=s.charAt(i);
            place++;

        }

     }
    
        return new String(charOfStringNew);

}
public static String afterSpaceBigElseSmall(String s) 
    { 
        if(isSmall(s.charAt(0)))
        {
            s=makeItNew(s , 0, makeItBig(s.charAt(0)));
        }
        for (int i=1;i<s.length();i++)
        {
            if ( isSpace(s.charAt(i-1))&&(isSpace(s.charAt(i))==false))//  אם האות הנוכחית היא לא רווח והקודם כן 
            {
                if (isSmall(s.charAt(i)))
                {
                    s=makeItNew(s , i, makeItBig(s.charAt(i)));
                }
            }
            else  if ( (isSpace(s.charAt(i-1))==false)&&((isSpace(s.charAt(i))==false))) // האות הנוכחית הירא לא רווח וגם הקודמת לא 
            {
                if (isBig(s.charAt(i)))
                {
                    s=makeItNew(s , i, makeItSmall(s.charAt(i)));
                }
            }
           
        }
       return s;
    }
     
}
