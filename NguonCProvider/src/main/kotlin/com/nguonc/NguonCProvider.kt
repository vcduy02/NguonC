package com.nguonc

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.TvType

class NguonCProvider : MainAPI() {
    override var name = "Nguonc"
    override var mainUrl = "https://phim.nguonc.com"
    override val supportedTypes = setOf(TvType.Movie)

    override var lang = "vi"

    // Enable this when your provider has a main page
    override val hasMainPage = true

    // This function gets called when you search for something
    override suspend fun search(query: String): List<SearchResponse> {
        return listOf()
    }
}
