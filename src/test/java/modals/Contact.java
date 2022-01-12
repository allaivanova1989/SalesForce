package modals;


import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
public class Contact {
    private String firstName;
    private String lastName;
    private String suffix;
    private String salutation;
    private String accountName;
    private String title;
    private String phone;
    private String mobile;
    private String email;
    private String reportsTo;
    private String mailingStreet;
    private String mailingCity;
    private String mailingStateProvince;
    private String mailingZipPostalCode;
    private String mailingCountry;
    private String fax;
    private String department;

}
