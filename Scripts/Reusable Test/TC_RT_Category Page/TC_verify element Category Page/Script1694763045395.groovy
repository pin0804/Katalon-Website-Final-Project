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

WebUI.verifyElementVisible(findTestObject('Homepage/Menu Bar/img - logo Advantages Olshop'))

WebUI.verifyElementVisible(findTestObject('Homepage/Menu Bar/btn_menuCart'))

WebUI.verifyElementVisible(findTestObject('Homepage/Menu Bar/btn_menuHelp'))

WebUI.verifyElementVisible(findTestObject('Homepage/Menu Bar/btn_Sign out_menuSearch'))

WebUI.verifyElementVisible(findTestObject('Homepage/Menu Bar/btn_Sign out_menuUser'))

WebUI.verifyElementVisible(findTestObject('Homepage/Menu Bar/btn_spinner menu'))

WebUI.verifyElementPresent(findTestObject('Category Page/Highlight'), 0)

WebUI.verifyElementVisible(findTestObject('Category Page/btn_HOME'))

WebUI.verifyElementVisible(findTestObject('Category Page/btn_SPEAKERS'))

WebUI.verifyElementVisible(findTestObject('Category Page/txt_category name'))

WebUI.verifyElementVisible(findTestObject('Category Page/txt_h1'))

WebUI.verifyElementVisible(findTestObject('Category Page/txt_h2'))

WebUI.verifyElementVisible(findTestObject('Category Page/txt_h3'))

WebUI.verifyElementVisible(findTestObject('Category Page/filter page'))

WebUI.verifyElementVisible(findTestObject('Category Page/catalog_product'))

WebUI.scrollToElement(findTestObject('Category Page/img_first product'), 0)

WebUI.verifyElementVisible(findTestObject('Category Page/img_first product'))

WebUI.verifyElementVisible(findTestObject('Category Page/txt_name first product'))

WebUI.verifyElementVisible(findTestObject('Category Page/txt_price first product'))

WebUI.verifyElementVisible(findTestObject('Category Page/first_product'))

WebUI.scrollToElement(findTestObject('Category Page/Highlight'), 0)

