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
    public Object showUtilityContents() {
        HashMap<String, Object> mappedValues = new HashMap<>();

        mappedValues.put("sigar object", UtilityPack.getSigarObject());
//        mappedValues.put("formatted decimal places (3.1459, 2) => 3.14", UtilityPack.getFormattedDecimal(3.1459, 2));
//        mappedValues.put("unknown value if not present (\"value present\" ) =>  \"value present\" ", UtilityPack.getUnkownIfValueNotPresent("value present"));
//        mappedValues.put("unknown value if not present (\"\" ) =>  \"unknown\" ", UtilityPack.getUnkownIfValueNotPresent(""));

        return UtilityPack.getSigarObject();
    }
}
