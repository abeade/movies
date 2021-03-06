package com.raqun.movie.shows.presentation

import com.raqun.movies.core.presentation.entity.ViewEntity
import com.raqun.movies.core.presentation.recyclerview.DisplayItem

class PopularTvShowViewEntity(
    val id: Int?,
    val name: String?,
    val rating: Number?,
    val picture: String?
) : ViewEntity, DisplayItem {

    override fun type() = PopularTvShowsPresentationConstants.TYPES.SHOW
}