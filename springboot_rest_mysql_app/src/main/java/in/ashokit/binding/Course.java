package in.ashokit.binding;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "COURSE_DTLS")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String name;
    private double price;

}
