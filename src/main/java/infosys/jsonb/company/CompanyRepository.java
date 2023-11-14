package infosys.jsonb.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {

    @Query(value=" select * from company  where reviews ->> ?1 = ?2 ",nativeQuery = true)
     List<CompanyEntity> getResultByKey(String key, String value);
}
