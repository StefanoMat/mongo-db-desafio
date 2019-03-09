package challenge;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;


@Service
public class RecipeComment {
    @Id
    private String id;
    private String comment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
