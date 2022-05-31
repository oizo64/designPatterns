package Facade;

class DeliveryBox {

    boolean isDeliveryBoxFull(){
        System.out.println("DeliveryBox is not full");
        return false;
    }
    boolean isDeliveryBoxBroken(){
        System.out.println("DeliveryBox is not broken");
        return false;
    }
    void getUserData(){
        System.out.println("User data entered.");
    }
    void openBox(){
        System.out.println("Box opened.");
    }
}
