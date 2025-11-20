package parkinglot.model;

public class Payment extends BaseModel{

    private int paymentNumber;
    private PaymentMode paymentMode;
    private String referenceNumber;
    
    public int getPaymentNumber() {
        return paymentNumber;
    }
    public void setPaymentNumber(int paymentNumber) {
        this.paymentNumber = paymentNumber;
    }
    public PaymentMode getPaymentMode() {
        return paymentMode;
    }
    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
    public String getReferenceNumber() {
        return referenceNumber;
    }
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


}
