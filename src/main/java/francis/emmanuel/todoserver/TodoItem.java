package francis.emmanuel.todoserver;

public class TodoItem {

    private Integer id;
    private String body;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", body='" + body + '\'' +
                '}';
    }
}
