package MainPackage.JavaBasics.array;

 public class ArrayStringMatrix {
    public static void main(String[] args) {
    String[][] x = {{"aa", "ab"}, {"ac", "ad"}};
    for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < x.length; j++) {
            System.out.print(x[i][j] + " ");
        }
        System.out.println("");
    }
}
}

