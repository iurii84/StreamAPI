import java.util.*;
import java.util.stream.*;

public class StreamAPI {
   private static List<Person> users = new ArrayList<>();

    public static void main(String[] args) {
        users.add(new Person("Ann", 30, true));
        users.add(new Person("Peter", 25, false));
        users.add(new Person("Katty", 10, false));
        users.add(new Person("Elly", 64, true));
        users.add(new Person("Nick", 9, false));
        users.add(new Person("Patricia", 25, false));


        List<Person> filteredUsers = users.stream().
                filter(user -> user.getAge() >= 10 && user.isMarried())
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());

       // filteredUsers.forEach(System.out :: println);


        List<Person> filteredUsers2 = users.stream()
                .filter(n -> n.getName().startsWith("N"))
                .collect(Collectors.toList());

//        filteredUsers2.forEach(System.out :: println);

        Map<Integer, List<Person>> personByAge = users.stream()
                .collect(Collectors.groupingBy(Person::getAge));

     //   personByAge.forEach((age, p) -> System.out.println("Age is: " + age + p));


        Double avgAge = users.stream()
                .collect(Collectors.averagingInt(Person::getAge));
        //System.out.println(avgAge);


        String phrase = users.stream()
                .filter(p -> p.getAge() >= 18 && p.getAge() < 60)
                .map(Person::getName)
                .collect(Collectors.joining(" and ", "In the univercity ", " are adults"));
        System.out.println(phrase);
    }




}
