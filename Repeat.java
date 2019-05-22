import java.util.*;
public class Repeat{
public static void main(String[] args) {
String s1,s2,sum=" ";
Scanner scan=new Scanner(System.in);
s1=scan.nextLine();
s2=scan.nextLine();
 String[] str=s1.split(" ");
for(int i=0;i<str.length;i++) {
if(str[i]!=s2)
sum=str[i]+" ";
}
System.out.print(sum);
}
}