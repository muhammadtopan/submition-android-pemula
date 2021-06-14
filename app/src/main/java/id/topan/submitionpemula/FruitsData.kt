package id.topan.submitionpemula

object FruitsData {
    private val fruitNames = arrayOf(
        "Alpokat",
        "Apel",
        "Durian",
        "Jambu Biji",
        "Jeruk",
        "Mangga",
        "Buah Naga",
        "Pisang",
        "Rambutan",
        "Semangko")

    private val fruitDetails = arrayOf(
        "Avokad atau Alpukat (Persea americana) ialah tumbuhan penghasil buah meja dengan nama sama. Tumbuhan ini berasal dari Meksiko dan Amerika Tengah dan kini banyak dibudidayakan di Amerika Selatan dan Amerika Tengah sebagai tanaman perkebunan monokultur dan sebagai tanaman pekarangan di daerah-daerah tropika lainnya di dunia.",
        "Apel adalah jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel. Buah apel biasanya berwarna merah kulitnya jika masak dan (siap dimakan), namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek, daging buahnya keras. Buah ini memiliki beberapa biji di dalamnya.",
        "Durian adalah nama tumbuhan tropis yang berasal dari wilayah Asia Tenggara, sekaligus nama buahnya yang bisa dimakan. Nama ini diambil dari ciri khas kulit buahnya yang keras dan berlekuk-lekuk tajam sehingga menyerupai duri. Sebutan populernya adalah \"raja dari segala buah\" (King of Fruit). Durian adalah buah yang kontroversial, meskipun banyak orang yang menyukainya, tetapi sebagian yang lain malah muak dengan aromanya.",
        "Jambu biji (Psidium guajava) atau sering juga disebut jambu batu, jambu siki dan jambu klutuk adalah tanaman tropis yang berasal dari Brasil, disebarkan ke Indonesia melalui Thailand. Jambu batu memiliki buah yang berwarna hijau dengan daging buah berwarna putih atau merah dan berasa asam-manis. Buah jambu batu dikenal mengandung banyak vitamin C.",
        "Jeruk atau limau adalah semua tumbuhan berbunga anggota marga Citrus dari suku Rutaceae (suku jeruk-jerukan). Anggotanya berbentuk pohon dengan buah yang berdaging dengan rasa masam yang segar, meskipun banyak di antara anggotanya yang memiliki rasa manis. Rasa masam berasal dari kandungan asam sitrat yang memang menjadi terkandung pada semua anggotanya.",
        "Mangga berasal dari daerah di sekitar perbatasan India dengan Burma, dan mangga telah menyebar ke Asia Tenggara sekurang-kurangnya semenjak 1500 tahun yang silam. Buah ini dikenal pula dalam berbagai bahasa daerah, seperti pelem atau poh (Jw.)",
        "Buah naga adalah buah dari beberapa jenis kaktus dari marga Hylocereus dan Selenicereus. Buah ini berasal dari Meksiko, Amerika Tengah dan Amerika Selatan namun sekarang juga dibudidayakan di negara-negara Asia seperti Taiwan, Vietnam, Filipina, Indonesia dan Malaysia. Buah ini juga dapat ditemui di Okinawa, Israel, Australia utara dan Tiongkok selatan. Hylocereus hanya mekar pada malam hari.",
        "Pisang adalah nama umum yang diberikan pada tumbuhan terna raksasa berdaun besar memanjang dari suku Musaceae. Beberapa jenisnya (Musa acuminata, M. balbisiana, dan M. ×paradisiaca) menghasilkan buah konsumsi yang dinamakan sama. Buah ini tersusun dalam tandan dengan kelompok-kelompok tersusun menjari yang disebut sisir. Hampir semua buah pisang memiliki kulit berwarna kuning ketika matang, meskipun ada beberapa yang berwarna jingga, merah, hijau, ungu, atau bahkan hampir hitam. Buah pisang sebagai bahan pangan merupakan sumber energi (karbohidrat) dan mineral, terutama kalium.",
        "Rambutan adalah tanaman tropis yang tergolong ke dalam suku lerak-lerakan atau Sapindaceae, berasal dari daerah kepulauan di Asia Tenggara. Kata \"rambutan\" berasal dari bentuk buahnya yang mempunyai kulit menyerupai rambut.",
        "Semangka adalah tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan. Tanaman ini masih sekerabat dengan labu-labuan (Cucurbitaceae), melon (Cucumis melo) dan ketimun (Cucumis sativus). Semangka biasa dipanen buahnya untuk dimakan segar atau dibuat jus. Biji semangka yang dikeringkan dan disangrai juga dapat dimakan isinya (kotiledon) sebagai kuaci.")

    private val fruitImages = intArrayOf(
        R.drawable.pokat,
        R.drawable.apel,
        R.drawable.durian,
        R.drawable.jambu,
        R.drawable.jeruk,
        R.drawable.mangga,
        R.drawable.naga,
        R.drawable.pisang,
        R.drawable.rambutan,
        R.drawable.semangko)

    val listData: ArrayList<Fruit>
        get() {
            val list = arrayListOf<Fruit>()
            for (position in fruitNames.indices) {
                val fruit = Fruit()
                fruit.name = fruitNames[position]
                fruit.detail = fruitDetails[position]
                fruit.photo = fruitImages[position]
                list.add(fruit)
            }
            return list
        }
}