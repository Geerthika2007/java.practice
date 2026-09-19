class Palindrome{
    public static void main(String args[]){

        String str = "madam";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversed = sb.toString();
        if (str.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }


}