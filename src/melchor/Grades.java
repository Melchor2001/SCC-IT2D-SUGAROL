/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melchor;
public class Grades {

int id;
String name;
double p, m, pf, f;

public void addGrades(int sid, String sname, double sp, double sm, double spf, double sf) {
this.id = sid;
this.name = sname;
this.p = sp;
this.m = sm;
this.pf = spf;
this.f = sf;
}

public void viewGrades() {
// Correct the average calculation
double average = (this.p + this.m + this.pf + this.f) / 4;

// Correct the logic for remarks
String remarks = (average <= 3.0) ? "Passed" : "Failed";

// Correct the formatting string and fix syntax errors
System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
this.id, this.name, this.p, this.m, this.pf, this.f, average, remarks);
}
}
