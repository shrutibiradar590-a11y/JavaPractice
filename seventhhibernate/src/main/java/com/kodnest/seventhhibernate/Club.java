package com.kodnest.seventhhibernate;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="club")
public class Club {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column
    private String clubName;

    @ManyToMany(mappedBy="clubs")
    private Set<Student> students;

    public Club() {}
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getClubName() { return clubName; }
    public void setClubName(String clubName) { this.clubName = clubName; }
    public Set<Student> getStudents() { return students; }
    public void setStudents(Set<Student> students) { this.students = students; }
}