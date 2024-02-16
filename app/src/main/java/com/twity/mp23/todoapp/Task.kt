package com.twity.mp23.todoapp

data class Task(val name:String, val category:TaskCategory, var isSelected:Boolean = false) {
}