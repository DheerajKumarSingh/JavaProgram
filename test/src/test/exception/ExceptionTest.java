package test.exception;

import java.awt.List;
import java.util.ArrayList;

public class ExceptionTest {

	public static ArrayList<Country> countryList=new ArrayList<Country>();
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		test.exception.Country country=new Country();
		country.setName("");
		//countryList.add(country);
		try {
			method1();
		}
		catch (CountryNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private static void method1() throws CountryNotFoundException {
		// TODO Auto-generated method stub
		
		throw new CountryNotFoundException("country not found");
		
	}

}
