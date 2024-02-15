package com.twity.mp23.todoapp

import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.twity.mp23.R

class CategoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvCatogoryName: TextView = view.findViewById(R.id.tvCategoriName)
    private val divider: View = view.findViewById(R.id.divider)

    fun render(taskCatogory: TaskCatogory) {
        when(taskCatogory){
            TaskCatogory.Business -> {
                tvCatogoryName.text = "Negocio"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.todo_business_category))
            }
            TaskCatogory.Other -> {
                tvCatogoryName.text = "Otros"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.todo_other_category))

            }
            TaskCatogory.Personal -> {
                tvCatogoryName.text = "Personal"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.todo_personal_category))

            }
        }
    }
}