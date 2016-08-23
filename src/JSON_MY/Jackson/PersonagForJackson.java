package JSON_MY.Jackson;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 * Created by Admin on 23.08.2016.
 */
@JsonIgnoreProperties("toIgnore")
@JsonPropertyOrder({"name","id"})
public class PersonagForJackson {
    @JsonProperty("id")
    private int id =1;
    @JsonProperty("name")
    private String name = "A";
    @JsonIgnore
    private int toIgnore = 29;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getToIgnore() {
        return toIgnore;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonagForJackson{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", toIgnore=").append(toIgnore);
        sb.append('}');
        return sb.toString();
    }

    public void setToIgnore(int toIgnore) {
        this.toIgnore = toIgnore;
    }
}
