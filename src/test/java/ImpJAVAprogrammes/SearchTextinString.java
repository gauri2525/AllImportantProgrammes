package ImpJAVAprogrammes;

public class SearchTextinString {

    public static void main(String[] args) {


        String para = " Hi I am Supriya";

        String searchtext = "Supriya";

        if (para.indexOf(searchtext) != -1) {
            System.out.println("The provided serachtext is available  in the string ");
        } else {
            System.out.println("The provided serachtext is not available  in the string ");
        }
    }


}
