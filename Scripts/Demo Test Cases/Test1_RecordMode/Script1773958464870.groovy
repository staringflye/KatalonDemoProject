import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_btn-make-appointment'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username'), 'John Doe')

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Password'))

WebUI.setEncryptedText(findTestObject('Page_CURA Healthcare Service/input_Password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_btn-login'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/label_Medicaid'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_CURA Healthcare Service/span_glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/td_27'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/textarea_Comment'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_CURA Healthcare Service/textarea_Comment'), 'Yes')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_btn-book-appointment'))

WebUI.rightClick(findTestObject('Page_CURA Healthcare Service/p_Comment'))

WebUI.verifyElementText(findTestObject('Page_CURA Healthcare Service/p_Comment'), 'Yes')

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.rightClick(findTestObject('Page_CURA Healthcare Service/a_btn-make-appointment_1'))

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/a_btn-make-appointment_1'), 0)

WebUI.closeBrowser()

