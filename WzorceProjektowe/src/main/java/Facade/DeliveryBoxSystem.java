package Facade;

class DeliveryBoxSystem {
    void sendNotification(){
        System.out.println("SMS sent to client");
    }
    boolean isPaymentSecured(){
        System.out.println("Payment is secured");
        return true;
    }
    boolean isUserValidated(){
        System.out.println("User has been validated.");
        return true;
    }
    void scheduleDelivery(){
        System.out.println("Delivery has been scheduled");
    }
}
