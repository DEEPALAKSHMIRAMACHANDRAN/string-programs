import java.util.*;
public class Anagram {
public static void main(String[] args) {
String s1,s2;
int i;
Scanner scan=new Scanner(System.in);
s1=scan.nextLine();
s2=scan.nextLine();
char[] a1 =s1.toCharArray();
char[] a2 =s2.toCharArray();
for(i=1;i<=s1.length();i++) {
if(s1.length()==s2.length())
break;
}
if(a1[i]==a2[i]) 
System.out.print("Anargam");
else
System.out.print("Not Anargam");
}
}