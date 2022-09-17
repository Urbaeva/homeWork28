package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(2,3,4,5,7,8,9,0,6));

        System.out.println(arrayList.stream().filter(x -> x % 2 == 0).map(x -> x * x).max(Comparator.naturalOrder()));


    }
}
