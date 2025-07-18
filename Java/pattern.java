class pattern {
    public static void main(String[] args) {
        
        String s="abba";
        String s1="Shivani";
        System.out.println(isPalindrom(s));
        System.out.println(revString(s1));


    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n - i + 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }

        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static int isPalindrom(String s){
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1))
            return 0;
            }
            return 1;
    }

    static String revString(String s){
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
        rev = rev + s.charAt(i);
        return rev;
        
    }
}
