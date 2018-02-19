package reviews;

public class Review {
	private Long id;
	private String title;
	private String name;
	private String imgurl;
	private String reviewCategory;
	private String content;
	private String linkIntro;
	private String link;
	private String footer;

	public Review(Long id, String title, String name, String imgurl, String reviewCategory, String content,
			String linkIntro, String link, String footer) {
		this.id = id;
		this.title = title;
		this.name = name;
		this.imgurl = imgurl;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.linkIntro = linkIntro;
		this.link = link;
		this.footer = footer;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}

	public String getImgurl() {
		return imgurl;
	}

	public String getReviewCategory() {
		return reviewCategory;
	}

	public String getContent() {
		return content;
	}

	public String getLinkIntro() {
		return linkIntro;
	}

	public String getLink() {
		return link;
	}

	public String getFooter() {
		return footer;
	}
}
