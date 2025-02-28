; Include the necessary libraries
#include <AutoItConstants.au3>
#include <MsgBoxConstants.au3>

; Path to ChromeDriver
Local $sChromeDriver = "C:\path\to\chromedriver.exe"

; Start ChromeDriver
Run($sChromeDriver)

; Wait for ChromeDriver to start
Sleep(2000)

; Open Chrome and navigate to a PDF URL
Local $sURL = "https://example.com/sample.pdf"
Run("chrome.exe " & $sURL)

; Wait for the PDF to load
Sleep(5000)

; Perform actions on the PDF screen (e.g., save as PDF)
Send("^p") ; Open print dialog
Sleep(2000)
Send("{ENTER}") ; Confirm print to PDF
