package stackOverflow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Answer implements Votable, Commentable {
    private final int id;
    private final String content;
    private final User author;
    private final Question question;
    private boolean isAccepted;
    private final Date creationDate;
    private final List<Comment> comments;
    private final List<Vote> votes;

    public Answer(User author,Question question,String content){
        this.id = generateId();
        this.author = author;
        this.question = question;
        this.content = content;
        this.creationDate = new Date();
        this.votes = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.isAccepted = false;
    }

    private int generateId() {
        return (int) (System.currentTimeMillis()%Integer.MAX_VALUE);
    }

    @Override
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public List<Comment> getComments() {
        return new ArrayList<>(comments);
    }

    @Override
    public void vote(User user, int value) {
        if(value != -1 && value != 1){
            throw new IllegalArgumentException("Vote value must be either 1 or -1");
        }
        votes.removeIf(v->v.getUser().equals(user));
        votes.add(new Vote(user,value));
        author.updateReputation(value*10);
    }

    @Override
    public int getVoteCount() {
        return votes.stream().mapToInt(Vote::getValue).sum();
    }

    public void markAsAccepted(){
        if(isAccepted){
            throw new IllegalStateException("Answer already accepted");
        }
        this.isAccepted = true;
        author.updateReputation(15);
    }

    public int getId(){
        return id;
    }

    public User getAuthor(){
        return author;
    }

    public Question getQuestion(){
        return question;
    }

    public String getContent(){
        return content;
    }

    public Date getCreationDate(){
        return creationDate;
    }

    public boolean isAccepted(){
        return isAccepted;
    }
}
