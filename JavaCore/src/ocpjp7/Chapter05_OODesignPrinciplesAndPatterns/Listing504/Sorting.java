package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing504;

/*ocpjp7*/


import java.awt.*;

interface Sorting {
    List sort(List list);
}

class MergeSort implements Sorting {
    public List sort(List list) {
        // sort implementation
        return list;
    }
}

class QuickSort implements Sorting {
    public List sort(List list) {
        // sort implementation
        return list;
    }
}

class DynamicDataSet {
    Sorting sorting;

    public DynamicDataSet() {
        sorting = new MergeSort();
    }
    // DynamicDataSet implementation
}

class SnapshotDataSet {
    Sorting sorting;

    public SnapshotDataSet() {
        sorting = new QuickSort();
    }
    // SnapshotDataSet implementation
}
