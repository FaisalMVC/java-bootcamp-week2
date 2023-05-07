/*
* @author Faisal Alharbi
* */
import java.util.Arrays;
import java.util.Scanner;

public class Homework6Exercise7 {
    public static void main(String[] args) {
        System.out.println("\n************ From homework 4 Question 7 ************\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = input.nextInt();
        int [] userArray = new int[size];
        int currentIndex = 0;
        int option=0;
        do {
            System.out.println("1. Accept elements of an array");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search the element within array");
            System.out.println("4. Sort the array");
            System.out.println("5. To Stop ");

            option = input.nextInt();
            try {
                switch (option) {
                    case 1:
                        if (currentIndex < size) {
                            System.out.println("Enter the number : ");
                            userArray[currentIndex] = input.nextInt();
                            System.out.println("Element ( " + userArray[currentIndex] + " ) has been added");
                            currentIndex++;
                        } else {
                            System.out.println("You can not add your array is Full !!!!");
                        }
                        break;
                    case 2:
                        System.out.println(Arrays.toString(userArray));
                        break;
                    case 3:
                        System.out.println("Enter the number : ");
                        int num = input.nextInt();
                        boolean isThere = false;
                        for (int i = 0; i < size; i++) {
                            if (userArray[i] == num) {
                                System.out.println("The number " + num + " exsist at index [" + i + "] ");
                                isThere = true;
                            }
                        }
                        if (!isThere) {
                            System.out.println("There is no " + num + " in the array !");
                        }
                        break;
                    case 4:
                        for (int i = 0; i < currentIndex; i++) {
                            for (int j = i + 1; j < currentIndex; j++) {
                                if (userArray[i] > userArray[j]) {
                                    userArray[i] ^= userArray[j];
                                    userArray[j] ^= userArray[i];
                                    userArray[i] ^= userArray[j];
                                }
                            }
                        }
                        System.out.println("The array after sorting : " + Arrays.toString(userArray));
                        break;
                    case 5:
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid input!");
                }
            }catch(IllegalArgumentException invalidInput){
                System.out.println(invalidInput.getMessage());
            }catch (RuntimeException generalRuntimeException){
                System.out.println(generalRuntimeException.getMessage()); // Here I just showed the  Exception hierarchy because the thrown exception will be handled in IllegalArgumentException
            }catch (Exception generalException){
                System.out.println(generalException.getMessage()); // Here I just showed the  Exception hierarchy because the thrown exception will be handled in IllegalArgumentException
            }
        }while(option != 5);
    }
}