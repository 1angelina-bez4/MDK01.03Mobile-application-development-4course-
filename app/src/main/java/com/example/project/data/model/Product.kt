package com.example.project.data.model

//Вариант 4
//Разработать мобильное приложение для изменения данных о товаре:
//Идентификатор - 48
//Название – Беспроводные наушники SoundWave Pro
//Описание – Наушники с активным шумоподавлением, влагозащитой IPX4 и автономностью до 30 часов работы вместе с кейсом
//Категория – Аудиотехника
//Тэги – Наушники, bluetooth, шумоподавление, беспроводные наушники, гаджеты
//Для редактирования продукта (product) использовать Fake API https://dummyjson.com/. Вывести данные о продукте до и после редактирования.

data class Product(
    val id: Int? = null,
    val title: String,
    val description: String,
    val category: String,
    val tags: List<String>
)
