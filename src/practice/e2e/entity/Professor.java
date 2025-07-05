package practice.e2e.entity;

import java.util.List;

public class Professor {
    //    @Id
//    @GeneratedValue
    private Long id;
    private String name;
//    @ManyToMany
//    @JoinTable(
//    name = "professor_couse",
//    joinColumns = @JoinColumn(name = "professor_id")
//    inverseColumns = @JoinColumn(name = course_id) )
private List<Course> courses;


}
