class college{ 
     void col(){
         String college= "JEC";
      System.out.println( "\nCollege: " + college );
     }
 }
class Student extends college{
         void stu(int id,String name){
      System.out.println("Name: " + name + "\n ID: " + id );
    
     }
}
 
 class Main3{
   public static void main(String [] args){
     Student sc= new Student();
    sc.col(); 
    sc.stu(111,"Ajay");
    sc.col();
    sc.stu(222,"Anmol");
    
}
} 