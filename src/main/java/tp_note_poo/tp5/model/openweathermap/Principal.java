package tp_note_poo.tp5.model.openweathermap;

public class Principal {
	private Double temp;
	private Double feels_like;
	private Double temp_min;
	private Double temp_max;
	private Long pressure;
	private Long humidity;
	
	public Double getTemp() {
		return temp;
	}
	public void setTemp(Double temp) {
		this.temp = temp;
	}
	
	public Double getFeels_like() {
		return feels_like;
	}
	public void setFeels_like(Double feels_like) {
		this.feels_like = feels_like;
	}
	
	public Double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(Double temp_min) {
		this.temp_min = temp_min;
	}
	
	public Double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(Double temp_max) {
		this.temp_max = temp_max;
	}
	
	public Long getPressure() {
		return pressure;
	}
	public void setPressure(Long pressure) {
		this.pressure = pressure;
	}
	
	public Long getHumidity() {
		return humidity;
	}
	
	public void setHumidity(Long humidity) {
		this.humidity = humidity;
	}

}
