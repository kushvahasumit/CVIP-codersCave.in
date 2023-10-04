
import java.util.Scanner;


public class bmicalc {

    public static void main(String[] args) {
        System.out.println(" *** BMI Claculator in JAVA *** ");
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Your Weight in kg :: ");
        float weight = sc.nextFloat();
        System.out.print(" Enter Your Height in cm :: ");
        float height = sc.nextFloat();
        
        myBmi(weight, height);
    }

    public static void myBmi(float weight, float height) {
        float Bmi = (weight) / (height * height);
        System.out.println("\n");
        if (Bmi < 18.5) {
            System.out.println(" ** You are Underweight ! **");
        } else if (Bmi < 25) {
            System.out.println(" ** You are Normal ! **");
        } else if (Bmi < 30) {
            System.out.println(" ** You are Overweight ! **");
        } else {
            System.out.println(" ** You are Obese ! **");
        }

        
        System.out.println(" Your BMI value is :: " + Bmi);
        
         System.out.println("\n");
          if (Bmi < 18.5) {
            System.out.println(" **  Try to snack on healthy, high energy foods like cheese, nuts, milk-based smoothies and dried fruit ! **");
        } else if (Bmi < 25) {
            System.out.println(" ** Healthy eating, physical activity, optimal sleep, and stress reduction ! **");
        } else if (Bmi < 30) {
            System.out.println(" ** Even small amounts of daily physical activity can help you stay healthy ! **");
        } else {
            System.out.println(" ** Eat slowly and avoid situations where you know you could be tempted to overeat ! **");
        }

        
    }

}