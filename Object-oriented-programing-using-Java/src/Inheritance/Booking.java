package Inheritance;
import java.util.Scanner;

public class Booking {
public static int booked[] = new int[25];
Scanner s = new Scanner(System.in);
String c[]=new String[25];
int i=1;
int j=1;
static void book() {

String ac,pr,pro;
String cot;
String cable;
String wifi;
String laundry;
Scanner s = new Scanner(System.in);
int total,b=0,c,d,e,f,i=1;
do
{
System.out.println("Booking");
System.out.println("Please choose the servise requested");
System.out.println("AC/non-AC(AC/nAC)");
ac = s.next();
if(ac.equals("AC")==true)
{
b=1000;
}
else
{
b=750;
}
System.out.println("single cot or double cot");
cot = s.next();
if(cot.equals("single")==true)
{
c=0;
}
else
{
c=350;
}
System.out.println("with cable connection/without cable connection(C/nC)");
cable = s.next();
if(cable.equals("C")==true)
{
d=50;
}
else
{
d=0;
}
System.out.println("wifi needed or not(W/nW)");
wifi = s.next();
if(wifi.equals("W")==true)
{
e=200;
}
else
{
e=0;
}
System.out.println("laundry servise needed or not(L/nL)");
laundry = s.next();
if(laundry.equals("L")==true)
{
f=100;
}
else
{
f=0;
}
total= b+c+d+e+f;
System.out.println("The total charge is Rs:"+total);
System.out.println("The services chosen are");
if(b==1000)
{
System.out.println("AC");
}
else
{
System.out.println("non-AC");
}
if(c==0)
{
System.out.println("single cot");
}
else
{
System.out.println("double cot");
}
if(d!=0)
{
System.out.println("cable connection enabled");
}
else
{
System.out.println("cable connection not enabled");
}
if(e!=0)
{
System.out.println("wifi enabled");
}
else
{
System.out.println("wifi not enabled");
}
if(f!=0)
{
System.out.println("with laundry services");
}
else
{
System.out.println("without laundry services");
}
System.out.println("Do you want to proceed");
pr = s.next();
}while(pr.equals("no"));
if(pr.equals("yes")==true)
{
booked[i]=1;
System.out.println("Thank you for booking.Your room number is "+i);
//System.out.println("Do you want to continue");
//pro = s.next();
//if(pro.equals("yes")==true)
//{
//b.checkstatus();
//}
i=i+1;
}
}
public void checkstatus() {
// TODO Auto-generated method stub
int flag=0;
System.out.println("Check Status:");
System.out.println("Enter room number");
int r = s.nextInt();
for(int i=0;i<25;i++)
{
if(booked[i]==r)
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.printf("Room number %d is booked",r);
}
else
{
System.out.printf("Room number %d is not booked", r);
}
}
public void display() {
	// TODO Auto-generated method stub
	System.out.println("enter date");
	int date=s.nextInt();
	int end=s.nextInt();
	System.out.println("The bookings made from "+date+" to "+end+" are ");
	System.out.println(" Name   : "+(i-1));
	System.out.println("Room number :"+(i-1));
	
}
public void register() {
	
	System.out.println("Registration");
	System.out.println("Enter your Name");
	c[i]=s.next();
	System.out.println("Enter your Address");
	String add=s.next();
	System.out.println("Enter your Contact Number");
	String number=s.next();
	System.out.println("Enter your Email");
	String email=s.next();
	System.out.println("Enter your Prooftype");
	String proof=s.next();
	System.out.println("Enter your Proofid");
	String proofid=s.next();
	System.out.println("thanks"+i);
	i++;
}
public void display1() {
	// TODO Auto-generated method stub
	System.out.println(" id   : "+(i-1));
	
}
}


