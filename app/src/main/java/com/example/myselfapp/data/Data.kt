//tanggal     : 5 juni 2025
//NIM         : 10122342
//Nama        : Tiandry Simatupang
//Kelas       : P ANDRO 4

package com.example.myselfapp.data

import com.example.myselfapp.R

object Data {

    val dataDaily = listOf(
        Daily("Liburan", R.drawable.liburan),
        Daily("Running", R.drawable.runnning),
        Daily("Santai", R.drawable.santai)
    )

    val dataFriend = listOf(
        Friend("Ap", R.drawable.ap),
        Friend("Ryan", R.drawable.ryan),
        Friend("Omo", R.drawable.omo),
        Friend("Farel", R.drawable.farel)
    )

    val dataVideo = listOf(
        Video(
            title = "Extreme Winter Camping in Heavy Snowstorm",
            url = "https://www.youtube.com/watch?v=XKT5oIgg8BE",
            imageUrl = "",
            creatorName = "wild camp"
        ),
        Video(
            title = "Berkemah di Tempat Berlindung di Alam Liar",
            url = "https://www.youtube.com/watch?v=epqASm9gM2g",
            imageUrl = "",
            creatorName = "HK Outdoors"
        )
    )

    val dataMusic = listOf(
        Music(
            name = "Butterfly - Rich Brian",
            imageUrl = "https://th.bing.com/th/id/OIP.JEs11W97-k-4OmdFLreehgHaHa?r=0&rs=1&pid=ImgDetMain",
            url = R.raw.butterfly
        ),
        Music(
            name = "It Ain't over 'Til It's Over - Lenny Kravitz",
            imageUrl = "https://music-box.ro/image/cache/catalog/Products/lenny-kravitz-mary-j-blige-it-aint-over-til-its-over-real-love-vinyl-1100x1100w.jpg",
            url = R.raw.lenny
        )
    )

    val dataGallery = listOf(
        Gallery("https://cdn.pixabay.com/photo/2025/05/19/13/34/girl-9609522_960_720.jpg"),
        Gallery("https://cdn.pixabay.com/photo/2020/09/25/16/50/portrait-5601950_960_720.jpg"),
        Gallery("https://cdn.pixabay.com/photo/2024/02/24/20/48/palais-royal-8594719_960_720.jpg"),
        Gallery("https://cdn.pixabay.com/photo/2020/10/22/16/14/building-5676506_960_720.jpg"),
        Gallery("https://cdn.pixabay.com/photo/2021/06/16/16/14/swans-6341698_960_720.jpg"),
        Gallery("https://cdn.pixabay.com/photo/2025/04/22/09/32/daisy-9549631_960_720.jpg")
    )
}
