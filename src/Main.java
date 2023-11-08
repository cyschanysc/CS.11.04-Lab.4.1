public class Main {
    public static boolean parenthesesCheck(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            } else if (str.charAt(i) == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }

    public static String reverseInteger(int num) {
        String numStr = String.valueOf(num);
        StringBuilder reversed = new StringBuilder();
        for (int i = numStr.length() - 1; i >= 0; i--) {
            reversed.append(numStr.charAt(i));
        }
        return reversed.toString();
    }

    public static String encryptThis(String message) {
        String[] words = message.split(" ");
        StringBuilder encrypted = new StringBuilder();
        for (String word : words) {
            if (encrypted.length() > 0) {
                encrypted.append(" ");
            }
            int length = word.length();
            if (length > 1) {
                char[] chars = word.toCharArray();
                char temp = chars[1];
                chars[1] = chars[length - 1];
                chars[length - 1] = temp;
                encrypted.append((int) chars[0]);
                encrypted.append(chars, 1, length - 1);
            } else {
                encrypted.append((int) word.charAt(0));
            }
        }
        return encrypted.toString();
    }

    public static String decipherThis(String message) {
        String[] words = message.split(" ");
        StringBuilder deciphered = new StringBuilder();
        for (String word : words) {
            if (deciphered.length() > 0) {
                deciphered.append(" ");
            }
            int length = word.length();
            if (length > 1) {
                char[] chars = word.toCharArray();
                char temp = chars[1];
                chars[1] = chars[length - 1];
                chars[length - 1] = temp;
                chars[0] = (char) chars[0];
                deciphered.append(chars);
            } else {
                deciphered.append((char) Integer.parseInt(word));
            }
        }
        return deciphered.toString();
    }


}