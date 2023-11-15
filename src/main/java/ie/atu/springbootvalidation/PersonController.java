package ie.atu.springbootvalidation;

import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/person")
@RestController
import org.springframework.web.bind.annotation.PostMapping;

public class PersonController {
  private final PersonService personService;

  publicController(PersonService personService){this.personService = personService;}

  @GetMapping("/{employeeId}")

  @PostMapping("/createPerson")


          public ResponseEntity<?> getPerson(@PathVariable String employeeId) {
    if (employeeId.length()>5 || employeeId.isBlank()){
      return ResponseEntity.badRequest().body("EmployeeId is invalid");

      if(person == null) {
        return ResponseEntity.notFound().build();
      }

      return ResponseEntity.ok(person);

    }
  }

    PostMapping("/")

}
