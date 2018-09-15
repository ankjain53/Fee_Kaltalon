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

WebUI.click(findTestObject('TC05-07_AM/a_Merchant'))

WebUI.click(findTestObject('TC05-07_AM/span_Alerts'))

WebUI.click(findTestObject('TC05-07_AM/i_glyphicon glyphicon-eye-open'))

WebUI.delay(2)

WebUI.click(findTestObject('TC05-07_AM/button_Fraud'))

WebUI.delay(3)

WebUI.setText(findTestObject('TC05-07_AM/textarea_observation'), 'Fraud')

WebUI.click(findTestObject('TC05-07_AM/button_Fraud_1'))


def text = WebUI.getText(findTestObject('TC_01-03_AM/Sucess Message'))
if (text.contains('Fraud'))
 {
	  WebUI.comment('Transcation is Marked as Fraud')
}
else
{
WebUI.comment('Transcation is Not Marked as Not Fraud')
}

Transcation_Fraud = WebUI.takeScreenshot()


WebUI.delay(3)

WebUI.verifyElementText(findTestObject('TC05-07_AM/Status_Fraud'), 'Fraud')

WebUI.comment('Transcation Status Verifed')

WebUI.delay(2)

