package ie.atu.springbootvalidation;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public void savePerson(Person person){
        System.out.println("Person saved:" + person);
    }
}
