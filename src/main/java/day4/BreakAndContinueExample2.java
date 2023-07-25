package day4;

public class BreakAndContinueExample2 {
    public static void main(String[] args) {
        for (int i=1; i <100; i++){
            System.out.println(i);
            if (i % 5 == 0){
                break;
            }
        }
    }
}
