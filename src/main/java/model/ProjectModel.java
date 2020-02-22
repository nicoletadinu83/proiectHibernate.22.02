package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "project")

public class ProjectModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
   // private UserModel user;
    private Date startDate;
    private Date endDate;
    @OneToMany(cascade = CascadeType.ALL)
    //JoinColumn(name = "id_task")
    private List<TaskModel> taskModelList;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }*/

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
