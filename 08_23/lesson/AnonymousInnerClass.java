//package jp02.part05;

class A{

  ///Field
  ///Constructor
  ///Method
  public void abc(String message){
	  System.out.println("::"+this.getClass().getName()+"start..");
	  System.out.println("::abc() "+message);
      System.out.println("::"+this.getClass().getName()+"end..");
  }
}//end of class

public class AnonymousInnerClass{

   ///Main Method
   public static void main(String[] args){
	   
	   System.out.println("1.=========================");
	   A a = new A();
	   a.abc("Hello");

       System.out.println("2.=========================");
	   new A().abc("Hello");
	   
	   /*==== 아래 코드 이해=====
	    public class B extends A{
			public void def(String message){
				System.out.println("::Hi"+message);
        }
      }
        new B().abc("Hello");
		new B().def("Hello");
		==================================*/

		System.out.println("3.=========================");
	   new A(){
		   public void def(String message){
			   System.out.println("::"+this.getClass().getName()+"start..");
	           System.out.println("::def() "+message);
               System.out.println("::"+this.getClass().getName()+"end..");
		   }
	   }.abc("Hello");

	   System.out.println("4.=========================");
	   new A(){
		   public void def(String message){
			   System.out.println("::"+this.getClass().getName()+"start..");
	           System.out.println("::def() "+message);
               System.out.println("::"+this.getClass().getName()+"end..");
		   }
	   }.def("Hello");
   }

}//end of class
