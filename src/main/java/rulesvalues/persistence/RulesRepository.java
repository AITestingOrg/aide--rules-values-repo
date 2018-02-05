package rulesvalues.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import rulesvalues.models.Rule;

import java.util.List;

public interface RulesRepository extends MongoRepository<Rule, String> {

    List<Rule> getByKey(String key);
}
