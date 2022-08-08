package ca.cgi.coaching.parent.coontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.cgi.coaching.parent.model.entity.Parent;
import ca.cgi.coaching.parent.service.ParentService;

@RestController
@RequestMapping("/api/parents")
public class ParentController {
	private final ParentService service;

	@Autowired
	public ParentController(ParentService service) {
		this.service = service;
	}

	@GetMapping("/")
	public List<Parent> findAll() {
		return service.findAll();
	}

	@PostMapping("/")
	public void save(@RequestBody Parent parent) {
		if (parent.getId() == null) {
			service.save(parent);
		}
	}
	@PutMapping("/")
	public void update(@RequestBody Parent parent) {
		if (parent.getId() >0) {
			service.save(parent);
		}
	}

	@GetMapping("/{parentId}")
	public Parent findById(@PathVariable Long parentId) {
		return service.findById(parentId);
	}
	@DeleteMapping("/{parentId}")
	public void deleteById(@PathVariable Long parentId) {
		 service.deleteById(parentId);
	}
}
