class NoInputException extends Exception {
    public String toString () {
        return "NO INPUT COMMAND-LINE INPUT";
    }
}

public class que2 {
    public static void main (String args[]) {
        try {
            if (args.length == 0) {
                throw new NoInputException();
            }

            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            number1 += 2;
            number2 += 2;
            System.out.println(reverseString(args[number1]) + "\n" +
                    reverseString(args[number2]));

        } catch (ArrayIndexOutOfBoundsException ignored){
            System.out.println("Array Index Out of Bound");
        } catch (NumberFormatException ignored) {
            System.out.println("Less than two Numbers found");
        } catch (NoInputException e) {
            System.out.println(e);
        }
    }

    static String reverseString(String str) {
        String string = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            string = string + str.charAt(i);
        }
        return string;
    }
}
