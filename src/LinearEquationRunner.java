import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String []args){
        System.out.println("Welcome");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in a coordinate pair in this form: (x, y)");
        String coor1 = input.nextLine();
        int comma = coor1.indexOf(",");
        String str1 = coor1.substring(1, comma);
        String str2 = coor1.substring(comma +1, (coor1.length() - 1));
        int x1 = Integer.parseInt(str1);
        int y1 = Integer.parseInt(str2);
        System.out.println("Please enter in another coordinate pair in this form: (x, y)");
        String coor2 = input.nextLine();
        int comma2 = coor2.indexOf(",");
        String str3 = coor2.substring(1, comma2);
        String str4 = coor2.substring(comma2 +1, (coor2.length() - 1));
        int x2 = Integer.parseInt(str3);
        int y2 = Integer.parseInt(str4);

        if(x1 == x2){
            System.out.println("This is a vertical line");
            System.exit(0);
        }
        LinearEquation equation1 = new LinearEquation(x1, y1, x2, y2);
        System.out.println(equation1.lineInfo());
        System.out.println("enter a value for x ");
        String coolx = input.nextLine();
        System.out.println(equation1.coordinateForX(coolx));



    }
}
