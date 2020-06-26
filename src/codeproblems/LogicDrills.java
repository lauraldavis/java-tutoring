package codeproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogicDrills {
    public static void main(String[] args) {
//        Test
//        System.out.println(sum(3,3)); // #1
//        findMinMax(12,4,99); // #2
//        System.out.println(isIntEqual(4, 4)); // #3
//        printColon(); // #4
//        isEvenOrOdd(5); // #5
//        printPrimeNumbers(50); // #6
//        int[] inputArray = new int[] {1,4,6,9,15,4,33}; // #7
//        System.out.println(duplicateInt(inputArray));   // #7
//        int[] intSeqArray = new int[] {1,2,3,4,5,6,7,8,9}; // #8
//        System.out.println(findMissingInt(intSeqArray));   // #8 Charlie's solution
//        System.out.println(findMissing(intSeqArray));      // #8 Brance's solution


//        System.out.println(removeCharacter("The quick brown fox jumped over the lazy dog.", 'f')); // #9 my initial solution
//        System.out.println(removeCharFromString("The quick brown fox jumped over the lazy dog.", 'f')); // #9 refactored

    }


//    https://medium.com/@codingfreak/top-25-programming-puzzles-and-brain-teasers-dac17b41e94a

//    1. Add two numbers without using addition operator
    private static int sum(int x, int y) {
        return x - (-1 * y);
    }

//    2. Find maximum, minimum of three numbers without using conditional statement and/or ternary operator
    private static void findMinMax(int n1, int n2, int n3) {
        List<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(n1);
        myNumbers.add(n2);
        myNumbers.add(n3);
        Collections.sort(myNumbers);
        System.out.println("The max is: " + myNumbers.get(2) + ", the min is: " + myNumbers.get(0));
    }

//    3. Determine if two integers are equal without using comparison and arithmetic operators
    private static boolean isIntEqual(int n1, int n2) {
        return Integer.toString(n1).equals(Integer.toString(n2));
    }

//    4. Print a colon without using a colon anywhere in the program
    private static void printColon(){
        char unicodeColon = '\u003A';
        System.out.println(unicodeColon);
    }

//    5. Find if a number is even or odd without using any conditional statement
    private static void isEvenOrOdd(int num){
        String[] outcomes = {"Even","Odd"}; // make it a boolean array if you wanted to make an isEven or isOdd method
        System.out.println(outcomes[num % 2]);
    }

//    6. Given an integer, print every prime number from 1 to that integer
    private static void printPrimeNumbers(int theInteger){
        for(int i = 1; i <= theInteger; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean isPrime(int numberToCheck){
        List<Integer> factors = new ArrayList<>();
        for(int i = 1; i <= numberToCheck; i++){
            if(numberToCheck % i == 0) {
                factors.add(i);
            }
        }
        return factors.size() == 2;
    }

//    https://www.java67.com/2018/05/top-75-programming-interview-questions-answers.html

//    7. find the duplicate number in a given integer array
    private static int duplicateInt(int[] intArr){
        int numDup = 0;
        for(int i = 0; i < intArr.length; i++){
            for(int j = i + 1; j < intArr.length; j++){
                if (intArr[i] == intArr[j]){
                    numDup += intArr[i];
                }
            }
        }
        return numDup;
    }

// 8. in an array of integers from 1 to 10 find the missing number
    // Charlie
    public static int findMissingInt(int[] intArray){
        int totalArray = intArray.length + 1; // add one since we know one number is missing
        int expectedSum = totalArray * (totalArray + 1)/2;
        int sum = 0;
        for(int num : intArray){
            sum += num;
        }
        return expectedSum - sum;
    }
    // Brance
    private static int findMissing(int[] intArray){
        int missingInt = 10;
        for(int i= 0; i < intArray.length - 1; i++){  // start counting at 10 instead of 0 in case 10 is the missing int
            if(intArray[i+1] != intArray[i]+1){
                missingInt = intArray[i] + 1;
            }
        }
        return missingInt;
    }

//    9. Write a method which will remove any given character from a String
    private static String removeCharacter(String str, char c){
        String newStr = "";
        for (int i = 0, n = str.length(); i < n; i++) {
            char x = str.charAt(i);
            if (x == c) {
                continue;
            } else {
                newStr += x;
            }
        }
        return newStr;
    }
    // refactored - shorter
    private static String removeCharFromString(String myStr, char myChar){
        String newStr = myStr.replaceAll(""+myChar, "");
        return newStr;
    }

    // https://codingpuzzles.com/floyd-triangle-5231615d5c4d

    //Write a method that accepts an integer and prints that many rows of a Floyd Triangle

// This is what a Floyd Triangle looks like
//            1
//            2 3
//            4 5 6
//            7 8 9 10


    // from Brance

    // Write a function that takes stupid MySQL dates (example: 1234-56-78) and turns them into normal dates (example: 78-56-1234)

    // Write a function that accepts an array of strings and a string. if the array doesn't contain the given string add the string to the array. Return the array either way.

    // write a function that accepts a matrix of integers and returns the array from the matrix with the highest sum of all elements
    // example [
    //          [1, 2, 3],
    //          [4, 5, 6],
    //          [7, 8, 9]     <----- return this array because 7 + 8 + 9 the highest sum of all elements
    //         ]



}
