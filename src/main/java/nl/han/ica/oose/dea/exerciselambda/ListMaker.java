package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListMaker {

    /**
     * Create a {@link List} containing only the Persons that are both male and adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only the Persons that are both male and adult
     */
    private static int adultMinAge = 18;
    private Predicate<Person> isAdult = (person) -> person.isAdult(adultMinAge);
    private Predicate<Person> isMale = person -> person.isGender(Gender.MALE);
    private Predicate<Person> isFemale = person -> person.isGender(Gender.FEMALE);

    public List<Person> createAdultList(List<Person> allPerson, Gender gender) {
        if (allPerson == null) {
            return new ArrayList<>();
        }

        return allPerson.stream().filter(isAdult)
                .filter(person -> person.isGender(gender))
                .collect(Collectors.toList());


    }

    public List<Person> createMaleAdultList(List<Person> allPersons) {

        return createAdultList(allPersons, Gender.MALE);
    }

    /**
     * Create a {@link List} containing only the Persons that are both female and adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only the Persons that are both female and adult
     */
    public List<Person> createFemaleAdultList(List<Person> allPersons) {

        return createAdultList(allPersons, Gender.FEMALE);
    }

}
