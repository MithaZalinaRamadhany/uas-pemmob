package id.ac.polbeng.mithazalina.uasmitha

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListViewActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        // Inisialisasi ListView
        listView = findViewById(R.id.listViewData)

        // Data Wisata
        val wisataList = WisataData.listDataWisata

        // Mengatur Adapter
        val adapter = WisataAdapter(this, wisataList)
        listView.adapter = adapter

        // Handle Klik pada Item ListView
        listView.setOnItemClickListener { _, _, position, _ ->
            val wisata = wisataList[position]
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("namaWisata", wisata.nama)
                putExtra("detailWisata", wisata.detail)
                putExtra("gambarWisata", wisata.gambar)
                putExtra("lokasiWisata", wisata.lokasi)
                putExtra("ratingWisata", wisata.rating.toFloat())
                putExtra("ulasanWisata", wisata.ulasan)
            }
            startActivity(intent)
            }
        }
}
