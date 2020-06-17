package runnable;

public class MainTwo {

    public static void main(String[] args) {
        System.out.println("2. main");
        // Tutaj wywołaj kolejne metody main
        main("1 String");
        main("String1", "String2");
        System.out.println(main(1));
        System.out.println(main(1, 2));
        int[] array ={1, 2, 3};
        for(int arrVal: main(array)) {
        System.out.println(arrVal);
        }
        
        
    }

    static void main(String args) {
        System.out.println(args);
    }

    private static void main(String arg1, String arg2) {
        System.out.println(arg1 + " " + arg2);

    }

    public static int main(int args) {
        return args;
    }

    static int main(int arg1, int arg2) {
        return arg1 + arg2;
    }

    private static int[] main(int[] args) {
        return args;
    }

}