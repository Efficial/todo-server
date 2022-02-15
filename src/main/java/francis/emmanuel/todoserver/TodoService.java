package francis.emmanuel.todoserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Service
public class TodoService {
    private static Logger logger = LoggerFactory.getLogger(TodoService.class);
    private static Integer count = 1;
    private ArrayList<TodoItem> items;

    public TodoService(){
        items = new ArrayList<>();
    }

    public ArrayList<TodoItem> getAll(){
        return items;
    }

    public TodoItem save(TodoItem item) {
        item.setId(count++);
        logger.info("Saving item {}", item.toString());
        items.add(item);
        return item;
    }
}
