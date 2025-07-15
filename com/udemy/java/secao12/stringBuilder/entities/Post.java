package stringBuilder.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date mmoment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(Date mmoment, String title, String content, Integer likes) {
        this.mmoment = mmoment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMmoment() {
        return mmoment;
    }

    public void setMmoment(Date mmoment) {
        this.mmoment = mmoment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }

    public void removeComment(Comment comment){
        comments.remove(comment);

    }
    @Override
    public String toString() {
        StringBuilder sd = new StringBuilder();
        sd.append(title + "\n");
        sd.append(likes + " Likes - "+ sdf.format(mmoment) + "\n");
        sd.append(content + "\n");
        sd.append("Comments: " + "\n");
        for(Comment c: comments){
            sd.append(c.getText() + "\n");

        }
        return sd.toString();

    }
    
}
