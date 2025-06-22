import java.util.*;
public class AreaCircle {
    public static void main(String[] args){
        float area,radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        radius=sc.nextFloat();
        area=3.14f*radius*radius;
        System.out.println("Area of circle is: "+area);
        sc.close();

    }
    
}
