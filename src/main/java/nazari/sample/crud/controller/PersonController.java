package nazari.sample.crud.controller;

import nazari.sample.crud.mapper.PersonMapper;
import nazari.sample.crud.model.Person;
import nazari.sample.crud.model.PersonDTO;
import nazari.sample.crud.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private IPersonService iPersonService;

    /*
     * if you set id=null this method will save your person
     * and if you set id=(any exist id in person table) this method will update your person
     */
    @PostMapping("save-or-update")
    public Person saveOrUpdate(@RequestBody PersonDTO personDTO) {
        return iPersonService.saveOrUpdate(personDTO);
    }

    @GetMapping("get-by-id/{id}")
    public PersonDTO getById(@PathVariable Long id) {
        return iPersonService.getById(id);
    }
}
