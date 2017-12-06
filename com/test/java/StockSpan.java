/**
 * The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate span of stock’s price for all n days.
 The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day.
 For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}
 */

package com.test.java;

public class StockSpan {

    private int[] inputArray;

    public StockSpan(int[] array) {
        this.inputArray = array;
    }

    public void getSpan() {
        for(int i=0; i<inputArray.length; i++) {
            int span = 0;
            int j = i;
            while(j >= 0 && inputArray[i] >= inputArray[j]) {
                span = span + 1;
                j--;
            }
            System.out.print(span + ",");
        }
    }

    public void getSpanWithStack() {
        int[] spanArr = new int[inputArray.length];
        Stack s = new Stack(inputArray.length);
        s.push(0);
        spanArr[0] = 1;
        for(int i=1; i<inputArray.length; i++) {
            while(!s.isEmpty() && inputArray[i] > inputArray[s.peek()]) {
                int tmp = inputArray[s.peek()];
                s.pop();
            }
            if(s.isEmpty()) {
                spanArr[i] = i + 1;
            } else {
                spanArr[i] = i-s.peek();
            }
            s.push(i);
        }

        for(int z=0; z<spanArr.length; z++) {
            System.out.print(spanArr[z]);
            System.out.print(",");
        }
    }

    public static void main(String[] args) {
        int[] input = {100, 80, 60, 70, 60, 75, 85};
//        int[] input = {10, 4, 5, 90, 120, 80};
        StockSpan ss = new StockSpan(input);
        ss.getSpan();
        System.out.println("   ");
        ss.getSpanWithStack();
    }
}
