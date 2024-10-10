import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int A = in.nextInt(), B = in.nextInt(), C = in.nextInt();
        boolean b = true;
        int max = 0;
        if ((A>B) && (A>C))
            max = A;
        else if (B>C)
            max = B;
        else max = C;
        if ((((A + B) <= C) || ((A + C) <= B) || ((B + C) <= A)) == b)
            out.print("треугольник составить невозможно");
        else
            if (((A == B) & (A == C)) == b)
                out.print("треугольник равносторонний");
            else if (Math.sqrt(A*A+B*B+C*C-max*max) == max)
                    out.print("треугольник прямоугольный");
            else if (((A != B) & (A != C) & (C != B)) == b)
                        out.print("треугольник разносторонний");
            else
                out.print("треугольник равнобедренный");
    }
}