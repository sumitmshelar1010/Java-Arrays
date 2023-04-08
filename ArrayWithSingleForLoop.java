package MainPackage.JavaBasics.array;

public class ArrayWithSingleForLoop {
    public static void main (String[] args){
        int[] A =  {1,2,3,4,5};
        System.out.println(A.length);
        for (int i = 0; i<A.length; i++)
        {
            System.out.println(A[i]);
        }
    }
}

