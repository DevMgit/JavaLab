class StringTest {
    public static void main(String[] args) {
        String s = "Java Programming";
        System.out.println(s);
        System.out.println("String Length: " + s.length());
        System.out.println("Char at 3: " + s.charAt(3));
        System.out.println("Substring from 2 to 5: " + s.substring(2, 5));
        String s1 = "Java";
        String s2 = " Programming";
        System.out.println("Concatenated String: " + s1.concat(s2));
        String s3 = "Learn code Learn";
        System.out.println("Index of 'code': " + s3.indexOf("Learn"));
        System.out.println("Last index of a= " + s3.lastIndexOf('a', 3));
        boolean out = "Java".equals("java");

        System.out.println("Checking Equality: " + out);
        out = "Java".equals("Java");

        System.out.println("Checking Equality: " + out);
        out = "Java".equalsIgnoreCase("jAvA");
        System.out.println("Checking Equality: " + out);
        int out1 = s1.compareTo(s2);
        System.out.println("Differentiate between Ascii Values: " + out1);
        String word1 = "JavaProgramming";
        System.out.println("Uppercase: " + word1.toUpperCase());
        System.out.println("Lowercase: " + word1.toLowerCase());
        String str1 = "frogramming";
        System.out.println("Original String: " + str1);
        System.out.println("Replaced f with p: " + str1.replace('f', 'p'));
    }
}