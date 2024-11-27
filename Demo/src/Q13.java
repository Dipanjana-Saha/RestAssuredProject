
public class Q13 {
    // Question 13: Write a Java Program to generate Output "aabbbcccc" with the input "a2b3c4"

    public static void main(String[] args) {
        String input = "a2b3c4";
        String r = prog(input);
        System.out.println(r);  // Expected output: "aabbbcccc"
    }

    public static String prog(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < c.length; i = i + 2) {
            int c1 = Integer.parseInt(String.valueOf(c[i]));  // or Character.getNumericValue(c[i])
            for (int j = 0; j < c1; j++) {
                sb.append(c[i - 1]);
            }
        }

        return sb.toString();  // This return statement is reachable
    }
}
