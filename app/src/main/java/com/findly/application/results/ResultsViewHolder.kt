package com.findly.application.results

import android.view.View
import com.findly.application.GlideApp
import com.findly.application.base.CommonViewHolder
import com.findly.data.service.response.Offers
import kotlinx.android.synthetic.main.item_offer.view.*

/**
 * Created by Wojdor on 20.04.2018.
 */
class ResultsViewHolder(itemView: View) : CommonViewHolder<Offers>(itemView) {

    override fun onClick(event: (position: Int) -> Unit) {
        itemView.setOnClickListener { event(adapterPosition) }
    }

    override fun onBind(model: Offers) {
        GlideApp.with(itemView.itemOfferPhotoIv).load(model.images.component1().url).into(itemView.itemOfferPhotoIv)
        itemView.itemOfferNameTv.text = model.name
        with(model.prices) {
            val price = current?.amount ?: withDelivery?.amount
            val currency = current?.currency ?: withDelivery?.currency
            itemView.itemOfferPriceTv.text = "${price} ${currency}"
        }
    }
}