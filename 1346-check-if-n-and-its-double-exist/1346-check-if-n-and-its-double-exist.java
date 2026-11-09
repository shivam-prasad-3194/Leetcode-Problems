class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            int x = arr[i];
            if(set.contains(x * 2) || (x % 2 == 0 && set.contains(x / 2))){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}