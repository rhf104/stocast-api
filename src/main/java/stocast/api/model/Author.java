package stocast.api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import stocast.api.model.domain.AuthorEntity;

@JsonInclude(Include.NON_NULL)
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class Author {

    public Author() {

    }

    public Author(AuthorEntity authorEntity) {

    }

    @JsonProperty
    public String id = "242424233";

    @JsonProperty
    public String name = "Oscar Wilde";

    @JsonProperty
    public String years = "1854-1900";

    @JsonProperty
    public boolean following = true;
}
