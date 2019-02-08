public class BinaryRecursiveSearch implements Practice03Search {

    /**
     * calls the binary recursive function
     *
     * @param arr    the array to search in
     * @param target the target of the search
     * @return
     */
    public int search(int[] arr, int target) {
        return binarySearchRecursive(arr, target, 0, arr.length);
    }

    public String searchName() {
        return "BinaryRecursiveSearch";
    }

    /**
     * @param arr    the array to search in
     * @param target the target of the search
     * @param s      the index to start searching at
     * @param e      the index to end searching at
     * @return the index of the target or -1 if the target isn't in the array
     */
    public int binarySearchRecursive(int[] arr, int target, int s, int e) {
        if (s < e) {
            int mid = (s + e) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return binarySearchRecursive(arr, target, mid + 1, e);
            } else {
                return binarySearchRecursive(arr, target, s, mid - 1);
            }
        } else {
            return -1;
        }
    }
}
