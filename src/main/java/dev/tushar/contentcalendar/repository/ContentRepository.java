package dev.tushar.contentcalendar.repository;

import dev.tushar.contentcalendar.model.Content;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends ListCrudRepository<Content, Integer> {
    //List<Content> findAllByContentType(String type);
}
