package rulesvalues.services;

import org.springframework.stereotype.Component;
import rulesvalues.models.Rule;

import java.util.List;

@Component
public interface IRuleService {
    List<Rule> getRules() throws Exception;
    List<Rule> getRules(String key) throws Exception;
    void putRule(Rule rule) throws Exception;
}
