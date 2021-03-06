package app;

public class Content {
	private String code;
	private String title;
	private String actors;
	private String genre;
	private String feature;
	private String story;
	private String opendate;
	private String grade;
	private String image;
	private String topContent;
	private String mOrTv;
	private String mainContent;
	
	public String getmOrTv() {
		return mOrTv;
	}
	public void setmOrTv(String mOrTv) {
		this.mOrTv = mOrTv;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String i) {
		this.code = i;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getOpendate() {
		return opendate;
	}
	public void setOpendate(String opendate) {
		this.opendate = opendate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTopContent() {
		return topContent;
	}
	public void setTopContent(String topContent) {
		this.topContent = topContent;
	}
	
	public String getMainContent() {
		return mainContent;
	}
	public void setMainContent(String mainContent) {
		this.mainContent = mainContent;
	}
	@Override
	public String toString() {
		return "Content [code=" + code + ", title=" + title + ", actors=" + actors + ", genre=" + genre + ", feature="
				+ feature + ", story=" + story + ", opendate=" + opendate + ", grade=" + grade + ", image=" + image
				+ ", topContent=" + topContent + ", mOrTv=" + mOrTv + ", mainContent=" + mainContent + "]";
	}
	
}
	