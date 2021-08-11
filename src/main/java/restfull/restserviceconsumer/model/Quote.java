package restfull.restserviceconsumer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * created by Atiye Mousavi
 * Date: 8/7/2021
 * Time: 12:39 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Quote {
    private String type;
    private Value value;



}
