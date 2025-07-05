package practice.e2e.entity;

import java.util.ArrayList;
import java.util.List;

public class Course {
    //    @Id
//    @GeneratedValue
    private Long id;
    private String title;
//    @OneToMany(mappedBy = "course", cascade= CascadeType.ALL)
    private List<Enrollment> enrollments = new ArrayList<>();
//    @ManyToMany(mappedBy = "courses")
    private List<Professor> professors = new ArrayList<>();
}
