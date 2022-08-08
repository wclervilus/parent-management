package ca.cgi.coaching.parent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ca.cgi.coaching.parent.model.entity.Parent;

@Service
public interface ParentService {
	public List<Parent> findAll();
	public Parent save(Parent parent);
	public Parent findById(Long parentId);
	public void deleteById(Long parentId);
}
