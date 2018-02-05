package rulesvalues.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rulesvalues.models.Rule;
import rulesvalues.persistence.RulesRepository;

import java.util.List;

@Service
public class RuleService implements IRuleService {
    @Autowired
    private RulesRepository rulesRepository;

    public RuleService() {
    }

    @Override
    public List<Rule> getRules() throws Exception {
        return rulesRepository.findAll();
    }

    @Override
    public List<Rule> getRules(String key) throws Exception {
        return rulesRepository.getByKey(key);
    }

    @Override
    public void putRule(Rule rule){
        rulesRepository.save(rule);
    }
}
