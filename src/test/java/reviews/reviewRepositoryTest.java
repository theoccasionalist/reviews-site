package reviews;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class reviewRepositoryTest {

	private ReviewRepository underTest;

	private Review firstReview = new Review(1L, "", "", "", "", "", "", "", "");
	private Review secondReview = new Review(2L, "", "", "", "", "", "", "", "");

	@Test
	public void shouldFindFirstReview() {
		underTest = new ReviewRepository(firstReview);
		Review check = underTest.findOne(firstReview.getId());
		assertThat(check, is(firstReview));
	}

	@Test
	public void shouldFindSecondCourse() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Review check = underTest.findOne(secondReview.getId());
		assertThat(check, is(secondReview));
	}

	@Test
	public void shouldFindAll() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Collection<Review> check = underTest.findAll();
		assertThat(check, containsInAnyOrder(firstReview, secondReview));
	}
}
