package org.tektutor;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.experimental.categories.Categories;


@RunWith(Categories.class)
@Suite.SuiteClasses ({ TestCaseOne.class, TestCaseTwo.class})
@Categories.IncludeCategory( {UnitTest.class} )
public class TestSuite {
}
