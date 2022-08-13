import java.util.Arrays;

public class Class {
    private int number;
    private String word;
    private int [] massive;




    public  Class (int a, String b, int[]c){
        this.number=a;
        this.word=b;
        this.massive=c;

    }
    @Override
    public String toString() {
        return "Class{" +
                "number=" + number +
                ", word='" + word + '\'' +
                ", massive=" + Arrays.toString(massive) +
                '}';

}
}