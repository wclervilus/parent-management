package ca.cgi.coaching.parent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ca.cgi.coaching.parent.model.entity.Parent;

@Repository
public interface ParentRepository extends JpaRepository<Parent,Long>{}
