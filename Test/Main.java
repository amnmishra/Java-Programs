class Main {
    public static void main(String[] args) {
        int nums[] = { 3,4,3,4,3 };
        // for (int num : nums) {
        //     System.out.println(nums + "\t" + num);
        // }
    

        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        if (count > nums.length / 2) {
            System.out.println(candidate);
        }
    }
}