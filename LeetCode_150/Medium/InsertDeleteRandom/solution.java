class RandomizedSet {
    private ArrayList<Integer> arr;
    private Random rand;

    public RandomizedSet() {
        this.arr = new ArrayList<>();
        this.rand = new Random();
    }
    
    public boolean insert(int val) {
        if(arr.contains(val))return false;
        else {
            arr.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(arr.contains(val)){
            arr.remove(Integer.valueOf(val));
            return true;
        } else {
            return false;
        }
    }
    
    public int getRandom() {
        return arr.get(rand.nextInt(arr.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
