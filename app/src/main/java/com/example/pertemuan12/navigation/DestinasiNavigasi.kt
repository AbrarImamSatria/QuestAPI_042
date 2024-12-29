package com.example.pertemuan12.navigation

interface DestinasiNavigasi {
    val route: String
    val titleRes: String
}

object DestinasiHome : DestinasiNavigasi {
    override val route = "home"
    override val titleRes = "Home"
}

object DestinasiEntry : DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = "Entry Mahasiswa"
}

object DestinasiDetail : DestinasiNavigasi {
    override val route = "item_detail/{nim}"
    override val titleRes = "Detail Mahasiswa"
    const val nimArg = "nim"
}

object DestinasiEdit : DestinasiNavigasi {
    override val route = "item_edit/{nim}"
    override val titleRes = "Edit Mahasiswa"
}