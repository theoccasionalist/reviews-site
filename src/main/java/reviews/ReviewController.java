package reviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository reviewRepo;

	@RequestMapping(value = "reviews")
	public String getAllReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@RequestMapping(value = "review")
	public String getAReview(@RequestParam Long id, Model model) {
		model.addAttribute("reviews", reviewRepo.findOne(id));
		return "review";
	}

}
