package id.ac.polbeng.mithazalina.uasmitha

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.BaseAdapter

class WisataAdapter(private val context: Context, private val wisataList: List<Wisata>) : BaseAdapter() {

    override fun getCount(): Int = wisataList.size

    override fun getItem(position: Int): Any = wisataList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // Inflate layout for the item
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)

        // Bind data
        val wisata = getItem(position) as Wisata
        val imageView: ImageView = view.findViewById(R.id.imageWisata)
        val namaText: TextView = view.findViewById(R.id.itemTitle)
        val lokasiText: TextView = view.findViewById(R.id.itemSubtitle)

        // Set data to views
        imageView.setImageResource(wisata.gambar) // Assuming gambar is a drawable resource ID
        namaText.text = wisata.nama
        lokasiText.text = wisata.lokasi

        return view
        }
}