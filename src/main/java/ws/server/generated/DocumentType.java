
package ws.server.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="purpose" type="{http://www.pinchuk.com/DocumentSchema}Purpose" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="accountFrom" type="{http://www.pinchuk.com/DocumentSchema}From"/>
 *         &lt;element name="accountTo" type="{http://www.pinchuk.com/DocumentSchema}To"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", namespace = "http://www.pinchuk.com/DocumentSchema", propOrder = {
    "id",
    "purpose",
    "amount",
    "accountFrom",
    "accountTo"
})
public class DocumentType {

    @XmlElement(namespace = "http://www.pinchuk.com/DocumentSchema")
    protected int id;
    @XmlElement(namespace = "http://www.pinchuk.com/DocumentSchema")
    protected String purpose;
    @XmlElement(namespace = "http://www.pinchuk.com/DocumentSchema")
    protected double amount;
    @XmlElement(namespace = "http://www.pinchuk.com/DocumentSchema", required = true)
    protected String accountFrom;
    @XmlElement(namespace = "http://www.pinchuk.com/DocumentSchema", required = true)
    protected String accountTo;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the accountFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountFrom() {
        return accountFrom;
    }

    /**
     * Sets the value of the accountFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountFrom(String value) {
        this.accountFrom = value;
    }

    /**
     * Gets the value of the accountTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTo() {
        return accountTo;
    }

    /**
     * Sets the value of the accountTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTo(String value) {
        this.accountTo = value;
    }

    @Override
    public String toString() {
        return "DocumentType{" +
                "id=" + id +
                ", purpose='" + purpose + '\'' +
                ", amount=" + amount +
                ", accountFrom='" + accountFrom + '\'' +
                ", accountTo='" + accountTo + '\'' +
                '}';
    }
}
