import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, height, baseArea, surfaceArea, volume;
        System.out.print("Enter the radius : ");
        radius = sc.nextDouble();
        System.out.print("Enter the height : ");
        height = sc.nextDouble();
        sc.close();

        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height;

        System.out.printf("baseArea is : %.2f%n ", baseArea);
        System.out.printf("surfaceArea is : %.2f%n ", surfaceArea);
        System.out.printf("Volume is : %.2f%n ", volume);
    }
}
