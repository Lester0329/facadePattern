package SoftEng;

public class FrontDesk {

    public void reqValetService(String plateNumber)
    {
        HotelService valet = new Valet(plateNumber);
        valet.doService();
    }
    public void reqHouseService (int roomNumber)
    {
        HotelService houseKeeping = new HouseKeeping(roomNumber);
        houseKeeping.doService();
    }
    public void reqCartService (int numberOfCarts)
    {
        HotelService cart = new Cart(numberOfCarts);
        cart.doService();
    }



}
