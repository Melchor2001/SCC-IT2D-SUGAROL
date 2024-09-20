package melchor;
import java.util.Scanner;
public class Grade {
    int id;
    String name;
    double p, m, pf, f;
    public void grade(){
        Grades[] gr1 = new Grades[100];
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int num=input.nextInt();
        for(int x=0; x<num; x++){
            System.out.print("Enter Student ID: ");
            id=input.nextInt();
            System.out.print("Enter Student Name: ");
            name=input.next();
            System.out.print("Enter Prelim Grade: ");
            p=input.nextDouble();
            System.out.print("Enter Midterm Grade: ");
            m=input.nextDouble();
            System.out.print("Enter Pre-Fi Grade: ");
            pf=input.nextDouble();
            System.out.print("Enter Final Grade: ");
            f=input.nextDouble();
            gr1[x]=new Grades();
            gr1[x].addGrades(id, name, p, m, pf, pf);
        }
        for(int x=0; x<num; x++){
            gr1[x].viewGrades();
        }
        
    }
}
