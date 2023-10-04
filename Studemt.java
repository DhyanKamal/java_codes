class Student{  
    int id;  
    String name; 
    String branch; 
    //creating a parameterized constructor  
    Student(int i,String n,String b){  
    id = i;  
    name = n;  
    branch= b;
    }  
    //method to display the values  
    void display(){System.out.println("The ID is: " + i + "\n Name: " + name + "\n Branch: " + branch );}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Student s1 = new Student(111,"Karan");  
    Student s2 = new Student4(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }