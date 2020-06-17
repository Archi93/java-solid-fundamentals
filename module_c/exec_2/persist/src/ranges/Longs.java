package ranges;

public class Longs {

    public static void main(String[] args) {

        System.out.printf("| %32s | %32s |\n", "Wartości dodatnie", "Wartości ujemne");
        showValue(0);
        showValue(1);
        showValue(1*2);
        showValue(1*2*2);
        showValue(1*2*2*2);
        showValue(1*2*2*2*2);
        showValue(1*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2 - 1);
        showValue(1*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2);
    }

    public static void showValue(int value) {
        System.out.println("|--------------------------------------------------------------------|");
        System.out.printf("| %32d | %32d | (dziesiętnie)\n", value, -value);
        System.out.printf("| %32s | %32s | (binarnie)\n", fillZeros(Integer.toBinaryString(value), 32), Integer.toBinaryString(-value));
        System.out.printf("| %32s | %32s | (ósemkowo)\n", fillZeros(Integer.toOctalString(value), 11), Integer.toOctalString(-value));
        System.out.printf("| %32s | %32s | (szesnastkowo)\n", fillZeros(Integer.toHexString(value), 8), Integer.toHexString(-value));
    }

    public static String fillZeros(String value, int size) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size - value.length(); i++) {
            builder.append("0");
        }
        builder.append(value);
        return builder.toString();

    }
}