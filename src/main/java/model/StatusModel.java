package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table()

public class StatusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
     //@OneToMany(cascade = CascadeType.ALL, mappedBy = "status")
     // @JoinColumn(name="subtask_id")


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
}
