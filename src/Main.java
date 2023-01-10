import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter width");
        double width=Double.parseDouble(s.nextLine());
        System.out.println("enter height");
        double height=Double.parseDouble(s.nextLine());
        Rectangle object=new Rectangle(width,height);
        System.out.println(object.display());
    }
}