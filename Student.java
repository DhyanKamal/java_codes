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
    void display(){System.out.println("The ID is: " + id + "\n Name: " + name + "\n Branch: " + branch );}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Student s1 = new Student(111,"Dhyan","CSE");  
    Student s2 = new Student(222,"Ajay","Mechanical");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }
}