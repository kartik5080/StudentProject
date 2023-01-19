/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/**
 *
 * @author Asus
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // store details of 3 students.
        Student[] list=new Student[3];
        Student student1= new Student();
        {
        student1.setName("kartik");
        student1.setId(567);
//            System.out.println( student1.getId());
//            System.out.println(student1.getName());
        }
        Student student2 = new Student();
        {
            student2.setId(678);
            student2.setName("peter");
//             System.out.println( student2.getId());
//             System.out.println(student2.getName());
        }
        Student student3 = new Student();
        {
            student3.setId(453);
            student3.setName("tarun");
//            System.out.println( student3.getId());
//            System.out.println(student3.getName());
        }
        //storing object in array named list
        list[0]=student1;
        list[1]=student2;
        list[2]=student3;
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName()+" "+list[i].getId());
        }
    }
    
}
