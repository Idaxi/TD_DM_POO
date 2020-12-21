package tp_note_poo.tp5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import tp_note_poo.tp5.model.apigouv.Geometry;
import tp_note_poo.tp5.model.apigouv.GovRequest;
import tp_note_poo.tp5.model.openweathermap.Principal;
import tp_note_poo.tp5.model.openweathermap.Weather;

public class MeteoController {
    private GovRequest request;
    private Weather owmRequest;

    private String apigouv = "https://api-adresse.data.gouv.fr/search/?q=";
    private String openweathermap = "api.openweathermap.org/data/2.5/weather?lat=";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/meteo")
    public String postMeteo(@RequestParam("address") String search, Model model) {
        request = restTemplate.getForObject(apigouv + search, GovRequest.class);

        tp_note_poo.tp5.model.apigouv.Properties properties = request.getFeatures().get(0).getProperties();
        Geometry geometry = request.getFeatures().get(0).getGeometry();

        model.addAttribute("search", search);
        model.addAttribute("label", properties.getLabel());

        List<Double> coords = geometry.getCoordinates();

        String owm = openweathermap + coords.get(1) + "&lon=" + coords.get(0) + "&appid=173e4699c0ed257438d194d6c4c2e4ce";

        owmRequest = restTemplate.getForObject(owm, 	Weather.class);

        Principal principal = owmRequest.getPrincipal();

        model.addAttribute("humidity", principal.getHumidity() * 100);
        model.addAttribute("temp", principal.getTemp());
        model.addAttribute("main", owmRequest.getMain());

        return "meteo";
    }
}
