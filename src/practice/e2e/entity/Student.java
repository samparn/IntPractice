package practice.e2e.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {
//    @Id
//    @GeneratedValue
    private Long id;
    private String Name;
//    @OneToOne(mappedBy = student, cascade = CascadeType.ALL)
    private Address address;
//    @OneToMany(mappedBy = student, cascade = CascadeType.ALL)
    private List<Enrollment> enrollments = new ArrayList<>();
}
