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

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/Icon Beranda'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/Tab Symptoms Checker'), 0)

Mobile.tap(findTestObject('Object Repository/Symptoms Checker/Tab Pilih Profile'), 0)

'Tab Buat Profile'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Create Profile Object/Nama Depan Inactiive'), 0)

Mobile.setText(findTestObject('Object Repository/Create Profile Object/Nama Depan Active'), 'Test', 0)

Mobile.tap(findTestObject('Object Repository/Create Profile Object/Nama Belakang Inactive'), 0)

Mobile.setText(findTestObject('Object Repository/Create Profile Object/Nama Belakang Active'), 'Symptoms', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Create Profile Object/Dropdown Jenis Kelamin'), 0)

Mobile.tap(findTestObject('Object Repository/Create Profile Object/Tab laki laki'), 0)

Mobile.tap(findTestObject('Object Repository/Create Profile Object/Dropdown Hubungan'), 0)

Mobile.tap(findTestObject('Object Repository/Create Profile Object/Tab kakak'), 0)

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

Mobile.tap(findTestObject('Object Repository/Create Profile Object/Field Tinggi badan Inactive'), 0)

Mobile.setText(findTestObject('Object Repository/Create Profile Object/Field Tinggi badan Active'), '170', 0)

Mobile.tap(findTestObject('Object Repository/Create Profile Object/Field Berat badan Inactive'), 0)

Mobile.setText(findTestObject('Object Repository/Create Profile Object/Field Berat badan Active'), '55', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Create Profile Object/Tab Golongan Darah'), 0)

Mobile.tap(findTestObject('Object Repository/Create Profile Object/Goldar AB'), 0)

Mobile.tap(findTestObject('Object Repository/Create Profile Object/Radio Button tidak ada alergi obat'), 0)

Mobile.tap(findTestObject('Object Repository/Create Profile Object/Radio Button tidak ada riwayat penyakit'), 0)

Mobile.tap(findTestObject('Object Repository/Create Profile Object/Button Simpan Profile'), 0)

Mobile.pressBack()

Mobile.pressBack()

