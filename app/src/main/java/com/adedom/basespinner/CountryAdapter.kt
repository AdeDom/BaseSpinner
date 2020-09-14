package com.adedom.basespinner

import android.content.Context
import android.view.View
import kotlinx.android.synthetic.main.country_spinner_row.view.*

class CountryAdapter(
    context: Context,
    countryList: MutableList<CountryItem>
) : BaseSpinner<CountryItem>(context, countryList) {

    override fun getLayout(): Int = R.layout.country_spinner_row

    override fun View.onBindViewHolder(data: CountryItem) {
        image_view.setImageResource(data.flagImage)
        text_view.text = data.countryName
    }

}
