import java.util.*;

class Solution {
    public int countNegatives(int[][] grid) {
        int output = 0;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                if (grid[i][j] >= 0)
                    break;
                output++;
            }
        }
        return output;
    }

    public int maxEvents(int[][] events) {

        int max = 0;
        int[][] array = new int[events.length][];
        for (int i = 0; i < events.length; i++) {
            if (events[i][1] > max)
                max = events[i][1];
        }
        // 初始化矩阵
        for (int i = 0; i < events.length; i++) {
            array[i] = new int[max];
            for (int j = 0; j < max; j++) {
                if (j >= events[i][0] && j <= events[i][1])
                    array[i][j] = i;
            }
        }
        for (int j = 0; j < max; j++) {
            for (int i = 0; i < max; i++) {
                // if(array[i][j]!=0)

            }
        }
        return 0;
    }

    public boolean isPossible(int[] target) {
        int count = 0;
        if(count>target.length)
            return false;
        int max = 1;
        int index = 0;
        for (int i = 0; i < target.length; i++) {
            if (target[i] > max) {
                max = target[i];
                index = i;
            }
        }
        if (max == 1)
            return true;
        else {
            for (int i = 0; i < target.length; i++)
                if (i != index)
                    max -= target[i];
            if (max < 1)
                return false;
            else {
                target[index] = max;
                count++;
                return isPossible(target);
            }
        }
    }
}

class ProductOfNumbers {

    private List<Integer> array = new ArrayList<Integer>();

    public ProductOfNumbers() {

    }

    public void add(int num) {
        array.add(num);
    }

    public int getProduct(int k) {
        int output = 1;
        for (int i = k; i > 0; i--) {
            output *= array.get(array.size() - 1 - k + i);
        }
        return output;
    }
}

public class Weekly_Contest_176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

        }
        sc.close();
    }
}