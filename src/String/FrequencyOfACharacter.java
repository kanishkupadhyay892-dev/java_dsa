package String;
import java.util.Scanner;
public class FrequencyOfACharacter {
    public static void main(String [] args){
//     Q.   Frequency of a Character
//        Input: "programming", target = 'm' → Output: 2
        Scanner sc =new Scanner(System.in);
        String word=sc.next();
        char target=sc.next().charAt(0);
        int ans=(frequency(word,target));
        System.out.println(ans);
    }
    static int frequency(String s,char target){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==target){
                count++;
            }
        }
        return count;
    }
}
