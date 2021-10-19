package app;

public class TV {
	private int tvCode;
	private String tTitle;
	private String tActors;
	private String tGenre;
	private String tFeature;
	private String tStory;
	private String tOpendate;
	private String tGrade;
	
	public int getTvCode() {
		return tvCode;
	}
	public void setTvCode(int tvCode) {
		this.tvCode = tvCode;
	}
	public String gettTitle() {
		return tTitle;
	}
	public void settTitle(String tTitle) {
		this.tTitle = tTitle;
	}
	public String gettActors() {
		return tActors;
	}
	public void settActors(String tActors) {
		this.tActors = tActors;
	}
	public String gettGenre() {
		return tGenre;
	}
	public void settGenre(String tGenre) {
		this.tGenre = tGenre;
	}
	public String gettFeature() {
		return tFeature;
	}
	public void settFeature(String tFeature) {
		this.tFeature = tFeature;
	}
	public String gettStoty() {
		return tStory;
	}
	public void settStoty(String tStoty) {
		this.tStory = tStoty;
	}
	public String gettOpendate() {
		return tOpendate;
	}
	public void settOpendate(String tOpendate) {
		this.tOpendate = tOpendate;
	}
	public String gettGrade() {
		return tGrade;
	}
	public void settGrade(String tGrade) {
		this.tGrade = tGrade;
	}
	@Override
	public String toString() {
		return "TV [tvCode=" + tvCode + ", tTitle=" + tTitle + ", tActors=" + tActors + ", tGenre=" + tGenre
				+ ", tFeature=" + tFeature + ", tStoty=" + tStory + ", tOpendate=" + tOpendate + ", tGrade=" + tGrade
				+ "]";
	}
	
}
