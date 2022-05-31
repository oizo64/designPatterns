package Facade;

public class DeliveryBoxFacade {
    private DeliveryBox deliveryBox;
    private DeliveryBoxSystem deliveryBoxSystem;

    public DeliveryBoxFacade() {
        this.deliveryBox = new DeliveryBox();
        this.deliveryBoxSystem = new DeliveryBoxSystem();
    }
    public void pickupPackage(){
    deliveryBox.getUserData();
    if(deliveryBoxSystem.isUserValidated() && deliveryBoxSystem.isPaymentSecured()){
        deliveryBox.openBox();
    }

    }


}
