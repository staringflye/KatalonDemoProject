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

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/CheckpointTwo'), true)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.airbnb.com.au/')

WebUI.setText(findTestObject('Airbnb/Page_Airbnb  Holiday rentals, cabins, beach_81905a/input_Search destinations'), city)

WebUI.click(findTestObject('Airbnb/Page_Airbnb  Holiday rentals, cabins, beach_81905a/b_Brisbane'))

WebUI.click(findTestObject('Airbnb/Page_Airbnb  Holiday rentals, cabins, beach_81905a/button_1, Wednesday, April 2026. Available Selec'))

WebUI.click(findTestObject('Airbnb/Page_Airbnb  Holiday rentals, cabins, beach_81905a/span_2 days'))

WebUI.click(findTestObject('Airbnb/Page_Airbnb  Holiday rentals, cabins, beach_81905a/div_Add guests'))

WebUI.click(findTestObject('Airbnb/Page_Airbnb  Holiday rentals, cabins, beach_81905a/svg_presentation'))

WebUI.doubleClick(findTestObject('Airbnb/Page_Airbnb  Holiday rentals, cabins, beach_81905a/svg_presentation'))

WebUI.click(findTestObject('Airbnb/Page_Airbnb  Holiday rentals, cabins, beach_81905a/div_Search_1'))

WebUI.rightClick(findTestObject('Airbnb/Page_Airbnb  Brisbane  Holiday Rentals  Pla_6cf3ec/span_Over 1,000 homes in Brisbane'))

WebUI.verifyElementPresent(findTestObject('Airbnb/Page_Airbnb  Brisbane  Holiday Rentals  Pla_6cf3ec/span_Over 1,000 homes in Brisbane'), 
    0)

WebUI.closeBrowser()

