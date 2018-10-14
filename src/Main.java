import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0,indexColumn=0;
        System.out.printf("Enter size: ");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.printf("enter element["+i+"]["+j+"]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.printf(array[i][j] + " ");
            }
            System.out.println("");
        }

        do {
            System.out.printf("Enter index of column in matrix: ");
            indexColumn = scanner.nextInt();
            if(indexColumn<=0||indexColumn>=size){
                System.out.printf("This value is not valid, please try again!\n");
            }
        }while (indexColumn<=0||indexColumn>=size);


        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(j==indexColumn){
                    sum+=array[i][j];
                }
            }
        }

        System.out.printf("Result: %d",sum);
    }
}
