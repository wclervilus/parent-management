package ca.cgi.coaching.parent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ca.cgi.coaching.parent.model.entity.Parent;
import ca.cgi.coaching.parent.repository.ParentRepository;
@Service
@Transactional
public class ParentServiceImpl implements ParentService {
	private final ParentRepository repository;
	@Autowired
	public ParentServiceImpl(ParentRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Parent> findAll() {
		return repository.findAll();
	}

	@Override
	public Parent save(Parent parent) {
		return repository.save(parent);
	}

	@Override
	public Parent findById(Long parentId) {
		Optional<Parent> oParent=repository.findById(parentId);
		Parent parent=null;
		if (oParent.isPresent()) {
			parent=repository.findById(parentId).get();
		}
		return parent;
	}

	@Override
	public void deleteById(Long parentId) {
		repository.deleteById(parentId);
	}

}
