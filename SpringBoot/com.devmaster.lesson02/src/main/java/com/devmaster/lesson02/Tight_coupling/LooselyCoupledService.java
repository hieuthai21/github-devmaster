package com.devmaster.lesson02.Tight_coupling;

public class LooselyCoupledService {
    private SortAlgoristhm sortAlgorithm;
    public LooselyCoupledService(){}
    public LooselyCoupledService(SortAlgoristhm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    public void complexBusiness(int[] arr) {
        sortAlgorithm.sort(arr);
    }

    public static void main(String[] args) {
        LooselyCoupledService sortAlgorithm = new LooselyCoupledService(new LooseSortAlgoristhm());
        sortAlgorithm.complexBusiness(new int[]{11,22,6,8,70});
    }
}
