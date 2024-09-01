import java.util.Scanner;

public class studentgradecalculator {
    public static void main(String[] args) {

        int n=5;//n is total no. of subjects


        Scanner sc = new Scanner (System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter your Marks:");

        // marks always assign less than 100 in each subjects
        System.out.print("Math = ");
        int marks_of_Math = sc.nextInt();
        System.out.print("English = ");
        int marks_of_English = sc.nextInt();
        System.out.print("Physics = ");
        int marks_of_Physics = sc.nextInt();
        System.out.print("Chemistry = ");
        int marks_of_Chemistry = sc.nextInt();
        System.out.print("Biology = ");
        int marks_of_Biology = sc.nextInt();
        sc.close();

            // calculate the sum of all subjects
        int sum = marks_of_Math+marks_of_English+marks_of_Physics+marks_of_Chemistry+marks_of_Biology;
        System.out.println("Total sum = " + sum + "/500");
        System.out.println();
            // calculaate the percentage
        int percentage = (sum/n);
        System.out.println( "percentage is = "+ percentage);
        System.out.println();

            //Grade
        if (percentage>=80 && percentage<=100){
            System.out.println("Grade is A");
        } else if (percentage < 80 && percentage >= 60) {
            System.out.println("Grade is B");
        } else if (percentage <60 && percentage >=30) {
            System.out.println("Grade is C");
        } else {
            System.out.println("Grade is D");
        }


    }
}