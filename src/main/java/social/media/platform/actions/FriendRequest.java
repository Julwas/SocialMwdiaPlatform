package social.media.platform.actions;

import social.media.platform.users.User;

public class FriendRequest {
    private User sender;
    private User receiver;
    private String date;
    private String answer;

    public FriendRequest(User sender, User receiver, String date, String answer) {
        this.sender = sender;
        this.receiver = receiver;
        this.date = date;
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void displayRequest() {
        System.out.println(sender.getUsername() + " sent a friend request to " + receiver.getUsername() + getDate());
        if (answer.equals("accept")){
            System.out.println(" You are friends.");
        }else {
            System.out.println(" Friend request are not accept.");
        }
    }

   /* public void displayAnswerRequest() {
        System.out.println(receiver.getUsername() + answer + " a friend request to " + sender.getUsername());
    }*/
}
