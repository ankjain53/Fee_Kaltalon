import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(findTestData('Feedzai_Automation_TestData').getValue(4, 1))

WebUI.setText(findTestObject('Pulse_Login/input'), findTestData('Feedzai_Automation_TestData').getValue(1, 1))

WebUI.setText(findTestObject('Pulse_Login/input_1'), findTestData('Feedzai_Automation_TestData').getValue(2, 1))

WebUI.click(findTestObject('Pulse_Login/button_Sign In'))

WebUI.comment('Pulse Login Sucesfully')

