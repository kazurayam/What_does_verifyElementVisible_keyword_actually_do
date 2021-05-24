import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def createTestObject(id, xpath) {
	TestObject to = new TestObject(id)
	return to.addProperty("xpath", ConditionType.EQUALS, xpath)
}

WebUI.openBrowser('')
WebUI.navigateToUrl("https://duckduckgo.com/")

// there is no HTML element located by this TestObject in the page
def xpath = "//div[@id='search_elements_hidden']"
TestObject tObj = createTestObject("hidden_div", xpath)

boolean presence = WebUI.verifyElementPresent(tObj, 3)
WebUI.comment("presence is ${presence}")

WebDriver driver = DriverFactory.getWebDriver()
WebElement el = driver.findElement(By.xpath(xpath))
println "el is present: ${el != null}"
println "el is displayed: ${el.isDisplayed()}"

boolean visibility = WebUI.verifyElementVisible(tObj)
WebUI.comment("visiblity is ${visibility}")

WebUI.closeBrowser()
