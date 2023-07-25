package day4;
// initialisation will happen outside, Condition will happen outside, execution/updation will happen inside
public class WhileLoopExample {
    public static void main(String[] args) {
        int num = 19;
        int i = 1;
        while (i<=10){
            System.out.println(num+ " * "+i+" = "+(num * i));
            i++;
        }



    }
}
