import java.util.*;
import java.io.*;
/// //////////////////working with string classes
public class Strings {
    public void stringclasses(){
        /*using string class
    objects of string classe are mutable, the cannot be changed once created
    returns new object
     it can be created either using String literal or new keyword*/
        System.out.println("---------using string class-------");
        String s1 = "java programming language ";
        String s2 = new String("using string class");
        int i = s1.length();
        char j = s1.charAt(2);
        System.out.println("length "+i);
        System.out.println("char at 2:"+j);
        System.out.println("concatenation:"+s1.concat(s2));

    /*using string buffer class, its objects are mutable, changes are made on the original string
    StringBuffer is synchronized, meaning its methods are thread-safe and can be safely used in multithreaded
    environments where multiple threads may access or modify the string concurrently.
     */
        System.out.println("-------using string buffer class--------");
        StringBuffer s3=new StringBuffer("Roronoa zoro" );
        s3.append(" and luffy");
        System.out.println(s3);
        s3.insert(0,"name:");
        System.out.println(s3);
        s3.delete(0,13);
        System.out.println(s3);
        s3.replace(0,4,"sanji");
        System.out.println(s3);

    /*using string builder
    it provides a mutable sequence of characters
    StringBuilder does not guarantee synchronization so it is recommended to use string buffer over string builder
    */
        System.out.println("------using string builder class-------");
        StringBuilder s4 = new StringBuilder("hello ");
        s4.append("world");
        System.out.println(s4);
        s4.insert(0,"string:");
        System.out.println(s4);
        s4.delete(0,7);
        System.out.println(s4);
        s4.replace(0,11,"welcome");
        System.out.println(s4);
    }

        /// //////////reverse a string
        public void revstring(){
            StringBuffer s1=new StringBuffer("Hello!!");
            StringBuffer s2 = new StringBuffer(s1.length());
            for (int k = 0; k < s1.length(); k++) {
                s2.append(' ');
            }
            int j=s1.length()-1;
            for(int i=0;i<s1.length();i++){
                char a=s1.charAt(j);
                s2.setCharAt(i,a);
                j--;
            }
            System.out.println(s2);
        }
        /// //////////Check if Two Strings are Anagrams
        public void anagrams(StringBuffer s1, StringBuffer s2) {
            char temp = 0;
            for (int i = s1.length() - 2; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    if (s1.charAt(j) > s1.charAt(j + 1)) {
                        temp = s1.charAt(j);
                        char a= s1.charAt(j + 1);
                        s1.setCharAt(j,a);
                        char b= temp;
                        s1.setCharAt(j + 1,b) ;
                    }
                }
            }
            System.out.println(s1);
            char temp2 = 0;
            for (int i = s2.length() - 2; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    if (s2.charAt(j) > s2.charAt(j + 1)) {
                        temp2 = s2.charAt(j);
                        char a= s2.charAt(j + 1);
                        s2.setCharAt(j,a);
                        char b= temp2;
                        s2.setCharAt(j + 1,b) ;
                    }
                }
            }
            System.out.println(s2);
            if (s1.toString().equals(s2.toString())) {
                System.out.println("Strings are anagrams");
            }
            else{
                System.out.println("not anagrams");
            }
        }
        /// ////////Replace All Occurrences of a Character
        public void rep(StringBuffer s1){
            Scanner s=new Scanner(System.in);
            System.out.println("enter character to be replaced");
            String a1=s.next();
            char a=a1.charAt(0);
            System.out.println("enter new character");
            String b=s.next();
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)==a){
                    s1.replace(i,i+1,b);
                }
            }
            System.out.println(s1);
        }
        /// ///////////check if string is palindrome
        public void palin(StringBuffer s1, StringBuffer s2) {
            int flag = 1;
            int j = s1.length()-1;
            if (s1.length() == s2.length()) {
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) != s2.charAt(j)) {
                        flag = 0;
                        break;
                    }
                    j--;
                }
            }
            else{
                    flag = 0;
                }
            if (flag==1){
                System.out.println("strings are palindrome");
            }
            else{
                System.out.println("strings are not palindrome");
            }
        }
        /// ///////////// Count Vowels and Consonants in a String
        public void vow(StringBuffer s1){
            int j=0;
            int k=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'){
                    j++;
                } else if (s1.charAt(i)==' ') {
                    //pass
                }
                else{
                    k++;
                }
            }
            System.out.println("vowels:"+j);
            System.out.println("consonants:"+k);
        }
        /// /////////sorting of string
        public void sorting(StringBuffer s1){
            System.out.println("before sorting:"+s1);
            char temp = 0;
            for (int i = s1.length() - 2; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    if (s1.charAt(j) > s1.charAt(j + 1)) {
                        temp = s1.charAt(j);
                        char a= s1.charAt(j + 1);
                        s1.setCharAt(j,a);
                        char b= temp;
                        s1.setCharAt(j + 1,b) ;
                    }
                }
            }
            System.out.println("after sorting:"+s1);
        }
public static void main(String[] args) {

    Strings s = new Strings();
    StringBuffer s1=new StringBuffer("heyy");
    //StringBuffer s2=new StringBuffer("sil");
    //s.stringclasses();
    //s.revstring();
    //StringBuffer s3=new StringBuffer("roronoa zoro");
    //s.anagrams(s1,s2);
    //s.rep(s3);
    //s.palin(s1,s2);
    //s.vow(s1);
    s.sorting(s1);
}
}
