package nazari.sample.crud.service;

import nazari.sample.crud.model.Person;
import nazari.sample.crud.model.PersonDTO;

public interface IPersonService {

    Person saveOrUpdate(PersonDTO personDTO);

    PersonDTO getById(Long id);
}
