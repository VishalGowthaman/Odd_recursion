public class Main{
    public static void main(String[] args){
        printOdd(15);
    }
    static int printOdd(int input) {
        if (input == 1) {
            System.out.println(input);
            return 0;
        }
        if (input % 2 != 0) {
            System.out.println(input);
            printOdd(input - 2);
            return 0;
        }
        if (input % 2 == 0) {
            System.out.println(input);
            printOdd(input - 2);
        }
        return 1;
    }

}
