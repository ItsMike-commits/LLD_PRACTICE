package parkinglot.model;

import java.sql.Date;
import java.util.List;

public class Bill extends BaseModel {
    private int billNumber;
    private Ticket ticket;
    private Date exitTime;
    private List<Payment> payments;
    
    public int getBillNumber() {
        return billNumber;
    }
    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public Date getExitTime() {
        return exitTime;
    }
    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }
    public List<Payment> getPayments() {
        return payments;
    }
    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
    

}
