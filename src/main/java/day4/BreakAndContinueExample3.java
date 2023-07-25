package day4;

public class BreakAndContinueExample3 {
    public static void main(String[] args) {
        for (int i=100; i>=1;i--){
            System.out.println(i);
            if (i % 28 == 0){
                break;
            }
        }
    }
}
