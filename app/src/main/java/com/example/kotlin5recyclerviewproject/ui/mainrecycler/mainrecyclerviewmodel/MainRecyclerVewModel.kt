package com.example.kotlin5recyclerviewproject.ui.mainrecycler.mainrecyclerviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlin5recyclerviewproject.ui.data.FilmModel

class MainRecyclerVewModel : ViewModel() {
    val data: MutableLiveData<List<FilmModel>> = MutableLiveData()

    private var endFilmList: ArrayList<FilmModel> = ArrayList()

    fun getEndFilmList() {

        endFilmList.add(
            FilmModel(
                "Загадочная история Бенджамина Баттона",
                "https://movies.k210.org/images/movies/39/posters/original/uDz4QKADtKXaO66D6EnVOt4U3h7.jpg"
            )
        )
        endFilmList.add(
            FilmModel("Американский Снайпер",
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/11ce8f9f-0dd7-4a72-8874-d82ac5f6e87e/300x450"
            )
        )
        endFilmList.add(
            FilmModel("Бродяга",
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1946459/43bfa22a-5338-4937-9066-55108c676e95/300x450"
            )
        )
        endFilmList.add(
            FilmModel("Пульгасари: Бессмертные души",
            "https://doramalive.ru/upload/resize_cache/iblock/658/200_300_1/pulgasari_bessmertnye_dushi_248116.jpg"
            )
        )
        endFilmList.add(
            FilmModel("Схватка",
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/399c6c81-e4af-496f-a93f-75de18d2bcaf/300x450"
            )
        )
        endFilmList.add(
            FilmModel("Побег из Тюрьмы ",
            "https://images.hdqwalls.com/download/michael-scofield-and-lincoln-burrows-in-prison-break-season-5-4k-img-800x1280.jpg"
            )
        )
        endFilmList.add(
            FilmModel("Летопись Трех Царствах",
                "https://avatars.mds.yandex.net/get-kinopoisk-image/4774061/412e5017-1d78-4e3f-aded-051d29fa90ec/300x450"
            )
        )
        endFilmList.add(
            FilmModel("Стрела.Абсолютное Оружие",
                "https://avatars.mds.yandex.net/get-kinopoisk-image/1600647/14891079-d64c-4dcc-ad80-39545286eaf1/300x450"
            )
        )
        data.value = endFilmList
    }
}