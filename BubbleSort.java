import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) throws Exception {


        //creating new array with 100 numbers

        Random rand = new Random();
        int[] numbers = new int[100];


        //fill array with random numbers from 0 to 100

        for (int i =0; i < numbers.length;i++){

            numbers[i] = rand.nextInt(100);
        };

        // printing out before sorting algorithm

        System.out.println("Before:");
        printArray(numbers);

        
        
        //sorting algorithm
        boolean swappedSomething = true;
        while(swappedSomething){
            swappedSomething = false;
            for (int i = 0; i < numbers.length-1; i++){
                if(numbers[i]>numbers[i+1]){
                swappedSomething = true;
                int temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp; 
                }
            }
        }

        System.out.println("\nAfter:");
        printArray(numbers);
    }
    private static void printArray(int[] numbers){
        for (int i= 0 ;i< numbers.length;i++){
            System.out.println(numbers[i]);
        }


    }
}