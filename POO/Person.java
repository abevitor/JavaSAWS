package POO;

import java.time.OffsetDateTime;

public class Person {
    private String name;
    private int age;

public String getName() {
    return name;

}

public int getAge() {
    return age;
}

private int lastYearAgeInc = OffsetDateTime.now().getYear();

public Person(String name) {
    this.name = name;
    this.age = 20;
}

public void incAge() {
    if(this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;
    this.age = +1;
    this.lastYearAgeInc = OffsetDateTime.now().getYear();


}


    
}
