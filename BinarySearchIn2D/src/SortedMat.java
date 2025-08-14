import java.util.Arrays;

public class SortedMat {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(searchMatrix(arr, 9));
    }

    // search in the row provided between the cols provided
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rowIdx = searchForPotentialRow(matrix, target);
        if (rowIdx != -1) {
            return binarySearchInRow(rowIdx, matrix, target);
        } else {
            return false;
        }
    }

    public static int searchForPotentialRow(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[mid][0] <= target && target <= matrix[mid][matrix[0].length - 1]) {
                return mid;
            } else if (matrix[mid][0] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static boolean binarySearchInRow(int rowIdx, int[][] matrix, int target) {
        int low = 0;
        int high = matrix[rowIdx].length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[rowIdx][mid] == target) {
                return true;
            } else if (matrix[rowIdx][mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}