package Date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculosData_Hora {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2025-02-15");
		LocalDateTime d05 = LocalDateTime.parse("2025-02-15T01:30:26");
		Instant d06 = Instant.parse("2025-02-15T01:30:26Z");

		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		LocalDate nextYearsLocalDate = d04.plusYears(7);
		
		System.out.println("ORIGINAL DAY = " + d04);
		System.out.println();
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("NextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("nextYearsLocalDate = " + nextYearsLocalDate);
		System.out.println();
		

		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDateTime);
		System.out.println("pastWeekLocalDate = " + nextWeekLocalDateTime);
		System.out.println();
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		System.out.println();
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);
                
        System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
		
	}

}
