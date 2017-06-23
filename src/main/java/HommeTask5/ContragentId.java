package HommeTask5;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;

/**
 * Created by vasylchenko on 23.06.2017.
 */

public class ContragentId implements Serializable {

    private Integer id;
    private Integer siteid;

    public Integer getId() {
        return id;
    }

    public ContragentId(Integer id, Integer siteid) {
        this.id = id;
        this.siteid = siteid;
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


}
