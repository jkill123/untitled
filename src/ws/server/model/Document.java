package ws.server.model;

import java.io.Serializable;

/**
 * @author Pinchuk Yevhen
 * @created 24/03/2020 - 14:53
 */
public class Document implements Serializable {

    private static final long serialVersionUID = 3706210524356387338L;

    private int id;

    private String purpose;

    private Double amount;

    private String accountFrom;

    private String accountTo;

    public Document() {
    }

    public Document(int id, String purpose, Double amount, String accountFrom, String accountTo) {
        this.id = id;
        this.purpose = purpose;
        this.amount = amount;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

    public String getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(String accountTo) {
        this.accountTo = accountTo;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", purpose='" + purpose + '\'' +
                ", amount=" + amount +
                ", accountFrom='" + accountFrom + '\'' +
                ", accountTo='" + accountTo + '\'' +
                '}';
    }
}
