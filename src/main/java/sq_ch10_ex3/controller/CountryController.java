package sq_ch10_ex3.controller;

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
	
}
