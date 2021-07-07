public class Review {
    public static void main(String[] args) {

        System.out.println(total(234, 15));
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        even(nums);

    }

    public static double total(double bill, double tipPercentage) {
        return bill + ((tipPercentage / 100) * bill);
    }
    public static void even(int[] intarr) {
        for (int num : intarr) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

}
