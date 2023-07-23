public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.setType("Dog");
        animal.makeSound();
        int[] nums = {2,6,4,39,5,1};
        SortingAlgo bubble = new SortingAlgo();
        bubble.quickSort(nums);
//        for (int num:
//             nums) {
//           System.out.println(num);
//        }
        //System.out.println(animal.getType());
    }
}
