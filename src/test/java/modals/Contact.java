package modals;

public class Contact {
    private String firstName;
    private String lastName;
    private String salutation;
    private String accountName;
    private String title;
    private String phone;
    private String mobile;
    private String email;
    private String reportsTo;
    private String MailingStreet;
    private String MailingCity;
    private String mailingStateProvince;
    private String mailingZipPostalCode;
    private String mailingCountry;
    private String otherStreet;
    private String otherCity;
    private String otherStateProvince;
    private String otherZipPostalCode;
    private String otherCountry;
    private String fax;
    private String homePhone;
    private String otherPhone;
    private String asstPhone;
    private String assistant;
    private String department;
    private String leadSource;
    private String Birthdate;
    private String description;

    public Contact(String firstName, String lastName, String salutation, String accountName, String title, String phone, String mobile, String email, String reportsTo, String mailingStreet, String mailingCity, String mailingStateProvince, String mailingZipPostalCode, String mailingCountry, String otherStreet, String otherCity, String otherStateProvince, String otherZipPostalCode, String otherCountry, String fax, String homePhone, String otherPhone, String asstPhone, String assistant, String department, String leadSource, String birthdate, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salutation = salutation;
        this.accountName = accountName;
        this.title = title;
        this.phone = phone;
        this.mobile = mobile;
        this.email = email;
        this.reportsTo = reportsTo;
        MailingStreet = mailingStreet;
        MailingCity = mailingCity;
        this.mailingStateProvince = mailingStateProvince;
        this.mailingZipPostalCode = mailingZipPostalCode;
        this.mailingCountry = mailingCountry;
        this.otherStreet = otherStreet;
        this.otherCity = otherCity;
        this.otherStateProvince = otherStateProvince;
        this.otherZipPostalCode = otherZipPostalCode;
        this.otherCountry = otherCountry;
        this.fax = fax;
        this.homePhone = homePhone;
        this.otherPhone = otherPhone;
        this.asstPhone = asstPhone;
        this.assistant = assistant;
        this.department = department;
        this.leadSource = leadSource;
        Birthdate = birthdate;
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getMailingStreet() {
        return MailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        MailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return MailingCity;
    }

    public void setMailingCity(String mailingCity) {
        MailingCity = mailingCity;
    }

    public String getMailingStateProvince() {
        return mailingStateProvince;
    }

    public void setMailingStateProvince(String mailingStateProvince) {
        this.mailingStateProvince = mailingStateProvince;
    }

    public String getMailingZipPostalCode() {
        return mailingZipPostalCode;
    }

    public void setMailingZipPostalCode(String mailingZipPostalCode) {
        this.mailingZipPostalCode = mailingZipPostalCode;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }

    public String getOtherStateProvince() {
        return otherStateProvince;
    }

    public void setOtherStateProvince(String otherStateProvince) {
        this.otherStateProvince = otherStateProvince;
    }

    public String getOtherZipPostalCode() {
        return otherZipPostalCode;
    }

    public void setOtherZipPostalCode(String otherZipPostalCode) {
        this.otherZipPostalCode = otherZipPostalCode;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public void setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    public String getAsstPhone() {
        return asstPhone;
    }

    public void setAsstPhone(String asstPhone) {
        this.asstPhone = asstPhone;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String birthdate) {
        Birthdate = birthdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
