package infosys.jsonb.company;

import java.util.List;

public interface CompanyService {
    void saveDummyData();

    List<CompanyEntity> getResult(String key , String value);
}
