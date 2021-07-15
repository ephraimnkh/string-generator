public class StringGenerator {
    private static String[] lowercaseLetters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    private static String[] uppercaseLetters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
    private static String[] numbers = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
    private static String[] symbols = { "!", "@", "#", "$", "%", "^", "&", "*", "_", "?" };

    public static void main(String[] options) {
        // options layout -l -u -n 32
        // If no options show this
        if (options.length == 0) {
            System.out.println("Please provide options.\nYour choices:");
            System.out.println("Add -l or --lowercase to have a string that contains lowercase letters.");
            System.out.println("Add -u or --uppercase to have a string that contains uppercase letters.");
            System.out.println("Add -n or --numbers to have a string that contains numbers.");
            System.out.println("Add -s or --symbols to have a string that contains symbols.");
            System.out.println("You can add one, two or all of the options.");
            System.out.println("At the end add a number for how long you want the string to be.");
            System.out.println("Example: java StringGenerator -l -u -n -s 32.");
            System.out.println("Example: java StringGenerator --uppercase 8.");
            System.out.println("Example: java StringGenerator -u --numbers 14.");
            System.out.println("Example: java StringGenerator -l 8.");
            return;
        }
        // Options. Stored in string so .contains() can be used to see options given.
        String o = "";
        for (String option : options) {
            o += option;
        }

        int length = 0;
        // Ensure last option is a digit
        if (isADigitString(options[options.length - 1])) {
            length = Integer.parseInt(options[options.length - 1]);
        } else {
            System.out.println("Please enter a number at the end to specify how long the string should be");
        }

        // This will store the final text.
        String generatedText = "";

        // Option combinations
        if ((o.contains("-l") || o.contains("--lowercase")) && (o.contains("-u") || o.contains("--uppercase"))
                && (o.contains("-n") || o.contains("--numbers")) && (o.contains("-s") || o.contains("--symbols"))) {
            for (int i = 0; i < length; i++) {
                // Randomly choose 1 of the 4 arrays to add text to the end result String
                int array = (int) Math.ceil(Math.random() * 4);
                int characterIndex = 0;
                if (array == 1) {
                    // Pick random character from the lowercase array to add to the end result
                    // String
                    characterIndex = (int) Math.ceil(Math.random() * (lowercaseLetters.length - 1));
                    generatedText += lowercaseLetters[characterIndex];
                } else if (array == 2) {
                    // Pick random character from the uppercase array to add to the end result
                    // String
                    characterIndex = (int) Math.ceil(Math.random() * (uppercaseLetters.length - 1));
                    generatedText += uppercaseLetters[characterIndex];
                } else if (array == 3) {
                    // Pick random number from the numbers array to add to the end result String
                    characterIndex = (int) Math.ceil(Math.random() * (numbers.length - 1));
                    generatedText += numbers[characterIndex];
                } else if (array == 4) {
                    // Pick random symbol from the symbols array to add to the end result String
                    characterIndex = (int) Math.ceil(Math.random() * (symbols.length - 1));
                    generatedText += symbols[characterIndex];
                }
            }
        } else if ((o.contains("-l") || o.contains("--lowercase")) && (o.contains("-u") || o.contains("--uppercase"))
                && (o.contains("-n") || o.contains("--numbers"))) {
            for (int i = 0; i < length; i++) {
                // Randomly choose 1 of the 3 arrays to add text to the end result String
                int array = (int) Math.ceil(Math.random() * 3);
                int characterIndex = 0;
                if (array == 1) {
                    // Pick random character from the lowercase array to add to the end result
                    // String
                    characterIndex = (int) Math.ceil(Math.random() * (lowercaseLetters.length - 1));
                    generatedText += lowercaseLetters[characterIndex];
                } else if (array == 2) {
                    // Pick random character from the uppercase array to add to the end result
                    // String
                    characterIndex = (int) Math.ceil(Math.random() * (uppercaseLetters.length - 1));
                    generatedText += uppercaseLetters[characterIndex];
                } else if (array == 3) {
                    // Pick random number from the numbers array to add to the end result String
                    characterIndex = (int) Math.ceil(Math.random() * (numbers.length - 1));
                    generatedText += numbers[characterIndex];
                }
            }
        } else if ((o.contains("-l") || o.contains("--lowercase")) && (o.contains("-u") || o.contains("--uppercase"))
                && (o.contains("-s") || o.contains("--symbols"))) {
            for (int i = 0; i < length; i++) {
                // Randomly choose 1 of the 4 arrays to add text to the end result String
                int array = (int) Math.ceil(Math.random() * 3);
                int characterIndex = 0;
                if (array == 1) {
                    // Pick random character from the lowercase array to add to the end result
                    // String
                    characterIndex = (int) Math.ceil(Math.random() * (lowercaseLetters.length - 1));
                    generatedText += lowercaseLetters[characterIndex];
                } else if (array == 2) {
                    // Pick random character from the uppercase array to add to the end result
                    // String
                    characterIndex = (int) Math.ceil(Math.random() * (uppercaseLetters.length - 1));
                    generatedText += uppercaseLetters[characterIndex];
                } else if (array == 3) {
                    // Pick random symbol from the symbols array to add to the end result String
                    characterIndex = (int) Math.ceil(Math.random() * (symbols.length - 1));
                    generatedText += symbols[characterIndex];
                }
            }
        } else if ((o.contains("-u") || o.contains("--uppercase")) && (o.contains("-n") || o.contains("--numbers"))
                && (o.contains("-s") || o.contains("--symbols"))) {
            for (int i = 0; i < length; i++) {
                // Randomly choose 1 of the 4 arrays to add text to the end result String
                int array = (int) Math.ceil(Math.random() * 3);
                int characterIndex = 0;
                if (array == 1) {
                    // Pick random character from the uppercase array to add to the end result
                    // String
                    characterIndex = (int) Math.ceil(Math.random() * (uppercaseLetters.length - 1));
                    generatedText += uppercaseLetters[characterIndex];
                } else if (array == 2) {
                    // Pick random number from the numbers array to add to the end result String
                    characterIndex = (int) Math.ceil(Math.random() * (numbers.length - 1));
                    generatedText += numbers[characterIndex];
                } else if (array == 3) {
                    // Pick random symbol from the symbols array to add to the end result String
                    characterIndex = (int) Math.ceil(Math.random() * (symbols.length - 1));
                    generatedText += symbols[characterIndex];
                }
            }
        } else if ((o.contains("-l") || o.contains("--lowercase")) && (o.contains("-n") || o.contains("--numbers"))
                && (o.contains("-s") || o.contains("--symbols"))) {
            for (int i = 0; i < length; i++) {
                // Randomly choose 1 of the 4 arrays to add text to the end result String
                int array = (int) Math.ceil(Math.random() * 3);
                int characterIndex = 0;
                if (array == 1) {
                    // Pick random character from the lowercase array to add to the end result
                    // String
                    characterIndex = (int) Math.ceil(Math.random() * (lowercaseLetters.length - 1));
                    generatedText += lowercaseLetters[characterIndex];
                } else if (array == 2) {
                    // Pick random number from the numbers array to add to the end result String
                    characterIndex = (int) Math.ceil(Math.random() * (numbers.length - 1));
                    generatedText += numbers[characterIndex];
                } else if (array == 3) {
                    // Pick random symbol from the symbols array to add to the end result String
                    characterIndex = (int) Math.ceil(Math.random() * (symbols.length - 1));
                    generatedText += symbols[characterIndex];
                }
            }
        } else if ((o.contains("-l") || o.contains("--lowercase")) && (o.contains("-u") || o.contains("--uppercase"))) {
            for (int i = 0; i < length; i++) {
                int array = (int) Math.ceil(Math.random() * 2);
                int characterIndex = 0;
                if (array == 1) {
                    characterIndex = (int) Math.ceil(Math.random() * (lowercaseLetters.length - 1));
                    generatedText += lowercaseLetters[characterIndex];
                } else if (array == 2) {
                    characterIndex = (int) Math.ceil(Math.random() * (uppercaseLetters.length - 1));
                    generatedText += uppercaseLetters[characterIndex];
                }
            }
        } else if ((o.contains("-l") || o.contains("--lowercase")) && (o.contains("-n") || o.contains("--numbers"))) {
            for (int i = 0; i < length; i++) {
                int array = (int) Math.ceil(Math.random() * 2);
                int characterIndex = 0;
                if (array == 1) {
                    characterIndex = (int) Math.ceil(Math.random() * (lowercaseLetters.length - 1));
                    generatedText += lowercaseLetters[characterIndex];
                } else if (array == 2) {
                    characterIndex = (int) Math.ceil(Math.random() * (numbers.length - 1));
                    generatedText += numbers[characterIndex];
                }
            }
        } else if ((o.contains("-u") || o.contains("--uppercase")) && (o.contains("-n") || o.contains("--numbers"))) {
            for (int i = 0; i < length; i++) {
                int array = (int) Math.ceil(Math.random() * 2);
                int characterIndex = 0;
                if (array == 1) {
                    characterIndex = (int) Math.ceil(Math.random() * (uppercaseLetters.length - 1));
                    generatedText += uppercaseLetters[characterIndex];
                } else if (array == 2) {
                    characterIndex = (int) Math.ceil(Math.random() * (numbers.length - 1));
                    generatedText += numbers[characterIndex];
                }
            }
        } else if ((o.contains("-u") || o.contains("--uppercase")) && (o.contains("-s") || o.contains("--symbols"))) {
            for (int i = 0; i < length; i++) {
                int array = (int) Math.ceil(Math.random() * 2);
                int characterIndex = 0;
                if (array == 1) {
                    characterIndex = (int) Math.ceil(Math.random() * (uppercaseLetters.length - 1));
                    generatedText += uppercaseLetters[characterIndex];
                } else if (array == 2) {
                    characterIndex = (int) Math.ceil(Math.random() * (symbols.length - 1));
                    generatedText += symbols[characterIndex];
                }
            }
        } else if ((o.contains("-l") || o.contains("--lowercase")) && (o.contains("-s") || o.contains("--symbols"))) {
            for (int i = 0; i < length; i++) {
                int array = (int) Math.ceil(Math.random() * 2);
                int characterIndex = 0;
                if (array == 1) {
                    characterIndex = (int) Math.ceil(Math.random() * (lowercaseLetters.length - 1));
                    generatedText += lowercaseLetters[characterIndex];
                } else if (array == 2) {
                    characterIndex = (int) Math.ceil(Math.random() * (symbols.length - 1));
                    generatedText += symbols[characterIndex];
                }
            }
        } else if ((o.contains("-n") || o.contains("--numbers")) && (o.contains("-s") || o.contains("--symbols"))) {
            for (int i = 0; i < length; i++) {
                int array = (int) Math.ceil(Math.random() * 2);
                int characterIndex = 0;
                if (array == 1) {
                    characterIndex = (int) Math.ceil(Math.random() * (numbers.length - 1));
                    generatedText += numbers[characterIndex];
                } else if (array == 2) {
                    characterIndex = (int) Math.ceil(Math.random() * (symbols.length - 1));
                    generatedText += symbols[characterIndex];
                }
            }
        } else if (o.contains("-l") || o.contains("--lowercase")) {
            for (int i = 0; i < length; i++) {
                int characterIndex = (int) Math.ceil(Math.random() * (lowercaseLetters.length - 1));
                generatedText += lowercaseLetters[characterIndex];
            }
        } else if (o.contains("-u") || o.contains("--uppercase")) {
            for (int i = 0; i < length; i++) {
                int characterIndex = (int) Math.ceil(Math.random() * (uppercaseLetters.length - 1));
                generatedText += uppercaseLetters[characterIndex];
            }
        } else if (o.contains("-n") || o.contains("--numbers")) {
            for (int i = 0; i < length; i++) {
                int characterIndex = (int) Math.ceil(Math.random() * (numbers.length - 1));
                generatedText += numbers[characterIndex];
            }
        } else if (o.contains("-s") || o.contains("--symbols")) {
            for (int i = 0; i < length; i++) {
                int characterIndex = (int) Math.ceil(Math.random() * (symbols.length - 1));
                generatedText += symbols[characterIndex];
            }
        } else {
            System.out.println(
                    "No valid options!\nUse -l or --lowercase, -u or --uppercase, -n or --numbers.\nThese help you choose what you want the string to contain.");
            return;
        }
        System.out.println(generatedText);
    }

    public static boolean isADigitString(String text) // Checks if string entered is fully comprised of digits
    {
        int counter = 0;
        for (int i = 0; i < text.length(); i++)
            if (text.codePointAt(i) >= 48 && text.codePointAt(i) <= 57)
                counter++;
        if (counter == (int) text.length())
            return true;
        else
            return false;
    }
}