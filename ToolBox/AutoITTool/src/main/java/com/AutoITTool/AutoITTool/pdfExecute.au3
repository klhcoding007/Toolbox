; Include necessary libraries
#include <AutoItConstants.au3>
#include <MsgBoxConstants.au3>

; Wait for the print dialog to appear
WinWaitActive("Print")

; Click the Save as PDF button
Send("{DOWN}") ; Select Save as PDF
Sleep(1000)
Send("{ENTER}") ; Confirm the selection

; Wait for the Save As dialog to appear
WinWaitActive("Save As")

; Enter the file name
Send("C:\path\to\output.pdf")
Sleep(1000)
Send("{ENTER}") ; Save the file
