val intent : Intent = Intent(this,SecondScreen::class.java)

intent.putExtra("userName",editText.text.toString())
Veriyi diğer aktiviteye yollamak için putExtra kullandık.

startActivity(intent)

var username : String? = intent.getStringExtra("userName")
Diğer aktivitiden veriyi çektik.
