What does WebUI.verifyElementVisible keyword actually do?
=========================================================

Just an essay on some of Katalon Studio keywords.

## Problem to solve

### (1) *a web element is visible* --- what does it actually mean?

What does **WebUI.verifyElementVisible(TestObject)** keyword of
[Katalon Studio](https://www.katalon.com/katalon-studio/) actually do?
Based on what condition does the keyword distinguish a Web element is *visible* or not?


### (2) *a web element is click-able* --- what does it actually mean?

What does **WebUI.verifyElementClickable(TestObject)** keyword actually do?
Base on what condition does the keyword distinguish a Web Element is *click-able* or not?


### (3) `WebUI.verifyElement`*XXX* and `WebUI.waitForElement`*XXX* --- how they differ each other, which one to use

Katalon Studio provides a set of keywords with similar name:

- `WebUI.verifyElementPresent`
- `WebUI.verifyElementVisible`
- `WebUI.verifyElementClickable`
- `WebUI.waitForElementPresent`
- `WebUI.waitForElementVisible`
- `WebUI.waitForElementClickable`

I am not sure how they differ each other. I am not sure which keyword to use for what purpose.


## Solution

### (4)

| [WebUI.verifyElementPresent]() [source]()   | [WebUI.waitForElementPresent()]() [source]()  |
| [WebUI.verifyElementVisible]() [source]()   | [WebUI.waitForElementVisible()]() [source]()  |
| [WebUI.verifyElementClickable]() [source]() | [WebUI.waitForElementClickable()]() [source]()|
