package tp_note_poo.tp5.model.openweathermap;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OwmRequest {
	private List<Coord> coord = null;
	private List<Weather> weather = null;
	private String base;
	private List<Principal> main = null;
	private Long visibility;
	private List<Wind> wind = null;
	private List<Cloods> cloods = null;
	private Long dt;
	private List<Sys> sys = null;
	private Long timezone;
	private Long id;
	private String name;
	private Long cod;
	
	public List<Coord> getCoord(){
		return coord;
	}
	public void setCoord(List<Coord> coord) {
		this.coord = coord;
	}
	
	public List<Weather> getWeather(){
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	
	public List<Principal> getMain(){
		return main;
	}
	public void setMain(List<Principal> main) {
		this.main = main;
	}
	
	public Long getVisibility() {
		return visibility;
	}
	public void setVisibility(Long visibility) {
		this.visibility = visibility;
	}
	
	public List<Wind> getWind(){
		return wind;
	}
	public void setWind(List<Wind> wind) {
		this.wind = wind;
	}
	
	public List<Cloods> getCloods(){
		return cloods;
	}
	public void setCloods(List<Cloods> cloods) {
		this.cloods = cloods;
	}
	
	public Long getDt() {
		return dt;
	}
	public void setDt(Long dt) {
		this.dt = dt;
	}
	
	public List<Sys> getSys(){
		return sys;
	}
	public void setSys(List<Sys> sys) {
		this.sys = sys;
	}
	
	public Long getTimezone() {
		return timezone;
	}
	public void setTimezone(Long timezone) {
		this.timezone = timezone;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getCod() {
		return cod;
	}
	public void setCod(Long cod) {
		this.cod = cod;
	}
	
	@Override
    public String toString() {
        return "API OpenWeatherMap{ " +
                "coord=" + coord +
                ", weather=" + weather +
                ", base=" + base +
                ", main=" + main +
                ", visibility=" + visibility +
                ", wind=" + wind +
                ", cloods=" + cloods +
                ", dt=" + dt +
                ", sys=" + sys +
                ", timezone=" + timezone +
                ", id=" + id +
                ", name=" + name +
                ", cod=" + cod +
                "}";
    }

}
