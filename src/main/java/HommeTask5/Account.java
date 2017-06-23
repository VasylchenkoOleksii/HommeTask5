package HommeTask5;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by vasylchenko on 23.06.2017.
 */
@Entity
@Table(name = "TMP_ACCOUNT")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_sequence")
    @SequenceGenerator(name = "account_sequence",
            sequenceName = "sequence_account",
            initialValue = 1,
            allocationSize = 1)
    @Column(name = "ACCOUNTID")
    private Integer id;

    @ManyToOne
    @JoinColumns(
            {@JoinColumn(name = "CONTRAGENTID", referencedColumnName = "ID"),
                    @JoinColumn(name = "SITEID", referencedColumnName = "SITEID")
            }
    )
    private Contragent contragent;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SYNCTIMESTAMP", nullable = false)
    private Date timeChange;

    @Column(nullable = false)
    private String accountno;

    private Date dateopen;

    @Column(name = "SUMMANOW", nullable = false)
    private BigDecimal summa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Contragent getContragent() {
        return contragent;
    }

    public void setContragent(Contragent contragent) {
        this.contragent = contragent;
    }

    public Date getTimeChange() {
        return timeChange;
    }

    public void setTimeChange(Date timeChange) {
        this.timeChange = timeChange;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public Date getDateopen() {
        return dateopen;
    }

    public void setDateopen(Date dateopen) {
        this.dateopen = dateopen;
    }

    public BigDecimal getSumma() {
        return summa;
    }

    public void setSumma(BigDecimal summa) {
        this.summa = summa;
    }

    public Account() {

    }

    public Account(Contragent contragent, Date timeChange, String accountno, Date dateopen, BigDecimal summa) {
        this.contragent = contragent;
        this.timeChange = timeChange;
        this.accountno = accountno;
        this.dateopen = dateopen;
        this.summa = summa;
    }
}
