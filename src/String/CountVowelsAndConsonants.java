package String;

public class CountVowelsAndConsonants {
    public static void main(String [] args){
      String name="kanishk";
      vowelsConsonants(name);

    }
    static void vowelsConsonants(String name){
        int vowel =0;
        int consonants=0;
       char[] str= name.toCharArray();
      for(int i=0;i<str.length;i++){
          if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U'){
              vowel++;
          }
          else{
              consonants++;
          }
      }
       System.out.println(vowel);
        System.out.println(consonants);

    }

}
