package MainPackage.JavaBasics.array;

public class  ArrayCharMatrix {
    public static void main(String[] args) {
    char[][] x= {{'a','b'}, {'c','d'}};
    {
        for (int i=0; i< x.length; i++){
            for (int j = 0 ; j< x.length; j++){
                System.out.print(x[i][j] + " ");
            }
           System.out.println(" ");
        }
    }

}
}

