package ru.mannaro.sweater.repos;

import org.springframework.data.repository.CrudRepository;
import ru.mannaro.sweater.domain.Message;

public interface MessageRepo extends CrudRepository<Message, Integer> {

}
