package sq_ch10_ex3.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sq_ch10_ex3.dto.Country;

@RestController
public class CountryController {
	@GetMapping("/korea")
	public Country korea() {
		Country c = Country.of("한국", 50);
		return c;
	}
	
	@GetMapping("/all")
	public List<Country> all() {
		Country c = Country.of("한국", 50);
		Country d = Country.of("중국", 1500);
		return List.of(c,d);
	}
	
}
