import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int larger = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < size; i++){
            if(arr[i] > larger){
                sum += arr[i];
            }
        }
        System.out.println(sum);

    }
}