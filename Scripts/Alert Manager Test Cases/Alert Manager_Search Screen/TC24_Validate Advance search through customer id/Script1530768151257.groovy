import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://10.130.236.51/#login')

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('TC_24_36 AM/input'), 'Ankur.Jain')

not_run: WebUI.setText(findTestObject('TC_24_36 AM/input_1'), 'Word02Pass')

not_run: WebUI.sendKeys(findTestObject('TC_24_36 AM/input_1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('TC_24_36 AM/span_Search'))

WebUI.clearText(findTestObject('TC_24_36 AM/Date_input'))

WebUI.click(findTestObject('TC_24_36 AM/Done_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('TC_24_36 AM/button_Advanced Search'))

WebUI.click(findTestObject('TC_24_36 AM/ul_Customer Id'))

WebUI.setText(findTestObject('TC_24_36 AM/input_s2id_autogen7'), findTestData('Feedzai_Automation_TestData').getValue(1, 
        8))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('TC_24_36 AM/input_s2id_autogen7'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('TC_24_36 AM/button_Search'))

WebUI.getText(findTestObject('TC_24_36 AM/Cust_Details'))

WebUI.comment('Customer Details Displayed')

Customer_Details = WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('TC_24_36 AM/Cust_id_Validation'), '1100243850')

WebUI.refresh()

WebUI.delay(12)

