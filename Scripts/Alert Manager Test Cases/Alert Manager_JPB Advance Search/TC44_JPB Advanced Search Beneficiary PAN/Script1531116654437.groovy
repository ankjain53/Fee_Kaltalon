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

WebUI.delay(5)

WebUI.click(findTestObject('TC_24_36 AM/button_Advanced Search'))

WebUI.delay(2)

WebUI.click(findTestObject('TC43_46 AM/Input_Ben_PAN'))

WebUI.setText(findTestObject('TC43_46 AM/Input_Ben_PAN'), '116050101014')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('TC43_46 AM/Input_Ben_PAN'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('TC_24_36 AM/button_Search'))

WebUI.getText(findTestObject('TC_24_36 AM/Cust_Details'))

WebUI.comment('JPB Advance Search through Beneficary id is sucesfull')

WebUI.verifyElementText(findTestObject('TC43_46 AM/Ben_PAN_Validation'), '116050101014')

JPBAdvSearch_BenPAN = WebUI.takeScreenshot()

WebUI.refresh()

WebUI.delay(6)

