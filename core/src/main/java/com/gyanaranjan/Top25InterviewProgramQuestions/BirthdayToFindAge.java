package com.gyanaranjan.Top25InterviewProgramQuestions;

import java.time.LocalDate;
import java.time.Period;

public class BirthdayToFindAge {
    public static void main(String[] args) {
        LocalDate birthDate=LocalDate.parse("1998-07-08");
        LocalDate currentDate =LocalDate.now();
        Period between = Period.between(birthDate, currentDate);
        System.out.println(between.getYears());
    }
}
