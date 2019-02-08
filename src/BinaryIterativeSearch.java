public class BinaryIterativeSearch implements Practice03Search {

    /**
     * calls the binary iterative function
     *
     * @param arr    the array to search in
     * @param target the target of the search
     * @return
     */
    public int search(int[] arr, int target) {
        return binarySearchIterative(arr, target, 0, arr.length);
    }

    public String searchName() {
        return "BinaryIterativeSearch";
    }

    /**
     * @param arr    the array to search in
     * @param target the target of the search
     * @param s      the index to start at
     * @param e      the index to end at
     * @return the index of the target or -1 if the target isn't there
     */
    public int binarySearchIterative(int[] arr, int target, int s, int e) {
        while (s < e) {
            int mid = (s + e) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
