package HommeTask5;

import javax.persistence.*;
import java.util.List;

/**
 * Created by vasylchenko on 26.06.2017.
 */
@Entity
@Table(name = "TMP_CONTRAGENTGROUP")
public class ContragentGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "crgroup_sequence")
    @SequenceGenerator(name = "crgroup_sequence",
            sequenceName = "sequence_crgroup",
            initialValue = 2,
            allocationSize = 1)
    @Column(name = "crgroupid")
    private int id;

    private String name;

    @ManyToMany
    @JoinTable(name = "TMP_CR_CRGROUPLINK",
            joinColumns = @JoinColumn(name = "GROUP_ID", referencedColumnName = "crgroupid"),
            inverseJoinColumns = {@JoinColumn(name = "CRID", referencedColumnName = "ID"),
                    @JoinColumn(name = "SITEID", referencedColumnName = "SITEID")
            }
    )
    private List<Contragent> contragentList;

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

    public List<Contragent> getContragentList() {
        return contragentList;
    }

    public void setContragentList(List<Contragent> contragentList) {
        this.contragentList = contragentList;
    }

    public ContragentGroup(String name) {
        this.name = name;
    }

    public ContragentGroup() {
    }
}
