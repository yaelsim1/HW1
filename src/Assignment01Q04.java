import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        // TODO: implement
        if (direction != 'L' && direction != 'R') {
            return array;
        }
        int n = array.length;
        if (n == 0 || n == 1) {
            return array;
        }
        move = move % n;
        if (move == 0) {
            return array;
        }
        if (direction == 'L') {
            move = - move;
        }
        if (move < 0) {
            move = (n + move) % n;
        }

        int start = 0;
        int count = 0; 
        while (count < n) {
            int curr = start;
            int temp = array[start];
            int prev = (curr - move + n) % n;
            while (prev != start) {
                array[curr] = array[prev];
                curr = prev;
                prev = (curr - move + n) % n;
                count++;
            }
            array[curr] = temp;
            count++;
            start++;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}