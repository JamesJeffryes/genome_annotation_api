
package us.kbase.genomeannotationapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: GetFeatureInfoHackResult</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "features"
})
public class GetFeatureInfoHackResult {

    @JsonProperty("features")
    private List<FeatureData> features;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("features")
    public List<FeatureData> getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(List<FeatureData> features) {
        this.features = features;
    }

    public GetFeatureInfoHackResult withFeatures(List<FeatureData> features) {
        this.features = features;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((("GetFeatureInfoHackResult"+" [features=")+ features)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
