public class multidimentional {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        for(int row = 0; row<a.length; row++){
            for(int col = 0; col< a[row].length; col++){
                System.out.println(a[row][col]);
            }
        }
    }
}
