package ImpJAVAprogrammes;



public class DateValidation {

    public static void main(String[] args) {

        String date = "32/12/2021";

        int dd = Integer.parseInt(date.substring(0, 2));

        int mm = Integer.parseInt(date.substring(3, 5));

        int yyyy = Integer.parseInt(date.substring(6));

        if (yyyy > 1900 && yyyy <= 9999) {

            if (dd > 0 && dd <= 31) {

                if (mm > 0 && mm <= 12) {
                    System.out.println(date + "Date is valid");

                } else {
                    System.out.println(date + "Date is Invalid");

                }
            } else {
                System.out.println(date + "Date is Invalid");

            }

        }
        else{
            System.out.println(date + "Date is Invalid");

        }
    }
}