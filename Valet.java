package SoftEng;

class Valet implements HotelService{

    private String plateNumber;

    public Valet(String plateNumber)
    {
        this.plateNumber = plateNumber;
    }

    @Override
    public void doService()
    {
        getVehicle();
    }
    private void getVehicle()
    {
        System.out.println("Valet: Getting vehicle with a plate number of: " +plateNumber);
    }

}
