package rulesvalues.models;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

public class Rule {
    @Id
    private String id;

    @NotNull
    @NotEmpty
    private String key;

    @NotNull
    @NotEmpty
    private String value;

    public Rule(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
