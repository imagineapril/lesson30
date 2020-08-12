package ru.timokhina.algorithm.lesson30;
public class UniqueChar {

    public static void main(String[] args) {

        String string1 = "total";
        char[] array = string1.toCharArray();
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] != array[j]) {
                    System.out.println(array[j]);
                    return;
                }
            }
        }
    }
}

