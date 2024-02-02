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

Mobile.tap(findTestObject('Object Repository/Konsultasi Dokter Object/Icon Beranda'), 0)

Mobile.tap(findTestObject('Object Repository/Konsultasi Dokter Object/tab konsultasi dokter'), 0)

Mobile.tap(findTestObject('Object Repository/Konsultasi Dokter Object/button mulai sekarang'), 0)

Mobile.tap(findTestObject('Object Repository/Konsultasi Dokter Object/button tidak, lanjut konsultasi'), 0)

Mobile.tap(findTestObject('Konsultasi Dokter Object/Click Checkbox'), 0)

Mobile.tap(findTestObject('Konsultasi Dokter Object/Button Mulai'), 0)

Mobile.tap(findTestObject('Konsultasi Dokter Object/field Topik tap'), 0)

Mobile.setText(findTestObject('Konsultasi Dokter Object/field Topik Set text'), 'Sakit Kepala', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Konsultasi Dokter Object/field Pertanyaan Gejala tap'), 0)

Mobile.setText(findTestObject('Konsultasi Dokter Object/field Pertanyaan Gejala set text'), 'Pusing kepala dan Mual', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Konsultasi Dokter Object/Button Kirim Pertanyaan'), 0)

'Waktu konsultasi manual (3 menit)'
Mobile.delay(10800, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Konsultasi Dokter Object/field chat tap'), 0)

Mobile.setText(findTestObject('Konsultasi Dokter Object/chat set text'), 'test', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Konsultasi Dokter Object/icon send'), 0)

Mobile.tap(findTestObject('Konsultasi Dokter Object/tap selesai telekonsultasi'), 0)

Mobile.tap(findTestObject('Konsultasi Dokter Object/Button selesai'), 0)

Mobile.tap(findTestObject('Konsultasi Dokter Object/icon good rating'), 0)

Mobile.tap(findTestObject('Konsultasi Dokter Object/click checkbox Respons cepat'), 0)

Mobile.tap(findTestObject('Konsultasi Dokter Object/click checkbox Ramah'), 0)

Mobile.tap(findTestObject('Konsultasi Dokter Object/click checkbox Penjelasan baik'), 0)

Mobile.tap(findTestObject('Konsultasi Dokter Object/click checkbox anonim'), 0)

Mobile.tap(findTestObject('Konsultasi Dokter Object/Button kirim'), 0)

