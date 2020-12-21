package tp_note_poo.tp5.model.apigouv;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Feature {
    private String type;
    private Geometry geometry;
    private Properties properties;
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

	public Geometry getGeometry() {
        return geometry;
    }

	public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
