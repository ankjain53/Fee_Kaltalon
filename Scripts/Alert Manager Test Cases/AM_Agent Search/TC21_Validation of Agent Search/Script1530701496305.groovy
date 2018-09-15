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

WebUI.click(findTestObject('TC_21_AM/Agent_Icon'))

WebUI.delay(2)

WebUI.setText(findTestObject('TC_21_AM/Agent_Search'), findTestData('Feedzai_Automation_TestData').getValue(5, 4))

WebUI.delay(9)

WebUI.setText(findTestObject('TC_21_AM/Agent_Search'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('TC_21_AM/Agent_id_Validation'), '1000002151')

WebUI.getText(findTestObject('TC_21_AM/Agent_Details'))

WebUI.verifyElementPresent(findTestObject('TC_21_AM/Agent_Location'), 0)

WebUI.getText(findTestObject('TC_21_AM/Agent_Activity Period'))

WebUI.getText(findTestObject('TC_21_AM/Agent_Trans Details'))

WebUI.getText(findTestObject('TC_21_AM/Agent_Fraud Details'))

WebUI.getText(findTestObject('TC_21_AM/Agent_Trans History'))

WebUI.verifyElementPresent(findTestObject('TC_21_AM/Agent_Transcation Stats'), 0)

WebUI.delay(2)

WebUI.comment('Agent Search through id is validated')

Agent_Search_id = WebUI.takeScreenshot()

