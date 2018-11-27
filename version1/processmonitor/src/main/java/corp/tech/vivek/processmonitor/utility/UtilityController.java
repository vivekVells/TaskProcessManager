package corp.tech.vivek.processmonitor.utility;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author Vivek Vellaiyappan Surulimuthu | vivekvellaiyappans@gmail.com
 */
@RestController
public class UtilityController {
    @GetMapping("/utility")
    public Object verifyWorkingUtilityContents() {
        HashMap<String, Object> mappedUtilityValues = new HashMap<>();

        mappedUtilityValues.put("UtilityPack.getUnkownIfValueNotPresent(\"\"): ", UtilityPack.getUnkownIfValueNotPresent(""));
        mappedUtilityValues.put("UtilityPack.getUnkownIfValueNotPresent(\"Value Present\"): ", UtilityPack.getUnkownIfValueNotPresent("Value Present"));
        mappedUtilityValues.put("UtilityPack.getFormattedDecimal(3.145968, 2): ", UtilityPack.getFormattedDecimal(3.1459, 2));
        mappedUtilityValues.put("UtilityPack.getFormattedDecimal(5.145968, 2): ", UtilityPack.getFormattedDecimal(5.145968, 3));
        
        return mappedUtilityValues;
    }
}

/*
Output:
for verifyWorkingUtilityContents
{
  "UtilityPack.getUnkownIfValueNotPresent(\"\"): ": "unknown",
  "UtilityPack.getUnkownIfValueNotPresent(\"Value Present\"): ": "Value Present",
  "UtilityPack.getFormattedDecimal(5.145968, 2): ": 5.146,
  "UtilityPack.getFormattedDecimal(3.145968, 2): ": 3.15
}
 */