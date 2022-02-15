package francis.emmanuel.todoserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?> createRequest(@RequestBody TodoItem item){
        item = service.save(item);
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

}
