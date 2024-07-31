package GenericUtils;

import org.testng.annotations.Test;

public class RegisterUsingDataProvider {
	@Test(dataProvider = "dataProviderMethod",dataProviderClass = DataProviderMethod.class)

}
