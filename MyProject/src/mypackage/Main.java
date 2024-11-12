package mypackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
    int sum = 0;

    for (int number : numbers) {
      sum += number;
    }
    System.out.println("配列内の数値の合計: " + sum);
  }
}