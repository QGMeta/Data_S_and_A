Class Source {
    int binarySearch(int[] array, int begin, int end, int key) {
        if (begin > end) {
            return -1;
        }
        int mid = (begin + end) >>> 1;
        if (array[mid] < key) {
            binarySearch(array, mid + 1, end, key);
        } else if (array[mid] > key) {
            binarySearch(array, begin, mid - 1, key);
        } else {
            return mid;
        }
    }
}