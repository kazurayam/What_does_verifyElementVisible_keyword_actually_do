import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def createTestObject(id, xpath) {
	TestObject to = new TestObject(id)
	return to.addProperty("xpath", ConditionType.EQUALS, xpath)
}

WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com/profile.php#login")

// there is no HTML element located by this TestObject in the page
TestObject tObj = createTestObject("fake", "//a[@id='fake']")

boolean waitResult = WebUI.waitForElementPresent(tObj, 3)
WebUI.comment("waitResutl is ${waitResult}")

boolean verifyResult = WebUI.verifyElementPresent(tObj, 3)
WebUI.comment("verifyResutl is ${waitResult}")

WebUI.closeBrowser()
