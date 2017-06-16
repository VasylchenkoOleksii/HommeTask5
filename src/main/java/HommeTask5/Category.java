package HommeTask5;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by vasylchenko on 16.06.2017.
 */
@Entity
@Table(name = "TMP_CATEGORY")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_sequence")
    @SequenceGenerator(name = "category_sequence",
    sequenceName = "categorysequence",
    initialValue = 1)
    private int id;
    private String name;
    private Date synctimestamp;


    public Category() {
    }

    public Category(int id, String name, Date synctimestamp){
        this.id = id;
        this.name = name;
        this.synctimestamp = synctimestamp;
    }
}
