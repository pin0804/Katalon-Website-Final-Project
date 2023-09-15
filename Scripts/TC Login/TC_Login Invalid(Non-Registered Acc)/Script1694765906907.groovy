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

println(email)

def randomNumber = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

def email_baru = email

println('original email: ' + email_baru)

def modified_email = email_baru.replace('123', randomNumber.toString())

println('new email: ' + modified_email)

def randomDefinedNumber = CustomKeywords.'kw.utility.randomNumber.RandomNumberCustom'(6)

println('value random custom defined dari keyword: ' + randomDefinedNumber)

def new_password = randomDefinedNumber

password = new_password

WebUI.openBrowser(GlobalVariable.Browser)

WebUI.waitForElementPresent(findTestObject('Homepage/Our Products/div_HEADPHONES'), 0)

WebUI.click(findTestObject('Homepage/Menu Bar/btn_Sign out_menuUser'))

WebUI.waitForElementVisible(findTestObject('Login/frame_login'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC_RT_Utility/TC_RT_Verify Login Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Login/inpt_username'), modified_email)

WebUI.click(findTestObject('Login/inpt_password'))

WebUI.setText(findTestObject('Login/inpt_password'), password)

if (WebUI.verifyElementNotChecked(findTestObject('Login/Checkbox_remember me'), 0, FailureHandling.OPTIONAL)) {
	// Jika belum dicentang, centang elemen
	WebUI.check(findTestObject('Login/Checkbox_remember me'))
		
	println('Element Remember Me is already checked.')
}

WebUI.click(findTestObject('Login/btn_SIGN IN'))

WebUI.waitForElementVisible(findTestObject('Login/txt_Incorrect user name or password'), 0)

def message = WebUI.getText(findTestObject('Login/txt_Incorrect user name or password'))

println('Massage Appeared : ' + message)

WebUI.closeBrowser()

