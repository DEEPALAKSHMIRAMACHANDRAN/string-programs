import java.util.*;
public class reverse {
public static void main(String[] args) {
String s;
Scanner scan=new Scanner(System.in);
s=scan.nextLine();
String reverse="";
for(int i=s.length()-1;i>=0;i--) {
reverse=reverse+s.charAt(i);
}
System.out.print(reverse);
}
}