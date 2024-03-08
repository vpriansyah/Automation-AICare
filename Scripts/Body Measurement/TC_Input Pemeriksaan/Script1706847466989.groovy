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

Mobile.tap(findTestObject('Object Repository/BMI Object/icon beranda'), 0)

Mobile.tap(findTestObject('Object Repository/BMI Object/Tab BMI'), 0)

Mobile.tap(findTestObject('Object Repository/BMI Object/Click CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/BMI Object/Button Mulai'), 0)

Mobile.tap(findTestObject('Object Repository/BMI Object/Tab input BMI'), 0)

Mobile.tap(findTestObject('Object Repository/BMI Object/Tab Pilih Tanggal'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/BMI Object/Button simpan tanggal'), 0)

Mobile.tap(findTestObject('Object Repository/BMI Object/Tab Pilih waktu'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/BMI Object/Button Simpan waktu'), 0)

Mobile.tap(findTestObject('Object Repository/BMI Object/tap field berat badan'), 0)

Mobile.clearText(findTestObject('Object Repository/BMI Object/clear berat badan'), 0)

Mobile.setText(findTestObject('Object Repository/BMI Object/berat badan set text'), '55', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/BMI Object/tap tinggi badan'), 0)

Mobile.clearText(findTestObject('Object Repository/BMI Object/tinggi badan clear text'), 0)

Mobile.setText(findTestObject('Object Repository/BMI Object/tinggi badan set text'), '170', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/BMI Object/tap lingkar kepala'), 0)

Mobile.clearText(findTestObject('Object Repository/BMI Object/clear text lingkar kepala'), 0)

Mobile.setText(findTestObject('Object Repository/BMI Object/set text lingkar kepala'), '50', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/BMI Object/Button view result'), 0)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Object Repository/BMI Object/Button update data'), 0)

Mobile.tap(findTestObject('Object Repository/BMI Object/Button yes'), 0)

Mobile.pressBack()

Mobile.pressBack()

