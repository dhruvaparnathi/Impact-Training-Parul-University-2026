class ArrayADT {
    int[] arr;
    int capacity;
    int size;

    ArrayADT(int cap) {
        capacity = cap;
        arr = new int[capacity];
        size = 0;
    }

    void insertAtLast(int val) {
        if (isFull()) {
            System.out.println("Array OverFlow");
            return;
        }

        arr[size] = val;
        size++;
    }

    int deleteAtLast() {

        if (isEmpty()) {
            System.out.println("Array UnderFlow");
            return -1;
        }

        size--;
        int temp = arr[size];
        arr[size] = 0;
        return temp;
    }

    void insertAtFirst(int val) {

        if (isFull()) {
            System.out.println("Array OverFlow");
            return;
        }

        for (int i = size - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        arr[0] = val;
        size++;
    }

    int deleteAtFirst() {

        if (isEmpty()) {
            System.out.println("Array UnderFlow");
            return -1;
        }

        int temp = arr[0];

        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
        arr[size] = 0;

        return temp;
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    // ================= SEARCH =================

    int linearSearch(int key) {

        int lCount = 0;

        for (int i = 0; i < size; i++) {

            lCount++;

            if (key == arr[i]) {
                System.out.println("Linear Count : " + lCount);
                return i;
            }
        }

        System.out.println("Linear Count : " + lCount);
        return -1;
    }

    int binarySearch(int key) {

        int l = 0;
        int r = size - 1;

        int bCount = 0;

        while (l <= r) {

            int mid = (l + r) / 2;
            bCount++;

            if (arr[mid] == key) {

                System.out.println("Binary Count : " + bCount);
                return mid;

            } else if (arr[mid] > key) {

                r = mid - 1;

            } else {

                l = mid + 1;
            }
        }

        System.out.println("Binary Count : " + bCount);
        return -1;
    }

    int interpolationSearch(int key) {

        int l = 0;
        int r = size - 1;

        int iCount = 0;

        while (l <= r && key >= arr[l] && key <= arr[r]) {

            if (l == r) {
                if (arr[l] == key)
                    return l;
                return -1;
            }

            int mid = l + (((key - arr[l]) * (r - l)) / (arr[r] - arr[l]));

            iCount++;

            if (arr[mid] == key) {

                System.out.println("Interpolation Count : " + iCount);
                return mid;

            } else if (arr[mid] > key) {

                r = mid - 1;

            } else {

                l = mid + 1;
            }
        }

        System.out.println("Interpolation Count : " + iCount);
        return -1;
    }

    // ================= PRINT =================

    void print() {

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // ================= BUBBLE SORT =================

    int[] bubbleSort() {

        for (int i = 0; i < size - 1; i++) {

            boolean isSwap = false;

            for (int j = 0; j < size - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    isSwap = true;
                }
            }

            if (isSwap == false)
                return arr;
        }

        return arr;
    }

    // ================= SELECTION SORT =================

    int[] selectionSort() {

        for (int i = 0; i < size - 1; i++) {

            int smallIndex = i;

            for (int j = i + 1; j < size; j++) {

                if (arr[j] < arr[smallIndex])
                    smallIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[smallIndex];
            arr[smallIndex] = temp;
        }

        return arr;
    }

    // ================= INSERTION SORT =================

    int[] insertionSort() {

        for (int i = 1; i < size; i++) {

            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {

                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }

        return arr;
    }

    // ================= MERGE SORT =================

    void mergeSort(int st, int end) {

        // base case
        if (st >= end)
            return;

        // find mid
        int mid = (st + end) / 2;

        // left part
        mergeSort(st, mid);

        // right part
        mergeSort(mid + 1, end);

        // merge both sorted parts
        merge(st, mid, end);
    }

    // ================= MERGE FUNCTION =================

    void merge(int st, int mid, int end) {

        // temporary ArrayList
        ArrayList<Integer> temp = new ArrayList<>();

        int i = st;
        int j = mid + 1;

        // compare both halves
        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {

                temp.add(arr[i]);
                i++;

            } else {

                temp.add(arr[j]);
                j++;
            }
        }

        // remaining left elements
        while (i <= mid) {

            temp.add(arr[i]);
            i++;
        }

        // remaining right elements
        while (j <= end) {

            temp.add(arr[j]);
            j++;
        }

        // copy ArrayList to original array
        for (int idx = 0; idx < temp.size(); idx++) {

            arr[st + idx] = temp.get(idx);
        }
    }



    // ====================== QUICK SORT =======================

    void quickSort(int low, int high) {

        if (low < high) {

            int pivotIndex = partition(low, high);

            quickSort(low, pivotIndex - 1);

            quickSort(pivotIndex + 1, high);
        }
    }

    int partition(int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                swap(i, j);
            }
        }

        swap(i + 1, high);

        return i + 1;
    }

    // ======================= HEAP SORT =======================

    void heapSort() {

        // build max heap
        for (int i = size / 2 - 1; i >= 0; i--) {

            heapify(size, i);
        }

        // extract elements
        for (int i = size - 1; i > 0; i--) {

            swap(0, i);

            heapify(i, 0);
        }
    }

    void heapify(int n, int i) {

        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // left child
        if (left < n && arr[left] > arr[largest]) {

            largest = left;
        }

        // right child
        if (right < n && arr[right] > arr[largest]) {

            largest = right;
        }

        // swap if needed
        if (largest != i) {

            swap(i, largest);

            heapify(n, largest);
        }
    }


    void swap(int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class ArryaUser {

    public static void main(String[] arg) {

        ArrayADT a = new ArrayADT(5);

        a.insertAtLast(5);
        a.insertAtLast(3);
        a.insertAtLast(2);
        a.insertAtLast(1);
        a.insertAtLast(4);

        System.out.println("Before Sorting:");
        a.print();

        a.mergeSort(0, a.size - 1);

        System.out.println("\nAfter Merge Sort:");
        a.print();
    }
}
