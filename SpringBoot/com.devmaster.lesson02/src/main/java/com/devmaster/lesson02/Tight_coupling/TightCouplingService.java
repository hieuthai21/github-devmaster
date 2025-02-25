package com.devmaster.lesson02.Tight_coupling;

import java.util.Arrays;

class BubbleSortAlgoristhm{
    public void sort(int[] arr){
        System.out.println("Sắp xếp theo giai thuật Bubble Sort");
        int n = arr.length;
        boolean swapped ;
        for(int i=0; i<n-1; i++){
            swapped = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
public class TightCouplingService {
    private BubbleSortAlgoristhm bubbleSortAlgorithm = new BubbleSortAlgoristhm();
    public TightCouplingService(){}
    public TightCouplingService(BubbleSortAlgoristhm algorithm){
        this.bubbleSortAlgorithm = algorithm;
    }

    public void complexBussinessSort(int[] arr){
        bubbleSortAlgorithm.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
    public static void main(String[] args) {
        TightCouplingService tCouplingService = new TightCouplingService();
        tCouplingService.complexBussinessSort(new int[]{11,33,89,37,5});
    }
}
