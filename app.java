public class app {

    public static void twoPower(int power) {
        System.out.println("Two to the power of: " + power);

        int exponent = power;
        int temp = 1;

        for (int i = exponent; i != 0; i--) {
            temp = temp * 2;
        }

        System.out.println(temp);
    }

    public static int recursiveTwoPower(int power) {

        if (power == 0) {
            return 1;
        } else {
            return 2 * recursiveTwoPower(power - 1);
        }

    }

    public static int recursivePower(int base, int power) {

        if (power == 1) {
            return base;
        } else {
            return base * recursivePower(base, power - 1);
        }

    }

    public static void reverseString(String msg) {
        if (msg.length() > 0) {
            //printing the last character of the string
            System.out.println(msg.substring(msg.length() - 1));

            //end of the string
            reverseString(msg.substring(0, msg.length() - 1));

        }

    }

    public static boolean isPalindrome(String inString) {

        if (inString.length() <= 1) {
            return true;
        } else {
            if (inString.charAt(0) != inString.charAt(inString.length() - 1)) {
                return false;
            } else {
                return isPalindrome(inString.substring(1, inString.length() - 1));
            }

        }

    }

    public static void main(String[] args) {
        //twoPower(3);
        //System.out.println(recursiveTwoPower(3));
        //System.out.println(recursivePower(3,2));
        System.out.println("reverse of cat is: ");
        reverseString("cat");
        System.out.println("LEVEL: "+isPalindrome("level"));
        
    }

}
