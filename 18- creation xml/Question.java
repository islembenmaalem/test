
public class Question {
	static int idstatic = 0;
	private int id;
	private String question;
	private String reponse;

	public Question(String question, String reponse) {
		this.question = question;
		this.reponse = reponse;
		idstatic++;
		id = idstatic;

	}

	public String getId() {
		return Integer.toString(id);
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

}
