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

Mobile.tap(findTestObject('Object Repository/Pengaturan Akun Object/icon akun'), 0)

Mobile.tap(findTestObject('Object Repository/Pengaturan Akun Object/tab pengaturan akun'), 0)

Mobile.tap(findTestObject('Object Repository/Pengaturan Akun Object/tab informasi pribadi'), 0)

Mobile.tap(findTestObject('Object Repository/Pengaturan Akun Object/button ubah informasi pribadi'), 0)

Mobile.tap(findTestObject('Object Repository/Pengaturan Akun Object/tap nama belakang'), 0)

Mobile.clearText(findTestObject('Object Repository/Pengaturan Akun Object/clear text nama belakang'), 0)

Mobile.tap(findTestObject('Object Repository/Pengaturan Akun Object/tap nama belakang (1)'), 0)

Mobile.setText(findTestObject(''), 'Priansyah', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject(''), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Pengaturan Akun Object/button simpan tanggal lahir'), 0)

Mobile.tap(findTestObject('Object Repository/Pengaturan Akun Object/button simpan informasi personal'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

