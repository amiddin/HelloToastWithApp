package com.example.l3_mop_201853004_201853014_201853036_a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class HalPemesanan : AppCompatActivity() {
    private lateinit var btnCek: Button
    private lateinit var etNomorPemesanan: EditText
    private lateinit var etNamaPemesanan: EditText
    private lateinit var etAlamat: EditText
    private lateinit var rbMakan: RadioButton
    private lateinit var rbBungkus: RadioButton
    private lateinit var cbMakanan: CheckBox
    private lateinit var cbMinuman: CheckBox
    private lateinit var etHarga: EditText
    private lateinit var etJumlah: EditText
    private lateinit var etJumlahTotal: EditText
    private var nomorpemesanan: String = ""
    private var namapemesanan: String = ""
    private var alamat: String = ""
    private var jenispesanan: String =""
    private var makanan: String = ""
    private var minuman: String =""
    private var harga: String = ""
    private  var jumlah: String =""
    private var jumlahtotal: String = ""
    private lateinit var radioButton: RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_pemesanan)

        btnCek = findViewById(R.id.btnCek)
        etNomorPemesanan = findViewById(R.id.etNomorPemesanan)
        etNamaPemesanan = findViewById(R.id.etNamaPemesanan)
        etAlamat = findViewById(R.id.etAlamat)
        rbMakan = findViewById(R.id.rbMakan)
        rbBungkus = findViewById(R.id.rbBungkus)
        cbMakanan = findViewById(R.id.cbMakanan)
        cbMinuman = findViewById(R.id.cbMinuman)
        etHarga = findViewById(R.id.etHarga)
        etJumlah = findViewById(R.id.etJumlah)
        etJumlahTotal = findViewById(R.id.etJumlahTotal)

        btnCek.setOnClickListener {
            nomorpemesanan = etNomorPemesanan.text.toString()
            namapemesanan = etNamaPemesanan.text.toString()
            alamat = etAlamat.text.toString()

            if (rbMakan.isChecked){
                jenispesanan = rbMakan.text.toString();
            }else if(rbBungkus.isChecked){
                jenispesanan = rbBungkus.text.toString()
            }

            if(cbMakanan.isChecked){
                makanan = cbMakanan.text.toString()
            } else{
                makanan = ""
            }

            if (cbMinuman.isChecked){
                minuman = cbMinuman.text.toString()
            } else{
                minuman =""
            }

            harga = etHarga.text.toString()
            jumlah = etJumlah.text.toString()
            jumlahtotal = etJumlahTotal.text.toString()

            Toast.makeText(
                    this@HalPemesanan,
                    "Nomor Pemesanan : $nomorpemesanan \nNama Pemesanan : $namapemesanan \nAlamat Pemesan : $alamat \nJenis Pesanan : $jenispesanan \nMakanan/Minuman : $makanan,$minuman \nJumlah Makanan / Minuman : $jumlah \nHarga Makanan / Minuman : $harga \nJumlah Total : $jumlahtotal",Toast.LENGTH_LONG).show()
        }
    }

}