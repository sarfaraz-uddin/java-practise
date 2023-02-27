import java.util.Vector;
public class VectorLearning {
    public static void main(String[] args) {
        int[] age={10,20,30};
        Vector<Integer> age2=new Vector<Integer>(5);
        age2.add(10);
        age2.add(10);
        age2.add(10);
        age2.add(10);
        age2.add(10);
        age2.add(10);
        age2.add(10);

//        System.out.println(age);
        System.out.println(age2.capacity());
    }
}