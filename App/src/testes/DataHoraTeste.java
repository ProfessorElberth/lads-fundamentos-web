package testes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataHoraTeste {

	public static void main(String[] args) {
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String minhaData = "31/12/2021";
		LocalDate dataFimDeAno = LocalDate.parse(minhaData, formatoData);

		System.out.println(dataFimDeAno.format(formatoData));

		LocalDate data = LocalDate.of(1978, 8, 24); 
		LocalTime hora = LocalTime.of(8, 15);
		LocalDateTime dataHora = LocalDateTime.of(2021, 6, 16, 7, 15);
		
		LocalDate dataHoje = LocalDate.now();
		LocalTime horaHoje = LocalTime.now();
		LocalDateTime dataHoraHoje = LocalDateTime.now();
		
		System.out.println(data);
		System.out.println(hora);
		System.out.println(dataHora);
		System.out.println(dataHoje);
		System.out.println(dataHoraHoje);
		System.out.println(horaHoje);
	}
}