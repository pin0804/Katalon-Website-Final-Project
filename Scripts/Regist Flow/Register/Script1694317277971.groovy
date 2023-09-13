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

def randomNumbers = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

def username = username + randomNumbers

def randomDefinedNumber = CustomKeywords.'kw.utility.randomNumber.RandomNumberCustom'(6)

println('value random custom defined dari keyword: ' + randomDefinedNumber)

WebUI.openBrowser('https://www.advantageonlineshopping.com/#/')

WebUI.click(findTestObject('Homepage/btn_User'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Homepage/btn_CREATE NEW ACCOUNT'), 0)

WebUI.click(findTestObject('Register Page/txt_CREATE ACCOUNT title'))

WebUI.waitForElementVisible(findTestObject('Register Page/txt_CREATE ACCOUNT title'), 0)

WebUI.verifyElementVisible(findTestObject('Register Page/img_Logo'))

WebUI.verifyElementVisible(findTestObject('Register Page/txt_HOME'))

WebUI.verifyElementVisible(findTestObject('Register Page/txt_CREATE ACCOUNT'))

WebUI.verifyElementVisible(findTestObject('Register Page/txt_info field'))

WebUI.verifyElementVisible(findTestObject('Register Page/txt_ACCOUNT DETAILS'))

println('old username : ' + username)

println('random numbernya : ' + randomNumbers)

println('new username : ' + username)

WebUI.setText(findTestObject('Register Page/inpt__username'), username)

WebUI.setText(findTestObject('Register Page/inpt__email'), email)

println(email)

WebUI.setText(findTestObject('Register Page/inpt__password'), password)

WebUI.setText(findTestObject('Register Page/inpt__confirm_password'), password)

