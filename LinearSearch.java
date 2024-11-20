import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){

        int[] arr = {2,4,5,6,8,9};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the integer you look for: ");
        int key = scan.nextInt();

        int ind = linearSearch(key, arr);
        if(ind == -1)
            System.out.println("Integer not found in the list.");
        else    
            System.out.println("Your integer's index is: " + ind);

    }

    public static int linearSearch(int key, int[] list){
        for(int i = 0; i < list.length; i++){
            if(key == list[i])
                return i;
        }
        return -1;
    }
}