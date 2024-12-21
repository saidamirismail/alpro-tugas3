public class PatternGenerator {
    public static void main(String[] args) {
        // Output 1
        System.out.println("Output 1:");
        generateStarPattern(5);

        // Output 2
        System.out.println("Output 2:");
        generateNumberPattern(5);
    }

    // Function to generate star pattern
    static void generateStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Function to generate number pattern
    static void generateNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
