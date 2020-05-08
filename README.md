# sri.soap
projekt na poczet zadnia SOAP z przedmiotu SRI; wykonal s21429
Aby wywolac endpointy nalezy skorzystac z aplikacji SoapUI i wywolac przykladowe requesty 
zapisane w testach 'src/test/java/com/dajevv/soap/' na endpoint'cie: http://localhost:8080/ws
lub wywolac je z command line przy pomocy polecenia (macos)
curl --header "content-type: text/xml" -d @nazwa_requesta.xml http://localhost:8080/ws

Aplikacja umozliwia:
  - zaciagniecie kredytu jesli spelni sie okreslone wymogi
  - sprawdzenie stanu kredytow
  - splacenie raty kredytu
