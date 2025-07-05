package practice.e2e.entity;

import java.util.Date;

public class Enrollment {
    //    @Id
//    @GeneratedValue
    private Long id;
    private Date enrollmentDate;
//    @ManyToOne
//    @JoinColumn(name = student_id)
    private Long student;
//   @ManyToOne
//    @JoinColumn(name = course_id)
    private Long course;
}
