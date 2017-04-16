package yzj.project;

public class TextClass {
	 String name;
	 int age;
	 int id;
	 public TextClass(){
	  System.out.println("one"); 
	 }
	 public void Test01(){
	  this.age =1;
	  this.name = "东";
	  System.out.println(name);
	 }
	 public static void main(String[] args){
	  
	  hehe a = new hehe();
	  a.run();
	 }

	}
	  class hehe extends TextClass{
	   public hehe(){
	    super();
	    System.out.println("two");
	   }
	   public void run(){
	    this.name ="王";
	    System.out.println(name);
	   }
	   
	 }
