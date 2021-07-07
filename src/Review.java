public class Review {

    public static void main(String[] args) {
       even(new int[]{1, 2, 3, 4, 5, 6});

    }

    public static double radius(double radius){
        return 2 * Math.PI * radius;
    }

    public static double radius(int radius){
        return (2 * Math.PI * radius);
    }

    public static double total(double bill, double tip){
        return bill + (bill * tip/100);
    }

    public static void even(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                System.out.println(nums[i]);
            }
        }

    }
}
