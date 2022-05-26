package Controle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class ValidacaoDATA {

	public static boolean isDate(String strDate) {
		
		String dateFormat = "dd/MM/uuuu";

		DateTimeFormatter formatarData = DateTimeFormatter.ofPattern(dateFormat).withResolverStyle(ResolverStyle.STRICT);	
		
		try {
			LocalDate date = LocalDate.parse(strDate, formatarData);
			LocalDate hoje = LocalDate.now();
		
			return date.compareTo(hoje) <= 0;

		} catch (DateTimeParseException e) {
			
			return false;
		}
		
	}

}
