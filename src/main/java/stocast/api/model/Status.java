package stocast.api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class Status {

    public Status() {
        author = new Author();
    }

    @JsonProperty
    public String id = "23123";

    @JsonProperty
    public String text;


    public Author author;

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    public class Author {

        @JsonProperty
        public String id = "242424233";

        @JsonProperty
        public String name = "Oscar Wilde";

        @JsonProperty
        public String years = "1854-1900";

        @JsonProperty
        public boolean following = true;
    }
}
