package nazari.sample.crud.mapper;

import nazari.sample.crud.model.Person;
import nazari.sample.crud.model.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "dtoName")
    @Mapping(source = "lastname", target = "dtoLastname")
    PersonDTO personToPersonDTO(Person person);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "dtoName", target = "name")
    @Mapping(source = "dtoLastname", target = "lastname")
    Person personDTOToPerson(PersonDTO personDTO);
}
