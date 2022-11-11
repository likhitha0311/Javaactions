package Practice;

public class Palindrome {

	static boolean sentencePalindrome(String str)
    {   
        int l = 0;
        int h = str.length()-1;
        System.out.println("Initial value of h is "+h);
         
        char getAtl ;
       // System.out.println(" Outside l is "+getAtl);
        char getAth ;
        //System.out.println("outside  h is "+getAth);
        // Lowercase string
        str = str.toLowerCase();
         
        // Compares character until they are equal
        while(l <= h)
        {
        	 getAtl = str.charAt(l);
             System.out.println(" Outside l is "+getAtl);
             getAth = str.charAt(h);
             System.out.println("outside  h is "+getAth);
           
           // If there is another symbol in left
            // of sentence
//            if (!(getAtl >= 'a' && getAtl <= 'z'))
//               l++;
//            
//           // If there is another symbol in right
//           // of sentence
//           else if(!(getAth >= 'a' && getAth <= 'z'))
//               h--;
            
           if(Character.isWhitespace(getAth))
           {
        	   h=h-1;;
        	   getAth=	  str.charAt(h) ;
        	   System.out.println("h is "+getAth);
           }
           if( Character.isWhitespace(getAtl))
           {
        	   l=l+1;
        	   getAtl=	  str.charAt(l) ;
           System.out.println("l is "+getAtl);
           }
           
            // If characters are equal
           System.out.println(" Outside equal l is "+getAtl);
           System.out.println("outside equal  h is "+getAth);
            if(getAtl == getAth)
            {
            	System.out.println("Am I entering here");
                l++;
                h--;
            }
             
            // If characters are not equal then
            // sentence is not palindrome
            else
                return false;
        }
         
        // Returns true if sentence is palindrome
        return true;   
    }
     
    // Driver program to test sentencePallindrome()
    public static void main(String[] args)
    {
        String str = "never odd or even";
        if( sentencePalindrome(str))
          System.out.println("Sentence is palindrome");
        else
          System.out.println("Sentence is not" + " " +
                                         "palindrome");
    }
}
 


