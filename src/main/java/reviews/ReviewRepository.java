package reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
	Map<Long, Review> reviewRepository = new HashMap<>();

	// MTV Amp
	String titleAmp = "Seventh Grade Adult";
	String nameAmp = "MTV's Amp";
	String imageurlAmp = "MtvsAmpAlbum1.jpg";
	String reviewCategoryAmp = "Albums";
	String contentAmp = "I got a copy of this cd in seventh grade.  This album was my introduction to Aphex Twin.*";
	String linkIntroAmp = "Take a Listen";
	String linkAmp = "https://www.youtube.com/watch?v=0LGB-mDFadQ";
	String footerAmp = "*You never outgrow seventh grade.";

	// Bathrooms
	String titleBR = "Porcelain Throne";
	String nameBR = "Best Men's Room in Columbus";
	String imageurlBR = "wccim.jpg";
	String reviewCategoryBR = "Bathrooms";
	String contentBR = "Clean, Private, Secure.*";
	String linkIntroBR = "Enroll Now!";
	String linkBR = "https://wecancodeit.org/";
	String footerBR = "*And Oh So Divine.";

	// Cat
	String titleCat = "Meowth";
	String nameCat = "Philip 2420 Esq.";
	String imageurlCat = "Phil1.jpg";
	String reviewCategoryCat = "Cats";
	String contentCat = "I got this cat when I was twenty-eight.  This cat loves me.*";
	String linkIntroCat = "Buy Him Food";
	String linkCat = "http://www.greenpantry.co.uk/shop/british-banquet/";
	String footerCat = "*But he loves himself more.";

	// Website
	String titleSite = "I Am This";
	String nameSite = "this.site = site";
	String imageurlSite = "capture.jpg";
	String reviewCategorySite = "Websites";
	String contentSite = "I made this site when I was thirty-five. This site was my introduction to MVC.*";
	String linkIntroSite = "Take a Look";
	String linkSite = "http://localhost:8080/review?id=4";
	String footerSite = "*This website might not be a thing according to my definition of 'thing'.";

	public ReviewRepository() {
		Review amp = new Review(1L, titleAmp, nameAmp, imageurlAmp, reviewCategoryAmp, contentAmp, linkIntroAmp,
				linkAmp, footerAmp);
		Review bathroom = new Review(2L, titleBR, nameBR, imageurlBR, reviewCategoryBR, contentBR, linkIntroBR, linkBR,
				footerBR);
		Review cat = new Review(3L, titleCat, nameCat, imageurlCat, reviewCategoryCat, contentCat, linkIntroCat,
				linkCat, footerCat);
		Review site = new Review(4L, titleSite, nameSite, imageurlSite, reviewCategorySite, contentSite, linkIntroSite,
				linkSite, footerSite);

		reviewRepository.put(amp.getId(), amp);
		reviewRepository.put(bathroom.getId(), bathroom);
		reviewRepository.put(cat.getId(), cat);
		reviewRepository.put(site.getId(), site);
	}

	private void populateReviewMap(Review... reviews) {
		for (Review review : reviews) {
			this.reviewRepository.put(review.getId(), review);
		}
	}

	public ReviewRepository(Review... reviews) {
		populateReviewMap(reviews);
	}

	public Review findOne(Long reviewId) {
		return reviewRepository.get(reviewId);
	}

	public Collection<Review> findAll() {
		return reviewRepository.values();
	}
}
