package nazari.sample.crud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


public class PersonDTO {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("dtoName")
    private String dtoName;
    @JsonProperty("dtoLastname")
    private String dtoLastname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDtoName() {
        return dtoName;
    }

    public void setDtoName(String dtoName) {
        this.dtoName = dtoName;
    }

    public String getDtoLastname() {
        return dtoLastname;
    }

    public void setDtoLastname(String dtoLastname) {
        this.dtoLastname = dtoLastname;
    }
}
