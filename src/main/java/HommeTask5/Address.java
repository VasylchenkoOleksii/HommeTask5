package HommeTask5;

import javax.persistence.*;

/**
 * Created by vasylchenko on 21.06.2017.
 */
@Entity
@Table(name = "TMP_ADDRESS")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_sequence")
    @SequenceGenerator(name = "address_sequence",
            sequenceName = "sequence_addr",
            initialValue = 1,
            allocationSize = 1)
    @Column(name = "addressid")
    private int id;
    private String country;
    private String postcode;
    private String district;
    private String city;
    private String street;
    private String houseno;
    private String flat;

    @OneToOne(mappedBy = "address")
    private Contragent contragent;


    public Address() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public Contragent getContragent() {
        return contragent;
    }

    public void setContragent(Contragent contragent) {
        this.contragent = contragent;
    }
}
