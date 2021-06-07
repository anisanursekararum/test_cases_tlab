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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.tokopedia.com/login?ld=https://seller.tokopedia.com/home')

WebUI.setText(findTestObject('Object Repository/Page_Masuk  Login  Tokopedia/input_Nomor Ponsel atau Email_email'), 'sarum4292@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Masuk  Login  Tokopedia/button_Selanjutnya'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  Login  Tokopedia/input_Kata Sandi_password'), 'bAi0SHa43iL4ZOza1do2yg==')

WebUI.click(findTestObject('Object Repository/Page_Masuk  Login  Tokopedia/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Verifikasi/div_Melalui                                _98a58c'))

WebUI.setText(findTestObject('Object Repository/Page_Verifikasi/input_--827_otp-number-input-1'), '3')

WebUI.setText(findTestObject('Object Repository/Page_Verifikasi/input_--827_otp-number-input-2'), '6')

WebUI.setText(findTestObject('Object Repository/Page_Verifikasi/input_--827_otp-number-input-3'), '3')

WebUI.setText(findTestObject('Object Repository/Page_Verifikasi/input_--827_otp-number-input-4'), '7')

WebUI.setText(findTestObject('Object Repository/Page_Verifikasi/input_--827_otp-number-input-5'), '2')

WebUI.setText(findTestObject('Object Repository/Page_Verifikasi/input_--827_otp-number-input-6'), '5')

WebUI.click(findTestObject('Object Repository/Page_Seller Dashboard  Tokopedia/span_Cek Apa yang Baru'))

WebUI.click(findTestObject('Object Repository/Page_Seller Dashboard  Tokopedia/div_Lewati'))

WebUI.click(findTestObject('Object Repository/Page_Seller Dashboard  Tokopedia/span_Tambah Produk'))

WebUI.click(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/div_Utama'))

WebUI.setText(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/input_Wajib_css-4eg0ft e16vycsw0'), 'Selai Nutella')

WebUI.click(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/span_Rekomendasi Kategori_css-12tb2l0-unf-r_23cf40'))

WebUI.click(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/label_Pilih Merek'))

WebUI.setText(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/input_Pilih Merek_css-4eg0ft e16vycsw0'), 
    'nute')

WebUI.click(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/button_Nutella'))

WebUI.click(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/div_Ketik nama etalase yang sesuai'))

WebUI.setText(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/textarea_selai enak buat sarapan'), 'selai enak buat sarapan')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/input_Rp_css-4eg0ft e16vycsw0'), '40.000')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/input_Wajib_css-4eg0ft e16vycsw0_1'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/input_Kilogram (kg)_css-4eg0ft e16vycsw0'), 
    '300')

WebUI.click(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/input_Pelajari Berat Volume_length'))

WebUI.setText(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/input_Pelajari Berat Volume_length'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/input_cm_width'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/input_cm_height'), '10')

WebUI.click(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/span_mewajibkan_css-12tb2l0-unf-radio__area_1035fc'))

WebUI.click(findTestObject('Object Repository/Page_Tambah Produk  Tokopedia/span_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan Produk  Tokopedia/div_Atur etalase produkmu di sini, yuk_unf-_ee6d85'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan Produk  Tokopedia/div_Selai NutellaSKU -'))

WebUI.closeBrowser()

