package com.boschtest.restservice;


import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import com.boschtest.dao.EnterpriseRepo;
import com.boschtest.model.Enterprise;

@RestController
public class EnterpriseController {

    @Autowired
    EnterpriseRepo repo;


    @RequestMapping("/")
    public String home()
    {
        return "home.jsp";
    }

    @PostMapping(path="/enterprise" , consumes={"application/json"})
    public Enterprise addEnterprise(@RequestBody Enterprise enterprise ) {
        repo.save(enterprise);
        return enterprise;
    }

    @DeleteMapping("/enterprise/{eid}")
    public String deleteEnterprise(@PathVariable long eid)
    {
        Enterprise e = repo.getOne(eid);
        repo.delete(e);
        return "deleted";
    }


    @RequestMapping("/enterprise/{eid}")
    public Optional<Enterprise> getEnterprise(@PathVariable("eid")long  eid)
    {
        return repo.findById(eid);

    }

    @GetMapping(path="/enterprise")
    public List<Enterprise> getEnterprises()
    {
        return repo.findAll();
            
    }


    @PutMapping(path="/enterprise",consumes= {"application/json"})
    public Enterprise saveOrUpdateEnterprise(@RequestBody Enterprise enterprise)
    {
        repo.save(enterprise);
        return enterprise;
    }

    @RequestMapping("/healthcheck")
    public ResponseEntity<String> getHealth(@RequestParam("eid") long  eid)
    {
        Enterprise e =  repo.findById(eid).orElse(null);
        if (e == null ) {
            return new ResponseEntity<String>("{\"ERROR\" : \"not found\"}", HttpStatus.NOT_FOUND);
        }
        else if (e.getHealth()) {
            return new ResponseEntity<String>("{\"HEALTHY\" : \"TRUE\"}", HttpStatus.OK);
        }
        else  {
            return new ResponseEntity<String>("{\"HEALTHY\" : \"FALSE\"}", HttpStatus.OK);
        }
    }

}

