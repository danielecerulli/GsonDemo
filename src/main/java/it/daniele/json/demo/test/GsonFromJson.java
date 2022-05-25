package it.daniele.json.demo.test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

import it.daniele.json.demo.pojo.Staff;

public class GsonFromJson {

	public static void main(String[] args) {

		Gson gson = new Gson();

		try (Reader reader = new FileReader("staff.json")) {

			// Convert JSON File to Java Object
			Staff staff = gson.fromJson(reader, Staff.class);

			// print staff object
			System.out.println(staff);

			// Pretty print mode
			// Gson gson = new GsonBuilder().setPrettyPrinting().create();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
