package stocast.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Status {
    @JsonProperty("statusId")
    private final String id;

    public Status() {

        id = "dklfjs";
    }
}
