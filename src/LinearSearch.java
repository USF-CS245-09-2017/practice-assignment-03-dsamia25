public class LinearSearch implements Practice03Search {

    /**
     * Calls the linear search function
     *
     * @param arr    the array to search in
     * @param target the target of the search
     * @return the index of the target
     */
    public int search(int[] arr, int target) {
        return linearSearch(arr, target);
    }

    public String searchName() {
        return "LinearSearch";
    }

    /**
     * @param arr    the array to search in
     * @param target the target of the search
     * @return the index of the target or -1 if the target is not in the array
     */
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
