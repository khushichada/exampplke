import java.util.*;
class FiboNon
{

static int printfibo(int num)
{
if(num<=1)
{
return num;
}
return printfibo(num-1)+printfibo(num-2);
}
public static void main(String args[])
{
int a=0;
int b=1;
int sum=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=0;
System.out.print(a+" "+b+" ");
while(i<n)
{
sum=a+b;

System.out.print(sum+" ");
a=b;
b=sum;
i++;
}
for(int j=0;j<n;j++)
{
int res=printfibo(j);
System.out.print(res+" ");
}
}
}