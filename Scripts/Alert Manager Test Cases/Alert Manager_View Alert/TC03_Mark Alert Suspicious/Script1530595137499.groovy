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

WebUI.click(findTestObject('TC_01-03_AM/i_glyphicon glyphicon-fire'))

WebUI.setText(findTestObject('TC_01-03_AM/textarea_observation'), 'suspious')

WebUI.delay(3)

WebUI.click(findTestObject('TC_04_Pulse/div_select2-drop-mask'))

WebUI.setText(findTestObject('TC_04_Pulse/Obj1'), 'Testing')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('TC_04_Pulse/Obj1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('TC_04_Pulse/button_Suspicious'))

def text = WebUI.getText(findTestObject('TC_01-03_AM/Sucess Message'))

if (text.contains('Suspicious'))
 {
	 WebUI.comment('Alert Marked as Suspious')
}
else
{
WebUI.comment('Alert is Not Marked as Suspious')
}
Alert_Suspious = WebUI.takeScreenshot()


WebUI.delay(3)

