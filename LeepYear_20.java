class LeapYear_19 {
    public static void main(String[] args) {
        // year we want
        int year = 2004;
        // year is divisiable by 4 it is leep year

        if((year %400 == 0) || ((year % 4 ==0 ) && (year %100 != 0))){
            System.out.println("year" +year+"is leep year");
        }else{
            System.out.println("year" +year+"is not leep year");
        }
    }
}