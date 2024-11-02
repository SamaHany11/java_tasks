package sama_tasks;
import java.util.Scanner;


public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student student=new Student();
        student.setid(1);
        student.setname("sama");
        student.setage(19);
       System.out.println("Student id: "+student.getid());
       System.out.println("Student name: "+student.getname());
       System.out.println("Student age: "+student.getage());
       //--------------------------------------------------------------------
       System.out.println("---------------------------------------------");
       Employee emp=new Employee();
       emp.setname("aser");
       emp.setno(10);
       if(emp.getname().length()>5) {
    	   System.out.println("please enter name with size > 5");
       }
       else {
    	 
           System.out.println("Employee name: "+emp.getname());
       }
       if(emp.getno()<0) {
    	   System.out.println("please enter number greater than 0");
       }
       else {
    	   System.out.println("Employee no: "+emp.getno());
       }
       //--------------------------------------------------------------------
       System.out.println("---------------------------------------------");
       System.out.println("enter 2 numbers");
       int n1=in.nextInt();
       int n2=in.nextInt();
       student.sum(n1, n2);
       //---------------------------------------------------------------------
      System.out.println("---------------------------------------------");
       perrson person=new perrson();
       person.setid(3);
       person.setname("aysel");
       System.out.println("person id: "+person.getid());
       System.out.println("person name: "+person.getname());
     //---------------------------------------------------------------------
       System.out.println("---------------------------------------------");
       linkedin link= new linkedin(4,"linkedin","image");
       link.print();
       System.out.println("---------------------------------------------");
       facebook fff= new facebook(5,"facebook","image");
       fff.print();
       System.out.println("---------------------------------------------");
}
}