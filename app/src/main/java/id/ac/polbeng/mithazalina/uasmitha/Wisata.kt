package id.ac.polbeng.mithazalina.uasmitha

import java.io.Serializable

data class Wisata(var nama:String = "",
                  var lokasi:String = "",
                  var detail:String = "",
                  var rating:Double = 0.0,
                  var ulasan:Int = 0,
                  var gambar:Int = 0
): Serializable