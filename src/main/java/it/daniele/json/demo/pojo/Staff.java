package it.daniele.json.demo.pojo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(setterPrefix = "with")
public class Staff {

	private String name;
	private int age;
	private String[] position;
	private List<String> skills;
	private Map<String, BigDecimal> salary;

	@Override
	public String toString() {
		return "Class Name: Staff, attributes >>> name: " + name + ", age: " + age + ", position: "
				+ Arrays.toString(position) + ", skills: " + skills + ", salary: " + salary;
	}

}
