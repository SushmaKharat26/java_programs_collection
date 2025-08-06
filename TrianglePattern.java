// TrianglePattern.java
// Java program to print a symmetrical triangle number pattern

public class TrianglePattern {
    public static void main(String[] args) {
        // Upper triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }

        // Lower inverted triangle
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}

/*
Output:
1
12
123
1234
12345
1234
123
12
1
*/
