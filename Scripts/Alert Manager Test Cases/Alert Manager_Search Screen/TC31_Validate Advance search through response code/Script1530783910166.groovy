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

WebUI.clearText(findTestObject('TC_24_36 AM/Date_input'))

WebUI.click(findTestObject('TC_24_36 AM/Done_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('TC_24_36 AM/button_Advanced Search'))

WebUI.click(findTestObject('TC_24_36 AM/Click_ResponseCode'))

WebUI.setText(findTestObject('TC_24_36 AM/Input_Respcode'), '00')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('TC_24_36 AM/Input_Respcode'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('TC_24_36 AM/button_Search'))

WebUI.getText(findTestObject('TC_24_36 AM/Cust_Details'))

WebUI.comment('Advance search through Response Code is sucesfull')

Response_Code = WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('TC_24_36 AM/Response_Code_valid'), '00')

WebUI.refresh()

WebUI.delay(12)

