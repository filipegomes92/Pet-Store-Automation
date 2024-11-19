package runners;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.GetPetByFindStatusTests;
import tests.GetPetIdTests;
import tests.PostStoreOrderTests;
import tests.PutPetTests;

@RunWith(Categories.class)
@Categories.IncludeCategory(suites.AllTests.class)
@Suite.SuiteClasses({
        PostStoreOrderTests.class,
        GetPetIdTests.class,
        PutPetTests.class,
        GetPetByFindStatusTests.class
})
public class AllTests {

}
