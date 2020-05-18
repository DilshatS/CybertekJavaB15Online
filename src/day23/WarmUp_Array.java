package day23;

public class WarmUp_Array {

    public static void main(String[] args) {

        // create an int array of 7 items
        // assign values
        // print out in reverse order
        // store last item in a variable called lastItem
        // print it out separately
        // print the item right in the middle
        // optionally find sum, find max, find min, find average

        // first way to create an array object and add value into index location
        int[] nums = new int[7];
        nums[0] = 11;
        nums[1] = 2;
        nums[2] = 23;
        nums[3] = 4;
        nums[4] = 53;
        nums[5] = 6;
        nums[6] = 3;

        // second way to create an array with values already filled
        // int[] nums2 = new int[]{11,2,34,4,53,6,3};


        // 3rd wand shortest way
        // THIS MUST HAPPEN IN ONE LINE, WE CAN NOT DECLARE FIRST AND ASSIGN LATER
        // int[] nums3 = {11,2,34,4,53,6,3};


        for (int x = nums.length-1; x >= 0; x--) {
            System.out.println("index " + x + " : " + nums[x]);
        }

        int arraySIze = nums.length;
        int lastIndex = arraySIze-1;

        int lastItemValue = nums[lastIndex];
        System.out.println("lastItemValue = " + lastItemValue);

        int middleIndex = arraySIze/2;
        System.out.println("middle item value = " + nums[middleIndex]);
        
        int sum = 0;
        for (int x = 0; x < arraySIze; x++) {
            
            //int currentItem = nums[x];
            //sum = sum + currentItem;
            sum = sum + nums[x]; // sum += nums[x];
            
        }

        System.out.println("sum = " + sum);


//        int lastIndex = nums2.length-1;
//
//        int lastItem = nums2.length;

//        int middleItem = nums.length;
//        int middle = middleItem/2;
//        System.out.println(nums[middle]);
//
//        for (int x = lastIndex; x >= 0; x--) {
//            System.out.println(nums2[x]);
//        }
//
//        System.out.println("lastItem = " + lastItem);
//
//        System.out.println("middleItem = " + middleItem);

    }

}
