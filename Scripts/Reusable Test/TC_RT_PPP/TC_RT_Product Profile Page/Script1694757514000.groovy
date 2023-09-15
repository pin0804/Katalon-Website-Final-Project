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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.verifyElementVisible(findTestObject('Category Page/Product Profile Page/btn_product profile page'))

WebUI.verifyElementVisible(findTestObject('Category Page/Product Profile Page/img_product'))

WebUI.verifyElementVisible(findTestObject('Category Page/Product Profile Page/txt_name product'))

WebUI.verifyElementVisible(findTestObject('Category Page/Product Profile Page/txt_price product'))

WebUI.verifyElementVisible(findTestObject('Category Page/Product Profile Page/txt_desc product'))

WebUI.verifyElementVisible(findTestObject('Category Page/Product Profile Page/txt_color'))

WebUI.verifyElementVisible(findTestObject('Category Page/Product Profile Page/color_picker1'))

WebUI.verifyElementVisible(findTestObject('Category Page/Product Profile Page/txt_quantity'))

WebUI.verifyElementVisible(findTestObject('Category Page/Product Profile Page/btn_quantity_min'))

WebUI.verifyElementVisible(findTestObject('Category Page/Product Profile Page/btn_quantity_plus'))

WebUI.verifyElementVisible(findTestObject('Category Page/Product Profile Page/btn_ADD TO CART'))

