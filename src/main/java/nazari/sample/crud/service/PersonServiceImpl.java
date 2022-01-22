package nazari.sample.crud.service;

import nazari.sample.crud.mapper.PersonMapper;
import nazari.sample.crud.model.Person;
import nazari.sample.crud.model.PersonDTO;
import nazari.sample.crud.repository.IPersonDao;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {

    private final IPersonDao iPersonDao;

    public PersonServiceImpl(IPersonDao iPersonDao) {
        this.iPersonDao = iPersonDao;
    }

    @Override
    public Person saveOrUpdate(PersonDTO personDTO) {
        Person person = PersonMapper.INSTANCE.personDTOToPerson(personDTO);
        return iPersonDao.save(person);
    }

    @Override
    public PersonDTO getById(Long id) {
        Person person = iPersonDao.findById(id).orElse(null);
        return PersonMapper.INSTANCE.personToPersonDTO(person);
    }
}
