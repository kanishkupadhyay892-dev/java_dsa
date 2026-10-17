package Array;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>(10);
        list.add(456);
        list.add(453);
        list.add(452);
        list.add(457);
        list.add(457);
        list.add(459);
        list.add(450);
        list.add(451);
        list.add(4523);
        list.add(45245);
        list.add(45778);
        list.add(4598);
        list.add(45456);

        list.set(0,89);
        list.removeFirst();
        System.out.println(list);
    }
}
