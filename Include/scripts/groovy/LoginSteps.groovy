import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
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

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page_precondition() {
		println " I am inside Given"
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://practicetestautomation.com/practice-test-login/')
	}

	@When('user enters valid {string} and {string}')
	public void user_enters_valid_username_and_password(String username, String password) {
		println "I am inside When"
		WebUI.setText(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Username_username'), username)
		WebUI.setText(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Password_password'), password)
	}

	@And("clicks on login button some more")
	public void clicks_on_login_button_some_more() {
		println " I am inside And"
		WebUI.click(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/button_Submit'))
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		println " I am inside Then"
		WebUI.click(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/a_Log out'))
		WebUI.closeBrowser()
	}
}
