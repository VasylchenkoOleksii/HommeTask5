package HommeTask5;
/**/
import javax.persistence.*;

/**
 * Created by vasylchenko on 16.06.2017.
 */
@Entity
@Table(name = "TMP_CONTRAGENTTYPE")
public class ContragentType {

    @Id
    @GeneratedValue
    @Column(name = "CID")
    private String id;

    private String name;

    private int officialtype = 0;

    @OneToOne(mappedBy = "contragentType")
    private Contragent contragent;

    public ContragentType(String id,
                          String name,
                          int officialtype) {
        this.id = id;
        this.name = name;
        this.officialtype = officialtype;
    }

    public ContragentType() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOfficialtype() {
        return officialtype;
    }

    public void setOfficialtype(int officialtype) {
        this.officialtype = officialtype;
    }

    public Contragent getContragent() {
        return contragent;
    }

    public void setContragent(Contragent contragent) {
        this.contragent = contragent;
    }
}
