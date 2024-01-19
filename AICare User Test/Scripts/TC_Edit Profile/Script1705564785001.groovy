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

Mobile.tap(findTestObject('Object Repository/Edit Profile Object/Icon Account'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile Object/Tab Detail Profile'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile Object/Button Edit Profile'), 0)

Mobile.tap(findTestObject('Edit Profile Object/Nama Depan Active clear text'), 0)

Mobile.clearText(findTestObject('Object Repository/Edit Profile Object/Nama Depan Active clear text'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Profile Object/Nama Depan Active set text'), 'Devan', 0)

Mobile.tap(findTestObject('Edit Profile Object/Nama Belakang Active clear text'), 0)

Mobile.clearText(findTestObject('Object Repository/Edit Profile Object/Nama Belakang Active clear text'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Profile Object/Nama Belakang Active set text'), 'aja', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Edit Profile Object/tab jenis kelamin'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile Object/tab perempuan'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile Object/tab hubungan'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile Object/tab ibu'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile Object/tab negara'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile Object/tab lainnya'), 0)

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

Mobile.tap(findTestObject('Object Repository/Edit Profile Object/Tinggi badan clear text'), 0)

Mobile.clearText(findTestObject('Object Repository/Edit Profile Object/Tinggi Badan clear Text (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Profile Object/Tinggi badan set text'), '175', 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile Object/Berat Badan tab'), 0)

Mobile.clearText(findTestObject('Object Repository/Edit Profile Object/tinggi badan clear text (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Profile Object/Berat Badan set text'), '60', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Edit Profile Object/tab goldar'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile Object/goldar b'), 0)

Mobile.tap(findTestObject('Object Repository/Edit Profile Object/Simpan Edit Profile'), 0)

WebUI.delay(3)

Mobile.pressBack()

