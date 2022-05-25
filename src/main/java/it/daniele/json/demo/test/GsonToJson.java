package it.daniele.json.demo.test;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

import it.daniele.json.demo.pojo.Staff;

public class GsonToJson {

	public static void main(String[] args) {

		Gson gson = new Gson();

		Staff staff = createStaffObject();

		// Java Objects to String
		// String json = gson.toJson(staff);

		// Java objects to File
		try (FileWriter writer = new FileWriter("staff.json")) {
			gson.toJson(staff, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static Staff createStaffObject() {

		Staff staff = new Staff();

		staff.setName("Daniele");
		staff.setAge(30);
		staff.setPosition(new String[] { "Founder", "CTO", "Writer" });
		Map<String, BigDecimal> salary = new HashMap() {
			{
				put("2010", new BigDecimal(10000));
				put("2012", new BigDecimal(12000));
				put("2018", new BigDecimal(14000));
			}
		};
		staff.setSalary(salary);
		staff.setSkills(Arrays.asList("java", "python", "kotlin"));

		return staff;
	}

}
