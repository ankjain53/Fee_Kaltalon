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

WebUI.scrollToElement(findTestObject('TC_04_Pulse/button_2'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('TC_04_Pulse/button_2'))

WebUI.delay(4)

WebUI.click(findTestObject('TC_04_Pulse/a_FIS Input Adapter'))

WebUI.scrollToElement(findTestObject('TC_04_Pulse/div_true'), 0)

WebUI.click(findTestObject('TC_04_Pulse/div_true'))

WebUI.setText(findTestObject('TC_04_Pulse/input_conf_value'), 'true')

WebUI.click(findTestObject('TC_04_Pulse/i_fa fa-check-circle-o fa-colo'))

WebUI.scrollToElement(findTestObject('TC_04_Pulse/a_Save'), 0)

WebUI.click(findTestObject('TC_04_Pulse/a_Save'))

WebUI.comment('Time Machine is Enabled')

EnableTimeMachine = WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('TC_04_Pulse/Logout'), 0)

WebUI.click(findTestObject('TC_04_Pulse/Logout'))

WebUI.delay(3)

WebUI.click(findTestObject('TC_04_Pulse/a_Logout'))

WebUI.comment('Logout of Pulse Application')

WebUI.closeBrowser()

