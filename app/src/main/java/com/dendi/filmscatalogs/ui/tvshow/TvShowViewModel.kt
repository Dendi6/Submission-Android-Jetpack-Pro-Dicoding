package com.dendi.filmscatalogs.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dendi.filmscatalogs.data.FilmRepository
import com.dendi.filmscatalogs.data.source.local.entity.ListEntity

class TvShowViewModel(private val filmRepository: FilmRepository) : ViewModel() {
    fun getTvShow(): LiveData<List<ListEntity>> = filmRepository.getAllTvShow()
}