package SoftEng;

class Cart implements HotelService{

    private int numberOfCarts;

    public Cart (int numberOfCarts)
    {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void doService() {
        reqCart();
    }
    private void reqCart()
    {
        System.out.println("Cart: Requesting "+ numberOfCarts + " carts.");
    }

}
