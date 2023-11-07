package SoftEng;

public class HotelApp {

    public static void main(String[] args)
    {
        FrontDesk frontDesk = new FrontDesk();
        frontDesk.reqValetService("6843 SQ");
        frontDesk.reqHouseService(12);
        frontDesk.reqCartService(9);
    }
}
