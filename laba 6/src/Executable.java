public class Executable {
    public static void main(String[] args) {
        int x, y;

        show("For numbers:");
        x = 6;
        y = 7;
        show(getMaxInt(x, y));
        show(generifiedComparingFunc(x, y));

        show("-----------------------------------------");
        show("Different Strings:");
        String str1 = "String to compare number 1";
        String str2 = "String to compare number 2";
        show(getMaxString(str1, str2));
        show(generifiedComparingFunc(str1, str2));

        show("\nEqual Strings");
        str1 = "String to compare number 1";
        str2 = "String to compare number 1";
        show(getMaxString(str1, str2));
        show(generifiedComparingFunc(str1, str2));
    }

    private static <T> void show(T output) {
        System.out.println(output.toString());
    }

    private static int getMaxInt(int x, int y) {
        show("Used function specialised for int comparison");
        return Math.max(x, y);
    }

    private static String getMaxString(String x, String y) {
        show("Used function specialised for comparing strings according to UNICODEs of characters");
        if (x.compareTo(y) > 0)
            return x;
        else if(x.compareTo(y) < 0)
            return y;
        return "String are equal";
    }

    private static <T extends Comparable<T>> T generifiedComparingFunc(T x, T y) {
        show("Used function with generics, which works for any object implementing comparable interface ");
        if(x.compareTo(y) > 0)
            return x;
        else if(x.compareTo(y) < 0)
            return y;
        return (T)"Objects are equal";
    }
}