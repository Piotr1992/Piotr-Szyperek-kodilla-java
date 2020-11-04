
package com.kodilla.good.patterns.challenges;

public class User {

    private String name;
    private String surname;
    private String address;
    private String codePost;
    private String addressEmail;
    private String phone;

    public User(final String name, final String surname, final String address,
                final String codePost, final String addressEmail, final String phone) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.codePost = codePost;
        this.addressEmail = addressEmail;
        this.phone = phone;
    }

    public String getName() { return name; }
    public String getSurname() {
            return surname;
    }
    public String getAddress() { return address; }
    public String getCodePost() { return codePost; }
    public String getAddressEmail() {
        return addressEmail;
    }
    public String getPhone() { return phone; }
}
