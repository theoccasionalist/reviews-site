package reviews;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReviewTest {
	Review underTest = new Review(1L, "", "", "", "", "", "", "", "");

	@Test
	public void shouldGetGetters() {
		String idCheck = String.valueOf(underTest.getId());
		String nameCheck = underTest.getName();
		String titleCheck = underTest.getTitle();
		String imgurlCheck = underTest.getImgurl();
		String reviewCategoryCheck = underTest.getImgurl();
		String contentCheck = underTest.getContent();
		String linkIntroCheck = underTest.getLinkIntro();
		String linkCheck = underTest.getLink();
		String footerCheck = underTest.getFooter();

		assertEquals(idCheck, "1");
		assertEquals(nameCheck, "");
		assertEquals(titleCheck, "");
		assertEquals(imgurlCheck, "");
		assertEquals(reviewCategoryCheck, "");
		assertEquals(contentCheck, "");
		assertEquals(linkIntroCheck, "");
		assertEquals(linkCheck, "");
		assertEquals(footerCheck, "");
	}
}
