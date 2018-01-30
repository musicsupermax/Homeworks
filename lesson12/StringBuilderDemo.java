package lesson12;

public class StringBuilderDemo {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(a).append(" + ").append(b).append(" = ")
                .append(a + b).append("\n");
        stringBuilder.append(a).append(" - ").append(b).append(" = ")
                .append(a - b).append("\n");
        stringBuilder.append(a).append(" * ").append(b).append(" = ")
                .append(a * b).append("\n");

        replaceString(stringBuilder);
        System.out.println(stringBuilder);
    }

    private static void replaceString(StringBuilder stringBuilder) {
        int pos1 = 0;
        while ((pos1 = stringBuilder.indexOf("=")) >= 0) {
            stringBuilder.replace(pos1, pos1 + 1, "равно");
        }
    }
}
