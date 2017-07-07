package HommeTask5;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by vasylchenko on 16.06.2017.
 */
@Entity
@Table(name = "TMP_CATEGORY")
public class Category {

    private int id;
    private String name;
    private Date synctimestamp;
    private Contragent contragent;

    public Category() {
    }

    public Category(String name, Date synctimestamp) {
        this.name = name;
        this.synctimestamp = synctimestamp;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_sequence")
    @SequenceGenerator(name = "category_sequence",
            sequenceName = "sequence_cat",
            initialValue = 2,
            allocationSize = 1)
    @Column(name = "categoryid")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TIME_CREATE", nullable = false)
    public Date getSynctimestamp() {
        return synctimestamp;
    }

    public void setSynctimestamp(Date synctimestamp) {
        this.synctimestamp = synctimestamp;
    }

    @OneToOne(mappedBy = "category")
    public Contragent getContragent() {
        return contragent;
    }

    public void setContragent(Contragent contragent) {
        this.contragent = contragent;
    }
}
