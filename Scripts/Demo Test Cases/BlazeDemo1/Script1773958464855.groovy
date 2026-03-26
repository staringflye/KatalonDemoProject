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

WebUI.navigateToUrl('https://blazedemo.com/')

WebUI.selectOptionByValue(findTestObject('BlazeDemo/Page_BlazeDemo/select_fromPort'), 'Boston', false)

WebUI.selectOptionByValue(findTestObject('BlazeDemo/Page_BlazeDemo/select_toPort'), 'London', false)

WebUI.click(findTestObject('BlazeDemo/Page_BlazeDemo/input_btn btn-primary'))

WebUI.click(findTestObject('BlazeDemo/Page_BlazeDemo - reserve/input_btn btn-small'))

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/input_First Last'), 'Paul')

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/input_123 Main St'), '123')

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/input_Anytown'), 'Anytown')

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/input_State'), 'BB')

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/input_12345'), '0045')

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/input_Credit Card Number'), '4456465465')

WebUI.setText(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/input_John Smith'), 'Paul V')

WebUI.click(findTestObject('BlazeDemo/Page_BlazeDemo Purchase/input_btn btn-primary'))

WebUI.rightClick(findTestObject('BlazeDemo/Page_BlazeDemo Confirmation/h1_Thank you for your purchase today'))

WebUI.verifyElementText(findTestObject('BlazeDemo/Page_BlazeDemo Confirmation/h1_Thank you for your purchase today'), 'Thank you for your purchase today!')

WebUI.closeBrowser()

