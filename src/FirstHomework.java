public class FirstHomework {
    public static void main(String[] args) {

        // 1. count characters in java
        String s = "Hello";
        char[] counts = s.toCharArray();
        int count = counts.length;
        System.out.println("The  siring has " + count + " characters.");

        //2.
        for (int i = 0; i < counts.length; i++){
            System.out.println(counts[i]);
        }

        //3.
        String sss = s + s + s;
        System.out.println(sss);

    }
}
