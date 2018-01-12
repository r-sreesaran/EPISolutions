package string;


public class Palindrome {

    public boolean isPalindrome(String testString) {
int i=0,j=testString.length()-1;

while (i<j) {

    while(!Character.isLetterOrDigit(testString.charAt(i)  ) && i<j) {
        ++i;
    }
    while(!Character.isLetterOrDigit(testString.charAt(j)  ) && i<j) {
        --j;
    }
   if(Character.toLowerCase(testString.charAt(i++))!=Character.toLowerCase(testString.charAt(j--) )) {
       return false;
   }

}
        return true;
    }


}
