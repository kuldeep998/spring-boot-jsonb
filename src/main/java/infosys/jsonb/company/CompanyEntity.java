package infosys.jsonb.company;
import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;

@Entity
@Table(name = "company")
@Data
public class CompanyEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int totalEmployee;

    @Column(columnDefinition = "jsonb")
    private String reviews;
}
