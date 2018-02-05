package rulesvalues.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import rulesvalues.models.ResponseMessage;
import rulesvalues.models.Rule;
import rulesvalues.services.RuleService;

import javax.validation.Valid;

@RestController
@Component
public class RulesValuesController {
    private final String ROUTE = "/api/rules";

    @Autowired
    private RuleService ruleService;

    public RulesValuesController() { }

    @RequestMapping(value = ROUTE + "/all", method = RequestMethod.GET)
    public @ResponseBody ResponseMessage getAll() {
        try {
            return new ResponseMessage(ruleService.getRules(), true);
        } catch (Exception e) {
            return new ResponseMessage(e.getMessage(), false);
        }
    }

    @RequestMapping(value = ROUTE, method = RequestMethod.PUT)
    public @ResponseBody ResponseMessage saveRule(@Valid @RequestBody Rule rule) {
        try {
            ruleService.putRule(rule);
            return new ResponseMessage(null, true);
        } catch (Exception e) {
            return new ResponseMessage(e.getMessage(), false);
        }
    }


}
