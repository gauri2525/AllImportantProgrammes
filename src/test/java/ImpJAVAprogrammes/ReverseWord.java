package ImpJAVAprogrammes;

public class ReverseWord {
    public static void main(String[] args) {

        String s="I love JAVA";
        String[] s1=s.split("\\s");
        String reverseword="";
        System.out.println(s1);

        for (int i= s1.length-1;i>=0;i--){
            String word=s1[i];
            String Rword="";
            {
                for (int j=word.length()-1;j>=0;j--){
                    Rword=Rword+word.charAt(j);
                }
            }

            reverseword=reverseword+Rword+" ";

        }

        System.out.print(reverseword);
    }
}
