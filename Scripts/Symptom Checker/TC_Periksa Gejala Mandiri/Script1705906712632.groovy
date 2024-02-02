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

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/Icon Beranda (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/Tab Symptoms Checker (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/Click Checkbox'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/button Mulai'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/field search tap'), 0)

Mobile.setText(findTestObject('Object Repository/Symptoms Checker/field search set text'), 'sakit', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/tap penyakit (upper)'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/ya 1'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/ya 2'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/ya 3'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/ya 4'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/ya 5'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/tab Kemungkinan Lain'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/tab keterangan'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/button selesai'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/icon sangat baik'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/button selesai (1)'), 0)

Mobile.pressBack()

Mobile.closeApplication()

