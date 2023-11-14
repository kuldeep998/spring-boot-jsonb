package infosys.jsonb.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {
    private Long id;
    private String name;
    private int totalEmployee;
//    private Review reviews;
//
//    @Data
//    @AllArgsConstructor
//    @NoArgsConstructor
//    @ToString
//    public class Review {
//        private String title;
//        private String feeling;
//    }
}
