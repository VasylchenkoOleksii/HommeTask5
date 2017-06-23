package HommeTask5;

import javax.persistence.*;
import java.util.List;


/**
 * Created by vasylchenko on 23.06.2017.
 */
@Entity
@Table(name = "TMP_CONTRAGENT")
@IdClass(ContragentId.class)
public class Contragent {

    @Id
    private Integer id;
    @Id
    private Integer siteid;

    /*@NotNull*/
    @Column(nullable = false)
    private String name;
    private String identycode;

    @OneToOne
    @JoinColumn(name = "ADRESSID")
    private Address address;

    @OneToOne
    @JoinColumn(name = "CATEGORYID")
    private Category category;

    @OneToOne
    @JoinColumn(name = "CONTRAGENTTYPEID")
    private ContragentType contragentType;

    @OneToMany(targetEntity = Account.class, mappedBy = "contragent")
    private List<Account> accountList;


    public Contragent() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSiteid() {
        return siteid;
    }

    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentycode() {
        return identycode;
    }

    public void setIdentycode(String identycode) {
        this.identycode = identycode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ContragentType getContragentType() {
        return contragentType;
    }

    public void setContragentType(ContragentType contragentType) {
        this.contragentType = contragentType;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public Contragent(Integer id,Integer siteid, String name, String identycode, Address address, Category category, ContragentType contragentType) {
        this.id = id;
        this.siteid = siteid;
        this.name = name;
        this.identycode = identycode;
        this.address = address;
        this.category = category;
        this.contragentType = contragentType;
    }
}
