package org.example;

import java.util.Arrays;

public class Kata8CS {

    // BEGIN / IB CS WarmUps

    // https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/
    // 8kyu Even or Odd
    // Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.

//    public static String evenOrOdd(int number) {
//        return ""; // Place code here;
//    }

    public static String evenOrOdd(int number) {
        System.out.println("evenOrOdd");
        return (number % 2 == 0) ? "Even" : "Odd";
    }

//    public static String evenOrOdd(int number) {
//        if (number%2==0){
//            return"Even";
//        } else{
//            return "Odd";
//        }
//    }






    // https://www.codewars.com/kata/50654ddff44f800200000004
    // 8kyu Multiply
    // This code does not execute properly. Try to figure out why.

    //    public static Double multiply(Double a, Double b) {
//        return a * b;
//    }
    public static Double multiply(Double a, Double b) {
        System.out.println("multiply");
        return a * b;
    }








    // https://www.codewars.com/kata/5715eaedb436cf5606000381
    // 8kyu Sum of positive
    // You get an array of numbers, return the sum of all of the positives ones.

//    public static int sum(int[] arr){
//        return 0;
//    }

    public static int sum(int[] arr) {
        System.out.println("sum");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

//    public static int sum(int[] arr){
//        int sum = 0;
//        for(int number : arr){
//            if(number > 0){
//                sum += number;
//            }
//        }
//        return sum;
//    }







    // https://www.codewars.com/kata/55685cd7ad70877c23000102
    // 8kyu Return Negative
    // In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

    public static int makeNegative(final int x) {
        System.out.println("makeNegative");
        return x > 0 ? x * (-1) : x;

//     if(x < 0) {
//       return x;
//     } else {
//       return x * (-1);
//     }
    }






    // https://www.codewars.com/kata/56dec885c54a926dcd001095
    // 8kyu Opposite number
    // Very simple, given an integer or a floating-point number, find its opposite.

    public static int opposite(int number) {
        System.out.println("opposite");
        return number * -1;
    }







    // https://www.codewars.com/kata/5168bb5dfe9a00b126000018
    // 8kyu Reversed Strings
    // Complete the solution so that it reverses the string passed into it.

//    public static String solution(String str) {
//        StringBuilder input1 = new StringBuilder();
//        input1.append(str);
//        return input1.reverse().toString();
//    }

    public static String solution(String str) {
        System.out.println("solution");
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }






    // https://www.codewars.com/kata/53369039d7ab3ac506000467
    // 8kyu Convert boolean values to strings 'Yes' or 'No'.
    // Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.

    public static String boolToWord(boolean b) {
        System.out.println("boolToWord");
        return b ? "Yes" : "No";
    }

//    public static String boolToWord(boolean b)
//    {
//        if(b) return "Yes";
//        else return "No";
//    }







    // https://www.codewars.com/kata/5265326f5fda8eb1160004c8
    // 8kyu Convert a Number to a String!
    // We need a function that can transform a number (integer) into a string.

    public static String numberToString(int num) {
        // Return a string of the number here!
        System.out.println("numberToString");
        return String.valueOf(num);
    }







    // https://www.codewars.com/kata/544675c6f971f7399a000e79
    // 8kyu Convert a String to a Number!
    // We need a function that can transform a string into a number. What ways of achieving this do you know?

    public static int stringToNumber(String str) {
        System.out.println("stringToNumber");
        return Integer.parseInt(str);
    }







    // https://www.codewars.com/kata/551b4501ac0447318f0009cd
    // 8kyu Convert a Boolean to a String
    // Implement a function which convert the given boolean value into its string representation.

    public static String convert(boolean b) {
        System.out.println("convert");
        return String.valueOf(b);
    }






    // https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0
    // 8kyu Remove First and Last Character
    // It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. You're given one parameter, the original string. You don't have to worry with strings with less than two characters.

    public static String remove(String str) {
        System.out.println("remove");
        return str.substring(1, str.length() - 1);
    }







    // https://www.codewars.com/kata/515e271a311df0350d00000f
    // 8kyu Square(n) Sum
    // Complete the square sum function so that it squares each number passed into it and then sums the results together.

    public static int squareSum(int[] n) {
        System.out.println("squareSum");
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i] * n[i];
        }
        return sum;
    }

//    public static int squareSum(int[] n)
//    {
//        int sum = 0;
//        for(int m:n) {
//            sum += m*m;
//        }
//        return sum;
//    }

//    public static int squareSum(int[] n)
//    {
//        int sum = 0;
//        for (int num : n) sum += Math.pow(num, 2);
//        return sum;
//    }






    // https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
    // 8kyu String repeat
    // Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.

    public static String repeatStr(final int repeat, final String string) {
        System.out.println("repeatStr");
        String res = "";
        for (int i = 0; i < repeat; i++) {
            res += string;
        }
        return res;
    }

//    static String repeatStr(int repeat, String string) {
//        return string.repeat(repeat);
//    }






    // https://www.codewars.com/kata/55d24f55d7dd296eb9000030
    // 8kyu Grasshopper - Summation
    // Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.

    public static int summation(int n) {
        System.out.println("summation");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

//    public static int summation(int n) {
//        return  n*(n+1)/2;
//    }

//    public static int summation(int n) {
//        if (n == 1)
//            return 1;
//        return summation(n-1) + n;
//    }






    // https://www.codewars.com/kata/57eae20f5500ad98e50002c5
    // 8kyu Remove String Spaces
    // Write a function that removes the spaces from the string, then return the resultant string.

    public static String noSpace(final String x) {
        System.out.println("noSpace");
        return x.replace(" ", "");
    }

//    public static String noSpace(final String x) {
//        return x.replaceAll(" ", "");
//    }

//    static String noSpace(final String x) {
//        String res = "";
//        for (int i = 0; i < x.length(); i++)
//        {
//            if (x.charAt(i) != ' ')
//                res += x.charAt(i);
//
//        }
//        return res;
//    }







    // https://www.codewars.com/kata/55a2d7ebe362935a210000b2
    // 8kyu Find the smallest integer in the array
    // Given an array of integers your solution should find the smallest integer.

    public static int findSmallestInt(int[] args) {
        System.out.println("findSmallestInt");
        int min = args[0]; // no need to check if args is empty
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }

//    public static int findSmallestInt(int[] args)
//    {
//        int min = args[0];
//        for (int num : args)
//            if (num < min)
//                min = num;
//        return min;
//    }

//    public static int findSmallestInt(int[] args) {
//        int smallest = Integer.MAX_VALUE;
//        for (int i : args)
//            smallest = (smallest>i) ? i : smallest;
//        return smallest;
//    }







    // https://www.codewars.com/kata/54edbc7200b811e956000556
    // 8kyu Counting sheep...
    // Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

//    public int countSheeps(Boolean[] arrayOfSheeps) {
//        // TODO May the force be with you
//    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        System.out.println("countSheeps");
        if (arrayOfSheeps.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i] == true) {
                count++;
            }
        }
        return count;
    }

//    public int countSheeps(Boolean[] arrayOfSheeps) {
//        int counter = 0;
//        for (Boolean present : arrayOfSheeps) {
//            if (present != null && present) {
//                counter += 1;
//            }
//        }
//        return counter;
//    }








    // https://www.codewars.com/kata/57356c55867b9b7a60000bd7
    // 8kyu Basic Mathematical Operations
    // Your task is to create a function that does four basic mathematical operations.

    public static Integer basicMath(String op, int v1, int v2) {
        System.out.println("basicMath");
        if ("+" == op) return v1 + v2;
        if ("-" == op) return v1 - v2;
        if ("*" == op) return v1 * v2;
        if ("/" == op) return v1 / v2;
        return 0;
    }

//    public static Integer basicMath(String op, int v1, int v2)
//    {
//        int valor = 0;
//        if("+".equals(op)) valor = v1 + v2;
//        if("-".equals(op)) valor = v1 - v2;
//        if("*".equals(op)) valor = v1 * v2;
//        if("/".equals(op)) valor = v1 / v2;
//        return valor;
//    }

//    public static Integer basicMath(String symbol, int x, int y){
//        switch (symbol){
//            case "+": return x+y;
//            case "-": return x-y;
//            case "*": return x*y;
//            case "/": return x/y;
//        }
//        return 0;
//    }

//    public static Integer basicMath(String op, int v1, int v2)
//    {
//        char oo = op.charAt(0);
//        switch (oo) {
//            case '+' : { return v1 + v2; }
//            case '-' : { return v1 - v2; }
//            case '*' : { return v1 * v2; }
//            case '/' : { return v1 / v2; }
//            default: { return 0; }
//        }
//    }








    // https://www.codewars.com/kata/582cb0224e56e068d800003c
    // 8kyu Keep Hydrated!
    // You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.

//    public int Liters(double time)  {
//        //Your code goes here! Hint: You should change that -1
//        return -1;
//    }

    public int Liters(double time) {
        System.out.println("Liters");
        return (int) Math.floor(time / 2);
    }

//    public int Liters(double time)  {
//        return (int)(time / 2);
//    }

//    public int Liters(double time)  {
//        return (int) (time * 0.5);
//    }







    // https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097
    // 8kyu Century From Year
    // The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.

//    public static int century(int number) {
//        // your code goes here
//    }

    public static int century(int number) {
        System.out.println("century");
        if (number % 100 == 0) {
            return number / 100;
        } else {
            return number / 100 + 1;
        }
    }

//    public static int century(int number) {
//        return (number + 99) / 100;
//    }

//    public static int century(int number) {
//        return (number - 1) / 100 + 1;
//    }

//    public static int century(int number) {
//        return number % 100 == 0? number / 100 : (number / 100) + 1;
//    }








    // https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3
    // 8kyu Abbreviate a Two Word Name
    // Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

//    public static String abbrevName(String name) {
//        return name;
//    }

    public static String abbrevName(String name) {
        System.out.println("abbrevName");
        String[] arr = name.split(" ");
        String res = arr[0].charAt(0) + "." + arr[1].charAt(0);
        res = res.toUpperCase();
        return res;
    }

//    public static String abbrevName(String name) {
//        String[] names = name.split(" ");
//        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
//    }

//    public static String abbrevName(String name) {
//        name = name.toUpperCase();
//        return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
//    }








    // https://www.codewars.com/kata/5583090cbe83f4fd8c000051
    // !!! 8kyu Convert number to reversed array of digits
    // Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

//    public static int[] digitize(long n) {
//        // Code here
//    }

    public static int[] digitize(long n) {
        System.out.println("digitize");
        String str = String.valueOf(n);
        int len = str.length();
        int[] nums = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            nums[len - i - 1] = Integer.parseInt("" + str.charAt(i));
        }
        return nums;
    }








    // https://www.codewars.com/kata/5545f109004975ea66000086
    // 8kyu Is n divisible by x and y?
    // Create a function that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero numbers.

    public static boolean isDivisible(long n, long x, long y) {
        System.out.println("isDivisible");
        return ((n % x == 0) && (n % y == 0));
    }

//    public static Boolean isDivisible(long n, long x, long y) {
//        return n % x + n%y == 0;
//    }

//    public static Boolean isDivisible(long n, long x, long y) {
//        return n % x == 0 && n % y == 0 ? true : false;
//    }









    // https://www.codewars.com/kata/55a70521798b14d4750000a4
    // 8kyu Returning Strings
    // Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".

//    public static String greet(String name)
//    {
//        // Your code here
//    }

    public static String greet(String name) {
        System.out.println("greet");
        return "Hello, " + name + " how are you doing today?";
    }

//    public static String greet(String name)
//    {
//        return String.format("Hello, %s how are you doing today?", name);
//    }








    // https://www.codewars.com/kata/56676e8fabd2d1ff3000000c
    // 8kyu A Needle in the Haystack
    // Write a function findNeedle() that takes an array full of junk but containing one "needle"

    public static String findNeedle(Object[] haystack) {
        System.out.println("findNeedle");
        int found = -1;
        int i = 0;
        for (Object ob : haystack) {
            if (ob != null) {
                if (ob.equals("needle")) {
                    found = i;
                }
            }
            i++;
        }
        return "found the needle at position " + found;
    }

//    public static String findNeedle(Object[] haystack) {
//        int found = -1;
//        int i = 0;
//        for(Object ob: haystack) {
//            if(ob != null && ob.equals("needle")) {
//                found = i;
//            }
//            i++;
//        }
//        return "found the needle at position " + found;
//    }

//    public static String findNeedle(Object[] haystack) {
//        int i = 0;
//        while(!String.valueOf(haystack[i]).equals("needle")){
//            i++;
//        }
//        return "found the needle at position " + i;
//    }

//    public static String findNeedle(Object[] haystack) {
//        return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
//    }







    // https://www.codewars.com/kata/555086d53eac039a2a000083
    // 8kyu Opposites Attract
    // Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

//    public static boolean isLove(final int flower1, final int flower2) {
//
//    }

    public static boolean isLove(final int flower1, final int flower2) {
        System.out.println("isLove");
        boolean timmy = flower1 % 2 == 0;
        boolean sarah = flower2 % 2 == 0;
        return timmy && !sarah || !timmy && sarah;
    }

//    public static boolean isLove(final int flower1, final int flower2) {
//        return flower1 % 2 != flower2 % 2;
//    }

//    public static boolean isLove(final int flower1, final int flower2) {
//        return (flower1 + flower2) %2 != 0;
//    }







    // https://www.codewars.com/kata/57f781872e3d8ca2a000007e
    // 8kyu Beginner - Lost Without a Map
    // Given an array of integers, return a new array with each value doubled.

    public static int[] map(int[] arr) {
        System.out.println("map");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }

//    public static int[] map(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] *= 2;
//        }
//        return arr;
//    }






    // https://www.codewars.com/kata/55f9b48403f6b87a7c0000bd
    // 8kyu Beginner Series #1 School Paperwork
    // Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.

//    public static int paperWork(int n, int m)
//    {
//        //Happy Coding! ^_^
//    }

    public static int paperWork(int n, int m) {
        System.out.println("paperWork");
        if (n < 0 || m < 0) {
            return 0;
        } else {
            return m * n;
        }
    }

//    public static int paperWork(int n, int m)
//    {
//        return (n < 0) || (m < 0) ? 0 : n * m;
//    }







    // https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a
    // 8kyu Beginner Series #2 Clock
    // Clock shows h hours, m minutes and s seconds after midnight. Your task is to write a function which returns the time since midnight in milliseconds.

    public static int Past(int h, int m, int s) {
        System.out.println("Past");
        return s * 1000 + m * 1000 * 60 + h * 1000 * 60 * 60;
    }

//    public static int Past(int h, int m, int s)
//    {
//        return 1000*(s+60*(m+60*h));
//    }

//    public static int Past(int h, int m, int s)
//    {
//        // convert hours and minutes to seconds to find total
//        int totalSeconds = s;
//        // adding hours converted to seconds
//        totalSeconds += h * 3600;
//        // adding minutes converted to seconds
//        totalSeconds += m * 60;
//        return totalSeconds * 1000;
//    }






    // https://www.codewars.com/kata/57a2013acf1fa5bfc4000921
    // 8kyu Calculate average
    // Write a function which calculates the average of the numbers in a given list.

    public static double find_average(int[] array) {
        System.out.println("find_average");
        if (array.length == 0) {
            return 0;
        }

        double sum = 0.0;
        for (int item : array) {
            sum += item;
        }

        return sum / array.length;
    }








    // https://www.codewars.com/kata/53ee5429ba190077850011d4
    // 8kyu You Can't Code Under Pressure #1
    // Code as fast as you can! You need to double the integer and return it.

    public static int doubleInteger(int i) {
        System.out.println("doubleInteger");
        // Double the integer and return it!
        return i * 2;
    }

//    public static int doubleInteger(int i) {
//        // Double the integer and return it!
//        int twice = i*2;
//        return twice;
//    }

//    public static int doubleInteger(int i) {
//        // Double the integer and return it!
//        return i<<1;
//    }

//    public static int doubleInteger(int i) {
//        // Double the integer and return it!
//        return i+i;
//    }

//    public static int doubleInteger(int i) {
//        long result = i * 2;
//        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
//        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
//
//        return (int) result;
//    }







    // https://www.codewars.com/kata/583710ccaa6717322c000105
    // 8kyu Simple multiplication
    // This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.

    public static int simpleMultiplication(int n) {
        System.out.println("simpleMultiplication");
        if (n % 2 == 0) {
            return n * 8;
        } else {
            return n * 9;
        }
    }

//    public static int simpleMultiplication (int n) {
//        return n % 2 == 0 ? n * 8 : n * 9;
//    }








    // https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad
    // 8kyu Invert values
    // Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

    public static int[] invert(int[] array) {
        System.out.println("invert");
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        return array;
    }

//    public static int[] invert(int[] array) {
//        int [] res = new int[array.length];
//        for(int i = 0; i < array.length; i++)
//            res[i] = -array[i];
//        return res;
//    }

//    public static int[] invert(int[] array)
//    {
//        for (int i = 0;i < array.length; i++) {
//            array[i] = -(array[i]);
//        }
//        return array;
//    }








    // https://www.codewars.com/kata/576bb71bbbcf0951d5000044
    // 8kyu Count of positives / sum of negatives
    // Given an array of integers. Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

//    public static int[] countPositivesSumNegatives(int[] input)
//    {
//        return null; //return an array with count of positives and sum of negatives
//    }

    public static int[] countPositivesSumNegatives(int[] input) {
        System.out.println("countPositivesSumNegatives");
        if(input == null || input.length == 0) {
            return new int[]{};
        }

        int[] result = new int[2];

        int sum = 0;
        int count = 0;

        for(int item: input) {
            if(item != 0) {
                if(item > 0) {
                    count++;
                } else {
                    sum += item;
                }
            }
        }

        result[0] = count;
        result[1] = sum;

        return result;
    }

//    public static int[] countPositivesSumNegatives(int[] input)
//    {
//        if (input == null || input.length == 0) return new int[] {};
//        int count = 0,sum = 0;
//        for (int i : input) {
//            if (i > 0) count ++;
//            if (i < 0) sum += i;
//        }
//        return new int[] {count,sum};
//    }








    // https://www.codewars.com/kata/57f780909f7e8e3183000078
    // 8kyu Beginner - Reduce but Grow
    // Given a non-empty array of integers, return the result of multiplying the values together in order.

//    public static int grow(int[] x){
//        return 0;
//    }

    public static int grow(int[] array){
        System.out.println("grow");
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result *= array[i];
        }
        return result;
    }

//    public static int grow(int[] x){
//        int res = 1;
//        for(int item: x) {
//            res *= item;
//        }
//        return res;
//    }

//    public static int grow(int[] x){
//        int result = 1;
//        for (int i = 0; i < x.length; i++) {
//            if (x[i] == 0) {
//                return 0;
//            }
//            result *= x[i];
//        }
//        return result;
//    }








    // https://www.codewars.com/kata/5601409514fc93442500010b
    // 8kyu How good are you really?
    // You receive an array with your peers' test scores. Now calculate the average and compare your score!

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        System.out.println("betterThanAverage");

        double sum = 0;
        sum += yourPoints;

        for(int item: classPoints) {
            sum += item;
        }

        if(yourPoints > (sum / (classPoints.length + 1))) {
            return true;
        } else {
            return false;
        }
    }

//    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
//        int sum = 0;
//        for (int val : classPoints) {
//            sum += val;
//        }
//
//        return yourPoints > (sum / classPoints.length);
//    }









    // https://www.codewars.com/kata/5556282156230d0e5e000089
    // 8kyu DNA to RNA Conversion
    // Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').

    public String dnaToRna(String dna) {
        System.out.println("dnaToRna");

        return dna.replace("T", "U");  // Do your magic!
    }








    // https://www.codewars.com/kata/5a00e05cc374cb34d100000d
    // 8kyu Reversed sequence
    // Build a function that returns an array of integers from n to 1 where n>0.

//    public static int[] reverse(int n){
//        //your code
//        return new int[]{};
//    }

    public static int[] reverse(int n){
        System.out.println("reverse");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = n-i;
        }
        return arr;
    }








    // https://www.codewars.com/kata/5513795bd3fafb56c200049e
    // 8kyu Count by X
    // Create a function with two arguments that will return an array of the first n multiples of x.

//    public static int[] countBy(int x, int n){
//        // Your code here
//        return null;
//    }

    public static int[] countBy(int x, int n){
        System.out.println("countBy");
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = x*(i+1);
        }
        return result;
    }








    // https://www.codewars.com/kata/55225023e1be1ec8bc000390
    // 8kyu Jenny's secret message
    // Jenny has written a function that returns a greeting for a user. However, she's in love with Johnny, and would like to greet him slightly different. She added a special case to her function, but she made a mistake.

    public static String jenny_greet(String name) {
        System.out.println("jenny_greet");
        if(name.equals("Johnny")){
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);
    }









    // https://www.codewars.com/kata/5772da22b89313a4d50012f7
    // 8kyu Grasshopper - Personalized Message
    // Create a function that gives a personalized greeting. This function takes two parameters: name and owner.

    static String greet(String name, String owner) {
        System.out.println("greet");
        String result = "Hello guest";

        if(name.equals(owner)) {
            result = "Hello boss";
        }

        return result;
    }

//    static String greet(String name, String owner) {
//        return name.equals(owner) ? "Hello boss" : "Hello guest";
//    }

    // END

    public static void main(String[] args) {
        System.out.println(evenOrOdd(2)); // #1
        System.out.println(multiply(1.5, 6.0)); // #2
        System.out.println(sum(new int[]{-1,2,3,4,-5}));
        System.out.println(makeNegative(50));
        System.out.println(opposite(-4));
        System.out.println(solution("world"));
        System.out.println(boolToWord(false));
        System.out.println(numberToString(100));
        System.out.println(stringToNumber("500"));
        System.out.println(convert(false));
        System.out.println(remove("Hello, World"));
        System.out.println(squareSum(new int[]{0, 6, 4, 6, 8, 2, -5}));
        System.out.println(repeatStr(6, "Hello"));
        System.out.println(summation(7));
        System.out.println(noSpace("Hello, word !"));
        System.out.println(findSmallestInt(new int[]{0, 6, 4, 6, 8, 2, -5}));
        System.out.println(basicMath("+", 5, 7));
        System.out.println(abbrevName("Hello World"));
        System.out.println(find_average(new int[]{0, 6, 4, 6, 8, 2, -5}));
        // ...
        System.out.println(Arrays.toString(map(new int[]{0, 6, 4, 6, 8, 2, -5})));
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{0, 6, 4, 6, 8, 2, -5})));
        System.out.println(Arrays.toString(reverse(7)));
        System.out.println(Arrays.toString(countBy(5, 10)));
        System.out.println(Arrays.toString(digitize(2770149031L))); //
    }
}
