package SoftEng;

class HouseKeeping implements HotelService{

   private Integer roomNumber;

   public HouseKeeping(int roomNumber)
   {
       this.roomNumber = roomNumber;
   }

   @Override
   public void doService()
   {
       cleanRoom();
   }
   private void cleanRoom()
   {
       System.out.println("HouseKeeping: Cleaning room " + roomNumber + " now.");
   }
}
