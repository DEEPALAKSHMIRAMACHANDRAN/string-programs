import java .util.*;
public class duplicate {
public static void main(String[] args) {
String s1;
String s="";
int i,l,j,c=0,k;
Scanner scan=new Scanner(System.in);
s1=scan.nextLine();
String[] str=s1.split(" ");
l=s1.length();
for(i=0;i<l;i++) {
for(j=0;j<str[i].length();j++) {
for(k=0;k<str[i].length();k++)
if(str[i].charAt(j)==str[i].charAt(k)) {
c++;
}
}
if(c==l)
s=s+str[i].charAt(j);
}
System.out.print(s);
}
}