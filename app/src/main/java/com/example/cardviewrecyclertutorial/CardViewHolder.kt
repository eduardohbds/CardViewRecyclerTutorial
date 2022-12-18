package com.example.cardviewrecyclertutorial

import androidx.recyclerview.widget.RecyclerView
import com.example.cardviewrecyclertutorial.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: BookClickListener
): RecyclerView.ViewHolder(cardCellBinding.root) {
    fun bindBook(book: Book): Unit {
        cardCellBinding.cover.setImageResource(book.cover)
        cardCellBinding.author.text = book.author
        cardCellBinding.title.text = book.title

        cardCellBinding.cardView.setOnClickListener {
            clickListener.onClick(book)
        }
    }
}