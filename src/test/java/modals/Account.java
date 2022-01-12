package modals;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Data
@Builder

public class Account {
    private String accountName;
    private String webSite;
    private String type;
    private String phone;
    private String employees;
    private String industry;
    private String parentAccount;
    private String description;
    private String billingStreet;
    private String shippingStreet;
    private String billingCity;
    private String billingStateProvince;
    private String shippingCity;
    private String shippingStateProvince;
    private String billingZipPostalCode;
    private String billingCountry;
    private String shippingZipPostalCode;
    private String shippingCountry;

}
