package  com.hotel.demo.model;


public class Feedback {

	
	private int rating;
	private String feedback;
	
	public Feedback(int rating, String feedback) {
		super();
		this.rating = rating;
		this.feedback = feedback;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
}
