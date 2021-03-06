package challenge;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/recipe")

public class RecipeController {

	@Autowired
	private RecipeService service;

	@PostMapping
	public Recipe save(@RequestBody Recipe recipe) {
		return service.save(recipe);
	}

	@PutMapping(value = "/{id}")
	public void update(@PathVariable String id, @RequestBody Recipe recipe) {
		service.update(id, recipe);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable String id) {
		service.delete(id);
	}

	@GetMapping(value = "/{id}")
	public Optional<Recipe> get(@PathVariable String id) {
		return service.get(id);
	}

	@GetMapping(value = "/ingredient")
	public List<Recipe> listByIngredient(@RequestParam String ingredient) {
		return service.listByIngredient(ingredient);
	}

	@GetMapping(value = "/search")
	public List<Recipe> search(@RequestParam String search) {
		return service.search(search);
	}

	@PostMapping(value = "/{id}/like/{userId}")
	public void like(@PathVariable String id, @PathVariable String userId) {
		service.like(id, userId);
	}

	@RequestMapping(value="/{id}/like/{userId}",method={RequestMethod.GET,RequestMethod.DELETE})
	public void unlike(@PathVariable String id, @PathVariable String userId) {
		service.unlike(id, userId);
	}

	@PostMapping("/{id}/comment")
	public RecipeComment addComment(@PathVariable String id, @RequestBody RecipeComment comment) {
		return service.addComment(id, comment);
	}

	public void updateComment() {
		service.updateComment(null, null, null);
	}

	public void deleteComment() {
		service.deleteComment(null, null);
	}

}
