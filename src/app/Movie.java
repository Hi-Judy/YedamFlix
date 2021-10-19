package app;

public class Movie {

	private int mvCode;
	private String mTitle;
	private String mActors;
	private String mGenre;
	private String mFeature;
	private String mStoty;
	private String mOpendate;
	private String mGrade;
	
	public int getMvCode() {
		return mvCode;
	}
	public void setMvCode(int mvCode) {
		this.mvCode = mvCode;
	}
	public String getmTitle() {
		return mTitle;
	}
	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}
	public String getmActors() {
		return mActors;
	}
	public void setmActors(String mActors) {
		this.mActors = mActors;
	}
	public String getmGenre() {
		return mGenre;
	}
	public void setmGenre(String mGenre) {
		this.mGenre = mGenre;
	}
	public String getmFeature() {
		return mFeature;
	}
	public void setmFeature(String mFeature) {
		this.mFeature = mFeature;
	}
	public String getmStoty() {
		return mStoty;
	}
	public void setmStoty(String mStoty) {
		this.mStoty = mStoty;
	}
	public String getmOpendate() {
		return mOpendate;
	}
	public void setmOpendate(String mOpendate) {
		this.mOpendate = mOpendate;
	}
	public String getmGrade() {
		return mGrade;
	}
	public void setmGrade(String mGrade) {
		this.mGrade = mGrade;
	}
	@Override
	public String toString() {
		return "Movie [mvCode=" + mvCode + ", mTitle=" + mTitle + ", mActors=" + mActors + ", mGenre=" + mGenre
				+ ", mFeature=" + mFeature + ", mStoty=" + mStoty + ", mOpendate=" + mOpendate + ", mGrade=" + mGrade
				+ "]";
	}
	
}
