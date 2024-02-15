package com.twity.mp23.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.twity.mp23.R

class TodoActivity : AppCompatActivity() {
    private val categories = listOf(
        TaskCatogory.Business,
        TaskCatogory.Personal,
        TaskCatogory.Other
    )

    private val taks = mutableListOf(
        Task("PruebaBusiness", TaskCatogory.Business),
        Task("PruebaPersonal", TaskCatogory.Personal),
        Task("PruebaOther", TaskCatogory.Other)
    )


    private lateinit var rvCategories: RecyclerView
    private lateinit var rvTasks: RecyclerView
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var taskAdapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        initComponent()
        initUI()
    }


    private fun initComponent() {
        rvCategories = findViewById(R.id.rvCategorias)
        rvTasks = findViewById(R.id.rvTasks)
    }

    private fun initUI() {
        categoryAdapter = CategoryAdapter(categories)
        rvCategories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoryAdapter

        taskAdapter = TaskAdapter(taks)
        rvTasks.layoutManager = LinearLayoutManager(this) // solo lleva this porque por default es vertical y no horizontal
        rvTasks.adapter = taskAdapter



    }


}