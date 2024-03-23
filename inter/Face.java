


package inter;

import java.io.*;

/*
interface A{
 int age = 20;
	void show();
	void disp();
}
 class As implements A{

	
	public void show() {
		System.out.println("in show");
	}
	public void disp() {
System.out.println("in disp");
	}
}
public class Face {

	public static void main(String[] args) {
		A obj=new As();
obj.show();
obj.disp();
System.out.println(As.age);
	}}*/

 /*

interface A{
	void show();
}
interface 	B{
	void disp();
}
class c{
	void play() {
		System.out.println("playing");
	}
}
	class aq extends c implements A,B{
	public void show() {
		System.out.println("in show");	
	}
	public void disp() {
		System.out.println("in disp");
	}
	}
	public class Face {
	public static void main(String[] args) {
	aq obj=new aq();
	obj.disp();
	obj.show();
	obj.play();
	
	}} */
//functional interface
/*
interface A{
	void show();
	void display();	
}

public class Face {// ananymousinner class

	public static void main(String[] args) {
		A obj=new A()
		{
			public void show(){
			System.out.println("showing");
		}
				public void display() {
			System.out.println("in showing");
				}
				};
		obj.display();
		obj.show();
	}
}  */
//lamda method 
/*
interface A{
	
	 int add(int a, int b);		

	
}
public class Face {

	public static void main(String[] args) {
		A obj= ( a, b)-> a+b;
			
				
		int res=obj.add(5,6);
		System.out.println(res);
	
	}}	*/
/*
//marker interface
interface permission
{
	
}
class Mark implements permission {
	void diplay() {
		System.out.println("in displaying");
	}
}
public class Face {

	public static void main(String[] args) {
		Mark ob=new Mark();
		if(ob instanceof permission)
			ob.diplay();
		else
		{
			System.out.println("no access");
		}
		
	}}	*/
		
	//serializable	
	/*	
class save implements Serializable
{
	int i;
}
public class Face {
public static void main(String[] args) throws Exception {
save obj=new save();
obj.i=10;
//System.out.println(obj.i);

File f=new File("myfile.txt");
FileOutputStream fos=new FileOutputStream(f);
ObjectOutputStream oss=new ObjectOutputStream(fos);
oss.writeObject(obj);

FileInputStream fis=new FileInputStream(f);
ObjectInputStream ois=new ObjectInputStream(fis);
save objj=(save) ois.readObject();
System.out.println(objj.i);
}}
*/

//default method interface//
/*
interface As{
	 default void show() {
		System.out.println("in showing");
	}
	
}
class Ss implements As
{
public class Face {
public static void main(String[] args) {
	Ss obj=new Ss();
	obj.show();
}}
}    */
///static method//
/*
interface As{
	 static void show() {
		System.out.println("in showing");
	}
	 static void disp() {
		 System.out.println("in displaying");
	 }
}
public class Face {
public static void main(String[] args) {
	As.show();
	As.disp();
}}*/



















	