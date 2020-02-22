package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Task")

public class TaskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    @Column(name = "startDate")
    private Date startDateTask;
    private Date endDateTask;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_subtask")
     private List<SubTaskModel> subTaskModelList;

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

    public Date getStartDateTask() {
        return startDateTask;
    }

    public void setStartDateTask(Date startDateTask) {
        this.startDateTask = startDateTask;
    }

    public Date getEndDateTask() {
        return endDateTask;
    }

    public void setEndDateTask(Date endDateTask) {
        this.endDateTask = endDateTask;
    }
}
