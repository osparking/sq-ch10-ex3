package sq_ch10_ex3.dto;

import lombok.Data;

@Data
public class Country {
	private String name;
	private int population;

	public static Country of(String name, int population) {
		Country country = new Country();
		country.setName(name);
		country.setPopulation(population);
		return country;
	}
}
