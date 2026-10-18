package String;

public class RemoveDuplicateCharacterBruteForce{
    public static void main(String [] args){
//        Remove Duplicate Characters
//        Input: "programming" → Output: "progamin"
        String word="programming";
        String ans=rdcBruteForce(word);
        System.out.println(ans);

    }
    static String rdcBruteForce(String w){
        String a="";
        for(int i=0;i<w.length();i++){
            char ch=w.charAt(i);// this will contain every character of string w
            boolean found=false;
            for(int j=0;j<a.length();j++){
                if(ch==a.charAt(j)){
                    found=true;
                    break;
                }
            }
            if(!found){
                a+=ch;
            }
        }

        return a;
    }

}
