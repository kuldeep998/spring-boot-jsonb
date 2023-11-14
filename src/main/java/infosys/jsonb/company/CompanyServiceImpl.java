package infosys.jsonb.company;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;


    @Override
    public void saveDummyData() {
        CompanyEntity entity = new CompanyEntity();
        entity.setName("kuldeep");
        entity.setTotalEmployee(100);
        entity.setReviews("{'title':'My first day at work','Feeling':'Mixed feeling'}");
        companyRepository.save(entity);
    }

    @Override
    public List<CompanyEntity> getResult(String key , String value) {
        return companyRepository.getResultByKey(key,value);
    }


}
