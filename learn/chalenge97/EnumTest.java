package com.learn.chalenge97;

public class EnumTest {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.printf("%s : %s\n" ,day, day.getType());
        }
    }
}
