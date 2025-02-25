package com.devmaster.lesson02.Tight_coupling;

import java.util.Arrays;

public interface SortAlgoristhm {
    void sort(int[] arr);
}

class LooseSortAlgoristhm implements SortAlgoristhm {
    @Override
    public void sort(int[] arr) {
        System.out.println("sorted...");
        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}
