package soquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SlidingPuzzle {

    public static void main(String[] args) {

        int[][][] fixed_tests = {
                {{4,1,3},{2,8,0},{7,6,5}},
                {{8,2,1},{3,7,0},{4,6,5}},
                {{1,5,2},{7,0,8},{6,4,3}},
                {{10,3,6,4},{1,5,8,0},{2,13,7,15},{14,9,12,11}},
                {{15,1,3,4},{9,5,6,8},{13,7,14,11},{10,2,0,12}},
                {{3,9,11,7},{1,12,13,4},{8,2,14,0},{6,10,15,5}},
                {{22,1,10,9,4},{11,8,2,5,18},{16,6,12,19,14},{7,23,21,15,24},{3,13,0,17,20}},
                {{1,6,2,9,0},{23,8,3,10,18},{11,22,24,15,12},{21,14,16,4,5},{17,13,19,20,7}},
                {{2,7,10,3,9},{6,17,5,1,14},{11,12,8,24,13},{4,21,23,15,0},{22,16,19,20,18}},
                {{2,7,9,5,27,12},{25,11,15,6,18,4},{8,26,1,14,3,28},{21,20,10,30,17,29},{19,13,33,22,0,23},{32,34,31,24,16,35}},
                {{6,20,4,24,12,2},{1,7,10,5,14,16},{13,3,9,17,15,23},{19,11,27,21,34,28},{25,26,8,35,18,0},{31,32,33,30,22,29}},
                {{7,14,26,10,8,18},{9,1,2,12,6,29},{31,0,5,16,3,4},{13,21,15,24,25,35},{19,28,34,17,11,22},{32,27,20,33,30,23}}
        };

        for (int[][] p: fixed_tests) slidingPuzzle(p);
    }

    public static int[][] slidingPuzzle(int[][] puzzle) {

        int[][] newPuzzle = new int[puzzle.length][puzzle.length];

        for (int i =0;i<puzzle.length;i++)
        {
            solve(puzzle[i]);
        }
        return puzzle;

    }

    public static List<Integer> solve(int[] ints) {
        // your code here!
        List<Integer> sortedList = Arrays.stream(ints).boxed().collect(Collectors.toList());
        Collections.sort(sortedList);

        return sortedList;
    }
}
