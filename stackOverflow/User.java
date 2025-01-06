package stackOverflow;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final int id;
    private final String userName;
    private final String email;
    private int reputation;
    private final List<Question> questions;

    private final List<Answer> answers;
    private final List<Comment> comments;

    private static final int QUESTION_REPUTATION = 5;
    private static final int ANSWER_REPUTATION = 10;

    private static final int COMMENT_REPUTATION = 2;

    public User(int id,String userName,String email){
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.reputation = 0;
        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public Question askQuestion(String title,String content,List<String> tags){
        Question question = new Question(this, title,content, tags);
        questions.add(question);
        updateReputation(QUESTION_REPUTATION);
        return question;
    }

    public Comment addComment(Commentable commentable,String content){
        Comment comment = new Comment(this, content);
        comments.add(comment);
        commentable.add(comment);
        updateReputation(COMMENT_REPUTATION);
        return comment;
    }

    public Answer answerQuestion(Question question,String content){
        Answer answer = new Answer(this,question,content);
        answers.add(answer);
        updateReputation(ANSWER_REPUTATION);
        return answer;
    }

    public synchronized void updateReputation(int value){
        this.reputation += value;
        if(this.reputation<0){
            this.reputation = 0;
        }
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public int getReputation() {
        return reputation;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
