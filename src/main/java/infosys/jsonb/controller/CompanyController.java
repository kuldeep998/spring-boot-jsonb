package infosys.jsonb.controller;

import infosys.jsonb.company.CompanyDTO;
import infosys.jsonb.company.CompanyEntity;
import infosys.jsonb.company.CompanyService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/")
    public String welcomeController(HttpServletRequest request) {
        return "Welcome to Company Controller " + new Date();
    }


    @GetMapping("/insert")
    public String insertDummyData(HttpServletRequest request) {
        companyService.saveDummyData();
        return "Dummy data inserted";
    }

    @GetMapping("/get")
    public List<CompanyEntity> getDataBasedOnKey(@RequestParam String key,
                                                 @RequestParam String value,
                                                 HttpServletRequest request) {
        return companyService.getResult(key, value);

    }

}
