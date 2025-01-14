package carrentalsystem;

import java.util.Date;

public class PaymentDetails {
    private String paymentId;
    private Date paymentDate;
    private PaymentStatus paymentStatus;
    private ModeOfPayment modeOfPayment;
    private double amountPaid;

    public PaymentDetails(String paymentId, Date paymentDate, ModeOfPayment modeOfPayment, double amountPaid) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.modeOfPayment = modeOfPayment;
        this.amountPaid = amountPaid;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public ModeOfPayment getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(ModeOfPayment modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
}
