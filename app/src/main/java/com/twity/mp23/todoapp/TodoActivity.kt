package com.twity.mp23.todoapp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.twity.mp23.R
import com.twity.mp23.todoapp.TaskCategory.Business
import com.twity.mp23.todoapp.TaskCategory.Personal
import com.twity.mp23.todoapp.TaskCategory.Other

class TodoActivity : AppCompatActivity() {
    private val categories = listOf(
        Business,
        Personal,
        Other
    )

    private val tasks = mutableListOf(
        Task("PruebaBusiness", Business),
        Task("PruebaPersonal", Personal),
        Task("PruebaOther", Other)
    )


    private lateinit var rvCategories: RecyclerView
    private lateinit var rvTasks: RecyclerView
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var taskAdapter: TaskAdapter
    private lateinit var fabAdTask: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        initComponent()
        initUI()
        initListeners()
    }

    private fun initListeners() {
        fabAdTask.setOnClickListener { showDialog() }
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_task)

        val btnAddTask: Button = dialog.findViewById(R.id.btnAddTask)
        val etTask: EditText = dialog.findViewById(R.id.etTask)
        val rgCategories: RadioGroup = dialog.findViewById(R.id.rgCategories)

        btnAddTask.setOnClickListener {
            val currentTask = etTask.text.toString()
            if (currentTask.isNotEmpty()) {
                val selectedID = rgCategories.checkedRadioButtonId
                val selectedRadioButton: RadioButton = rgCategories.findViewById(selectedID)
                val currentCategory: TaskCategory = when (selectedRadioButton.text) {
                    getString(R.string.Todo_Dialog_Category_Business) -> Business
                    getString(R.string.Todo_Dialog_Category_Personal) -> Personal
                    else -> Other
                }
                tasks.add(Task(currentTask, currentCategory))
                updateTasks()
                dialog.hide()

            }
        }


        dialog.show()
    }

    private fun initComponent() {
        rvCategories = findViewById(R.id.rvCategorias)
        rvTasks = findViewById(R.id.rvTasks)
        fabAdTask = findViewById(R.id.fabAddTask)
    }

    private fun initUI() {
        categoryAdapter = CategoryAdapter(categories) {updateCategories(it)}
        rvCategories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoryAdapter
//                               funcion lamda     --V
//        taskAdapter = TaskAdapter(tasks, { onItemSelected(it) })   ---------------V
//        taskAdapter = TaskAdapter(tasks, {position -> onItemSelected(position) }) -----V
        taskAdapter = TaskAdapter(tasks) { position -> onItemSelected(position) }
        rvTasks.layoutManager =
            LinearLayoutManager(this) // solo lleva this porque por default es vertical y no horizontal
        rvTasks.adapter = taskAdapter


    }

    private fun onItemSelected(position: Int) {
        tasks[position].isSelected = !tasks[position].isSelected
        updateTasks()
    }

    private fun updateCategories(position: Int){
        categories[position].isSelected = !categories[position].isSelected
        categoryAdapter.notifyItemChanged(position)
        updateTasks()
    }
    private fun updateTasks() {
        val selectedCategories: List<TaskCategory> = categories.filter { it.isSelected }
        val newTasks = tasks.filter { selectedCategories.contains(it.category) }
        taskAdapter.tasks = newTasks
        taskAdapter.notifyDataSetChanged()
    }
}