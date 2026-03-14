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

WebUI.navigateToUrl('https://automationstepbystep.blogspot.com/')

WebUI.setText(findTestObject('Page_Automation Step by Step/input_Enter Email1'), 'paulvst@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Automation Step by Step/input_Enter Password'), 'wk1826zyhF2x3KCNNswjoQ==')

WebUI.setEncryptedText(findTestObject('Page_Automation Step by Step/input_Repeat Password'), 'wk1826zyhF2x3KCNNswjoQ==')

WebUI.click(findTestObject('Page_Automation Step by Step/button_Sign Up'))

WebUI.click(findTestObject('Page_Automation Step by Step/div_Sorry, the page you were looking for in this'))

WebUI.rightClick(findTestObject('Page_Automation Step by Step/div_Sorry, the page you were looking for in this'))

WebUI.verifyElementPresent(findTestObject('Page_Automation Step by Step/div_Sorry, the page you were looking for in this'), 
    0)

WebUI.closeBrowser()

