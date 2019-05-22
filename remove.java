import java.util.*;
public class remove {
public static void main(String[] args) {
String s1,s2,c=" ";
int i,j;
Scanner scan=new Scanner(System.in);
s1=scan.nextLine();s2=scan.nextLine();
char [] a1=s1.toCharArray();
char [] a2=s2.toCharArray();
for(i=0;i<a1.length;i++){
int count=0;
for(j=0;j<a2.length;j++){
if(a1[i]==a2[j]){
count++;
}
}
if(count==0){
c=c+a1[i];
}
}
System.out.println(c);
}}
