//Section 7, Lesson 3 Starter for Exercise 1 - Slide 6
import java.util.*;
public class PrisonTest_Student_7_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prisoner_Student_7_3 ps = new Prisoner_Student_7_3();
        Prisoner_Student_7_3 ps1 = new Prisoner_Student_7_3();

        System.out.println("Please enter the prisoners name");
        ps.name = sc.nextLine();
        System.out.println("Height (in inches)");
        ps.height = sc.nextDouble();
        System.out.println("Sentence (in years)");
        ps.sentence = sc.nextInt();
        System.out.println("Prisoner " + ps.name + " at a height of "  + ps.height + " inches and has a sentence of "+ ps.sentence);
    }
}
