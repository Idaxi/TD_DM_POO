package tp_note_poo.tp5.model.apigouv;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Geometry {
	private String type;
    private ArrayList<Double> coordinates = null;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(ArrayList<Double> coordinates) {
        this.coordinates = coordinates;
    }

}
