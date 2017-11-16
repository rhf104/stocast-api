package stocast.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Statuses {
    @JsonProperty("statuses")
    private final List<Status> statuses;

    public Statuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public static Statuses valueOf(String id) {
        return new Statuses(new ArrayList<Status>(Arrays.asList(new Status())));
    }
}
