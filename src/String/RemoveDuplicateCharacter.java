package String;

public class RemoveDuplicateCharacter {
    public static void main(String [] args){
//        Remove Duplicate Characters
//        Input: "programming" → Output: "progamin"
        String word="programming";
        String ans=rdc(word);
        System.out.println(ans);

    }
    public static String rdc(String w){
        String a="";
        int range=0;
        for(int i=0;i<w.length();i++){
            char ch=w.charAt(i);

           int c= frequency(w,ch,range);
            if(c==1){
                a+=c;
            }
        }
        return a;
    }
    static int frequency(String s,char target,int range){
        ++range;
        int count=0;
        for(int i=0;i<range;i++){
            char ch=s.charAt(i);
            if(ch==target){
                count++;
            }
        }
        return count;
    }

}
