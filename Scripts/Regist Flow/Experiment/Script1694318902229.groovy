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

//def randomNumber5 = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

//def randomNumber = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

/*
 def valueDariKeyword = CustomKeywords.'kw.utility.randomNumber.RandomNumbers'()
 
 println('value random 5 dari keyword: ' + valueDariKeyword)
 
 def randomDefinedNumber = CustomKeywords. 'kw.utility.randomNumber.RandomNumberCustom'(6)
 
 println('value random custom defined dari keyword: ' + randomDefinedNumber)
 */

//def email = "username+'+randomDefinedNumber+@gmail.com
//println (email)

//def email_baru = user+123@domain.com

println('original email: '+email_baru)

def modified_email = email_baru.replace('123', randomNumber.toString())

println('new email: '+modified_email)
