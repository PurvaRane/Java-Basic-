import java.util.Scanner;

class Grades {
    char grade;
    public void calculatorGrade(float percentile) {
   if(percentile>=70 ){
    grade = 'A';

   }
   else if (percentile>=60){
    grade = 'B';

   }
   else if (percentile>=50 ){
    grade = 'C';
   }        
   else {
    grade = '0';
   }

    }

    public Grades() {

    }
    public Grades(char grade){
        this.grade = grade;
    }
    public char getGrade(){
        return grade;
    }
    public void setGrade(char grade){
        this.grade = grade;
    }
}
class CountGrade{
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 float percentile = sc.nextFloat();
    }
}