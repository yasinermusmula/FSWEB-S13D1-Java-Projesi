import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(shouldWakeUp(true,17));
        System.out.println(hasTeen(15,26,32));
        System.out.println(isCatPlaying(true,20));
        System.out.println(area());
        System.out.println(areaRectangle());

    }

    public static boolean shouldWakeUp(boolean dogIsBark, int barkTime) {
        if (!dogIsBark){
            return false;
        }
        else if ((barkTime > 20 && barkTime < 24) || (barkTime > 0 && barkTime < 8)){
            return  true;
        } else if (barkTime > 24 || barkTime < 0) {
            return  false;
        }
        return  false;
    }


    public static boolean hasTeen(int num1,int num2, int num3) {
        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer,int temp) {
        if (!isSummer && (temp >= 25 && temp <= 35)){
            return  true ;
        }
        else return isSummer && (temp >= 25 && temp <= 45);
    }


    public static double area() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter short edge: ");
        double shortEdge =input.nextDouble();
        System.out.print("Enter long edge: ");
        double longEdge = input.nextDouble();

        if (shortEdge < 0 || longEdge <0){
            return -1;
        }
        else {
            return shortEdge * longEdge;
        }
    }

    public static double areaRectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        if (radius <0){
            return  -1;
        }
        return  radius * radius * Math.PI;
    }
}