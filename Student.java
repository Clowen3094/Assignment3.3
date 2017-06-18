
package Session3;

class Student{
 int mark1;int mark2;int mark3;

public float getPercentage(){  //method for calculating percentage
float percentage = (mark1+mark2+mark3)*100/300 ;
return percentage;
}

public int getTotal() {   //method for calculating total marks
int total = (mark1 +mark2+ mark3);
return total;
}


public static void main(String args[]){


Student A = new Student(); //creating a new Student 
A.mark1 = 43;
A.mark2 = 50;
A.mark3 = 37;
System.out.print("Student name :A");
System.out.print("  StudentPercentage :"+A.getPercentage());

System.out.print("  StudentTotal :"+A.getTotal());
System.out.println("");

Student B = new Student(); // //creating a new Student 
B.mark1 = 85;
B.mark2 = 99;
B.mark3 = 97;
System.out.print("Student name :B");
System.out.print("  StudentPercentage :"+B.getPercentage());

System.out.print("  StudentTotal :"+B.getTotal());
System.out.println("");

Student C = new Student();  //creating a new Student 
C.mark1 = 83;
C.mark2 = 39;
C.mark3 = 98;
System.out.print("Student name :C");
System.out.print("  StudentPercentage :"+C.getPercentage());

System.out.print("  StudentTotal :"+C.getTotal());


}
}


